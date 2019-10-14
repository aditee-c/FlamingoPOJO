package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.flamingo.entities.Payment;
/**
 * @author akansh_sai
 * @creation_date 4th oct 2019 9:00pm
 * @modification_date 4th oct 2019 9:00am
 * @version 1.0
 * @copyright Zensar technologies. all rights reserved.
 * @description dao implementation
 *
 */
public class PaymentDaoImpl implements PaymentDao {
	private Session s;
	public PaymentDaoImpl() {
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		s=sf.openSession();
	}
	public void insert(Payment payment) {
		Transaction t = s.beginTransaction();
		s.save(payment);
		t.commit();

	}

	public void update(Payment payment) {
	Transaction t = s.beginTransaction();
	s.update(payment);
	t.commit();

	}

	public void delete(Payment payment) {
		Transaction t = s.beginTransaction();
		s.delete(payment);
		t.commit();

	}

	public List<Payment> getAll() {
		
		 return s.createQuery("from Payment").getResultList();
	}

}
