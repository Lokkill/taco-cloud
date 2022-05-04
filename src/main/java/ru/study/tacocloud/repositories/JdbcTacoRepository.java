package ru.study.tacocloud.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcTacoRepository{

//    private JdbcTemplate jdbc;
//    private SimpleJdbcInsert tacoInsert;
//    private ObjectMapper objectMapper;
//
//
//    public JdbcTacoRepository(JdbcTemplate jdbc) {
//        this.jdbc = jdbc;
//        this.tacoInsert = new SimpleJdbcInsert(jdbc)
//                .withTableName("Taco")
//                .usingGeneratedKeyColumns("id");
//        this.objectMapper = new ObjectMapper();
//    }
//
//    @Override
//    public Taco save(Taco taco) {
//        long tacoId = saveTacoInfo(taco);
//        taco.setId(tacoId);
//        for (String ingredientId : taco.getIngredients()){
//            saveIngredientToTaco(ingredientId, tacoId);
//        }
//        return taco;
//    }
//
//    private void saveIngredientToTaco(String ingredientId, long tacoId) {
//        jdbc.update(
//                "insert into Taco_Ingredients (taco, ingredient) values ( ?, ? )",
//                tacoId, Long.valueOf(ingredientId)
//        );
//    }
//
//    private long saveTacoInfo(Taco taco) {
//        taco.setCreatedAt(new Date());
//        Map<String, Object> values = objectMapper.convertValue(taco, Map.class);
//        values.put("createdAt", taco.getCreatedAt());
//        long tacoId = tacoInsert
//                .executeAndReturnKey(values)
//                .longValue();
//        return tacoId;
//    }
}
