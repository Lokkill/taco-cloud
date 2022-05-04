package ru.study.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.study.tacocloud.data.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
