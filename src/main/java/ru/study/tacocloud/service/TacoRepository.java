package ru.study.tacocloud.service;

import ru.study.tacocloud.data.Taco;

public interface TacoRepository {

    Taco save(Taco design);
}
