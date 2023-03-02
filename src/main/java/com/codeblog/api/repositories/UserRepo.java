package com.codeblog.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeblog.api.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
