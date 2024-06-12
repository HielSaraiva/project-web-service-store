package com.hielsaraiva.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hielsaraiva.project.entities.OrderItem;
import com.hielsaraiva.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
