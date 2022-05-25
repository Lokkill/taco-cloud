package ru.study.tacocloud.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import ru.study.tacocloud.data.Order;
import ru.study.tacocloud.data.User;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String deliveryZip);

    List<Order> readOrdersByZipAndPlacedAtBetween(String deliveryZip,
                                                          Date startDate,
                                                          Date endDate);

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);

}
