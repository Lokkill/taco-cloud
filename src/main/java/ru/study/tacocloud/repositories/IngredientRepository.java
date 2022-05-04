package ru.study.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.study.tacocloud.data.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
