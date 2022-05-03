package ru.study.tacocloud.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import ru.study.tacocloud.data.Taco;
import ru.study.tacocloud.service.TacoRepository;

import java.util.Date;
import java.util.Map;

@Repository
public class JdbcTacoRepository implements TacoRepository {

    private JdbcTemplate jdbc;
    private SimpleJdbcInsert tacoInsert;
    private ObjectMapper objectMapper;


    public JdbcTacoRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
        this.tacoInsert = new SimpleJdbcInsert(jdbc)
                .withTableName("Taco")
                .usingGeneratedKeyColumns("id");
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public Taco save(Taco taco) {
        long tacoId = saveTacoInfo(taco);
        taco.setId(tacoId);
        for (String ingredientId : taco.getIngredients()){
            saveIngredientToTaco(ingredientId, tacoId);
        }
        return taco;
    }

    private void saveIngredientToTaco(String ingredientId, long tacoId) {
        jdbc.update(
                "insert into Taco_Ingredients (taco, ingredient) values ( ?, ? )",
                tacoId, Long.valueOf(ingredientId)
        );
    }

    private long saveTacoInfo(Taco taco) {
        taco.setCreatedAt(new Date());
        Map<String, Object> values = objectMapper.convertValue(taco, Map.class);
        values.put("createdAt", taco.getCreatedAt());
        long tacoId = tacoInsert
                .executeAndReturnKey(values)
                .longValue();
        return tacoId;
    }
}
