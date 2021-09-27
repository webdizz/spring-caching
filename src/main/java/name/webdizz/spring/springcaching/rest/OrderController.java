package name.webdizz.spring.springcaching.rest;

import name.webdizz.spring.springcaching.domain.Order;
import name.webdizz.spring.springcaching.domain.mapper.OrderMapper;
import name.webdizz.spring.springcaching.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private OrderRepository orderRepository;
    
    private OrderMapper orderMapper;

    @Autowired
    public OrderController(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    @GetMapping("/order/{orderId}")
    public Order findOrder(@PathVariable("orderId") Long orderId) {
        return orderMapper.toDto(orderRepository.getOne(orderId));
    }
}
