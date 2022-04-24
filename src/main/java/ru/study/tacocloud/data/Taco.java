package ru.study.tacocloud.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;


@Data
@RequiredArgsConstructor
public class Taco {
    private String name;
    private List ingredients;
}
