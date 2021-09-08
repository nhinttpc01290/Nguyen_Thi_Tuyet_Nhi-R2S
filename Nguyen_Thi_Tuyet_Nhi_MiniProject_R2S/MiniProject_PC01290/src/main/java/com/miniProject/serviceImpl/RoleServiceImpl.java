package com.miniProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniProject.DAO.RoleDAO;
import com.miniProject.Entity.Role;
import com.miniProject.Service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleDAO dao; 
	
	@Override
	public List<Role> finfAll() {
		return dao.findAll();
	}

}
