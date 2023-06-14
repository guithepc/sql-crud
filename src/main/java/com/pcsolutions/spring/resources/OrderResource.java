package com.pcsolutions.spring.resources;

import com.pcsolutions.spring.entities.Order;
import com.pcsolutions.spring.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderResource {

    @Autowired
    private OrderService OrderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> OrderList = OrderService.findAll();

        return ResponseEntity.ok().body(OrderList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findByUd(@PathVariable Long id){
        Order Order = OrderService.findById(id);
        return ResponseEntity.ok().body(Order);
    }
}
