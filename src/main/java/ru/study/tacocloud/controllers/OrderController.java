package ru.study.tacocloud.controllers;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import ru.study.tacocloud.data.Order;
import ru.study.tacocloud.data.User;
import ru.study.tacocloud.repositories.OrderRepository;
import ru.study.tacocloud.repositories.UserRepository;

import javax.validation.Valid;
import java.security.Principal;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("order")
@NoArgsConstructor
public class OrderController {

    private OrderRepository orderRepo;
    private UserRepository userRepository;

    @Autowired
    public OrderController(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid Order order, Errors errors, SessionStatus sessionStatus, @AuthenticationPrincipal User user) {

        if (errors.hasErrors()){
            return "orderForm";
        }

        order.setUser(user);
        orderRepo.save(order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
