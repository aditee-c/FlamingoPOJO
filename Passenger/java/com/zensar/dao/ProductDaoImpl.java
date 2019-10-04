package com.zensar.dao;

/**
 * @author CHARAN R
 * @creation date: 4th oct 2019 10:23am
 * @modification date: 4th oct 2019 10:23am
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;
import com.zensar.entities.ProductDao;

public class ProductDaoImpl implements ProductDao {

	private Session session;

	public ProductDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration c = new Configuration().configure();
		SessionFactory fac = c.buildSessionFactory();
		session = fac.openSession();

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return session.createQuery("from Product").getResultList();
	}

	@Override
	public Product getById(int prod_id) {
		// TODO Auto-generated method stub
		return session.get(Product.class,prod_id);
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
          session.save(product);
          t.commit();
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.update(product);
		t.commit();
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
         session.delete(product);
         t.commit();
	}

	

}
