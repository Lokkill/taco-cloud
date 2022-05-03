package ru.study.tacocloud.service;

import org.springframework.data.repository.CrudRepository;
import ru.study.tacocloud.data.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

}
