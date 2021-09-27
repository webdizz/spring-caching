package name.webdizz.spring.springcaching.rest;

import name.webdizz.spring.springcaching.domain.Order;
import name.webdizz.spring.springcaching.domain.mapper.OrderMapper;
import name.webdizz.spring.springcaching.repository.OrderRepository;
import name.webdizz.spring.springcaching.service.ComplexComputingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private OrderRepository orderRepository;

    private OrderMapper orderMapper;

    private ComplexComputingService complexComputingService;

    @Autowired
    public OrderController(OrderRepository orderRepository, OrderMapper orderMapper, ComplexComputingService complexComputingService) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
        this.complexComputingService = complexComputingService;
    }

    @GetMapping("/order/{orderId}")
    public Order findOrder(@PathVariable("orderId") Long orderId) {
        complexComputingService.compute();
        return orderMapper.map(orderRepository.getOne(orderId));
    }

    @GetMapping("/product/{productId}/orders")
    public List<Order> findOrdersForProduct(@PathVariable("productId") Long productId) {
        complexComputingService.compute();
        return orderMapper.map(orderRepository.findByItemsProductId(productId));
    }

}
