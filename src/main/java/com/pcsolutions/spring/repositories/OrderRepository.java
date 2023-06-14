package com.pcsolutions.spring.repositories;

import com.pcsolutions.spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
