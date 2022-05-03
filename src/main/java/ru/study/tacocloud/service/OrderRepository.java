package ru.study.tacocloud.service;

import ru.study.tacocloud.data.Order;

public interface OrderRepository {
    Order save(Order order);
}
