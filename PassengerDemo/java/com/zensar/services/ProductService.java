package com.zensar.services;

import java.util.List;

import com.zensar.entities.Product;

public interface ProductService {

	List<Product> findallProduct();
	
	Product findProductsById(int prod_id);

	void addproduct(Product product);
	
	void removeProduct(Product product);
	
	void updateProduct(Product product);

	List<Product> findProductByPriceRange(float min, float max);

	List<Product> findProductByName(String name);

	List<Product> findProductByBrand(String brand);

	long getProductCount();

}
