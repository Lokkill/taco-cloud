package ru.study.tacocloud.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcIngredientRepository {

//    private JdbcTemplate jdbc;
//
//    @Autowired
//    public JdbcIngredientRepository(JdbcTemplate jdbc) {
//        this.jdbc = jdbc;
//    }
//
//    @Override
//    public Iterable<Ingredient> findAll() {
//        return jdbc.query("select id, name, type from Ingredient", this::mapRowToIngredient);
//    }
//
//    @Override
//    public Ingredient findOne(String id) {
//        return jdbc.queryForObject(
//                "select id, name, type from Ingredient where id=?",
//                this::mapRowToIngredient, id
//        );
//    }
//
//    @Override
//    public Ingredient save(Ingredient ingredient) {
//        jdbc.update(
//            "update into Ingredient (id, name, type) value (?, ?, ?)",
//            ingredient.getId(),
//            ingredient.getName(),
//            ingredient.getType().toString()
//        );
//        return ingredient;
//    }
//
//    private Ingredient mapRowToIngredient(ResultSet rs, int rowNumber) throws SQLException {
//        return new Ingredient(
//                rs.getLong("id"),
//                rs.getString("name"),
//                Ingredient.Type.valueOf(rs.getString("type"))
//        );
//    }
}
