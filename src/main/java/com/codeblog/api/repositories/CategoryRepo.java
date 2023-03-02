package com.codeblog.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeblog.api.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
