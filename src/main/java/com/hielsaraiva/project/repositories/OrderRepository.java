package com.hielsaraiva.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hielsaraiva.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
