package com.workshop.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.course.entities.Order;
import com.workshop.course.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderResource {


    @Autowired
    private OrderService orderService;


    @GetMapping
    public ResponseEntity<List<Order>> findAllOrders(){        
        return ResponseEntity.ok().body(orderService.findAllOrders());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok().body(orderService.findById(id));
    }
}
