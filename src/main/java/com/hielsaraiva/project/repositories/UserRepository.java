package com.hielsaraiva.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hielsaraiva.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
