package com.hielsaraiva.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hielsaraiva.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
