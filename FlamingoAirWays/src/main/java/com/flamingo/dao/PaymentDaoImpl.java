package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.entities.CreditCard;
/**
 * @author akansh_sai
 * @creation_date 4th oct 2019 9:00pm
 * @modification_date 4th oct 2019 9:00am
 * @version 1.0
 * @copyright Zensar technologies. all rights reserved.
 * @description dao implementation
 *
 */
public class CreditCardDaoImpl implements CreditCardDao {
	private Session s;
	public CreditCardDaoImpl() {
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		s=sf.openSession();
	}
	public void insert(CreditCard creditCard) {
		Transaction t = s.beginTransaction();
		s.save(creditCard);
		t.commit();

	}

	public void update(CreditCard creditCard) {
	Transaction t = s.beginTransaction();
	s.update(creditCard);
	t.commit();

	}

	public void delete(CreditCard creditCard) {
		Transaction t = s.beginTransaction();
		s.delete(creditCard);
		t.commit();

	}

	public List<CreditCard> getAll() {
		
		 return s.createQuery("from CreditCard").getResultList();
	}

}
