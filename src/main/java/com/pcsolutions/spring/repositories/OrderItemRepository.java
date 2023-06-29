package com.pcsolutions.spring.repositories;

import com.pcsolutions.spring.entities.OrderItem;
import com.pcsolutions.spring.entities.User;
import com.pcsolutions.spring.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
