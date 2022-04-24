package ru.study.tacocloud.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Taco {
    private String id;
    private String name;
}
