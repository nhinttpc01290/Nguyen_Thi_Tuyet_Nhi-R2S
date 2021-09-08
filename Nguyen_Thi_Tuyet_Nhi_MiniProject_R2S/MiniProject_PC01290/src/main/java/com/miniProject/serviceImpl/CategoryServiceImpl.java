package com.miniProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniProject.DAO.CategoryDAO;
//
//import com.miniProject.DAO.CategoryDAO;
import com.miniProject.Entity.Category;
import com.miniProject.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDAO cdao;

	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}	

}
