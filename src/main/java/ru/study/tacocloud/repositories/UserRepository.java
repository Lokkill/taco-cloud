package ru.study.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.study.tacocloud.data.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
