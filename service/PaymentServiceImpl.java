package com.flamingo.service;

import java.util.List;


import com.flamingo.dao.PaymentDao;
import com.flamingo.dao.PaymentDaoImpl;
import com.flamingo.entities.Payment;

/**
 * @author akansh_sai
 * @creation_date 4th oct 2019 9:00pm
 * @modification_date 4th oct 2019 9:00am
 * @version 1.0
 * @copyright Zensar technologies. all rights reserved.
 * @description services implementation by credit card 
 *
 */
public class PaymentServiceImpl implements PaymentService {
	private PaymentDao paymentDao;
	public PaymentServiceImpl() {
	
		paymentDao = new PaymentDaoImpl();
	}
	public void AddCard(Payment payment) {
		paymentDao.insert(payment);
		
	}

	public void updateCard(Payment payment) {
		paymentDao.update(payment);

	}

	public void removeCard(Payment payment) {
		
		paymentDao.delete(payment);
	}

	public List<Payment> getAllCards() {
		
		return paymentDao.getAll();
	}
	
}