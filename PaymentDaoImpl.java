package com.flamingo.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

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
@Repository
public class PaymentDaoImpl implements PaymentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insert(Payment payment) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(payment);
	}

	@Override
	public void update(Payment payment) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(payment);
	}

	@Override
	public void delete(Payment payment) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(payment);
	}
	
	
	

}
