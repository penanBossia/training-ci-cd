package com.training.springboot.datas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springboot.datas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    long count();
}
