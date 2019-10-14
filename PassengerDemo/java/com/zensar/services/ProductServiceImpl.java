package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import com.zensar.dao.ProductDaoImpl;
import com.zensar.entities.Product;
import com.zensar.entities.ProductDao;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
		 productDao=new ProductDaoImpl();
	}
	@Override
	public List<Product> findallProduct() {
		// TODO Auto-generated method stub
		//List<Product>list=productDao.getAll();
		return productDao.getAll();
	}

	@Override
	public void addproduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insert(product);

	}

	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
       productDao.delete(product);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);

	}

	@Override
	public List<Product> findProductByPriceRange(float min, float max) {
		// TODO Auto-generated method stub
		List<Product>list=productDao.getAll();
		List<Product> list1=new ArrayList();
		for(Product p:list)
		{
			 if(p.getPrice()>=min && p.getPrice()<=max )
			 {
				 list1.add(p);
			 }
		}
		
		return list1;
	}

	@Override
	public List<Product> findProductByName(String name) {
		// TODO Auto-generated method stub
		List<Product>list=productDao.getAll();
		List<Product> list2=new ArrayList();
		for(Product p:list)
		{
			if(p.getName().contains(name))
			 {
				 list2.add(p);
			 }
	}
		return list2;
	}
	@Override
	public List<Product> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product>list=productDao.getAll();
		List<Product> list3=new ArrayList();
		for(Product p:list)
		{
			 if(p.equals(brand) )
			 {
				 list3.add(p);
			 }
	}
		return list3;
	}

	@Override
	public long getProductCount() {
		// TODO Auto-generated method stub
		long count=0;
		List<Product>list=productDao.getAll();
		for(Product p:list)
		{
			count=count+1;		
	}
		
		return count;
	}
	@Override
	public Product findProductsById(int prod_id) {
		// TODO Auto-generated method stub
		return productDao.getById(prod_id);
	}

}
