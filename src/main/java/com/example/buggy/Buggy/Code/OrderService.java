package com.example.buggy.Buggy.Code;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class OrderService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private OrderRepository repository;

    public OrderDTO getOrderById(long orderId) {
        Order order = this.repository.findById(orderId).orElseThrow(() -> new ResponseStatusException(
            HttpStatus.NOT_FOUND, "entity not found"
          ));
          return modelMapper.map(order, OrderDTO.class);
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = modelMapper.map(orderDTO, Order.class);
        return modelMapper.map(this.repository.save(order), OrderDTO.class);
    }
}
