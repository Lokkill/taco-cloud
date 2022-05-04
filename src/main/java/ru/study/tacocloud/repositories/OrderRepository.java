package ru.study.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.study.tacocloud.data.Order;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String deliveryZip);

    List<Order> readOrdersByZipAndPlacedAtBetween(String deliveryZip,
                                                          Date startDate,
                                                          Date endDate);

    //List<Order> findByDeliveryToAndCityAllIgnoresCase(String deliveryTo, String deliveryCity);

    //List<Order> findByCityOrderByDeliveryTo(String city);
}
