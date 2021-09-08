package com.miniProject.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniProject.Entity.Role;

public interface RoleDAO extends JpaRepository<Role, String> {

}
