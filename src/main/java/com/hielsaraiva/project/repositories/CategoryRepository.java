package com.hielsaraiva.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hielsaraiva.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
