package com.miniProject.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniProject.Entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{

}
