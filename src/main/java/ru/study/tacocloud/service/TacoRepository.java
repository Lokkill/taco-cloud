package ru.study.tacocloud.service;

import org.springframework.data.repository.CrudRepository;
import ru.study.tacocloud.data.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
