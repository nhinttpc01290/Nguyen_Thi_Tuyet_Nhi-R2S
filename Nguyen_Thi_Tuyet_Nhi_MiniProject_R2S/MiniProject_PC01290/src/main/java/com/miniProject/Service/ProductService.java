package com.miniProject.Service;

import java.util.List;

import com.miniProject.Entity.Product;

public interface ProductService {
	
	 List<Product> findAll() ;

	 Product findById(Integer id);

     List<Product> findByCategoryId(String cid);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);
		

}
