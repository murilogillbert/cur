package com.curso.cur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.cur.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {


    
}
