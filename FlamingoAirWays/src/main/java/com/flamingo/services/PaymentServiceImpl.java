package com.flamingo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flamingo.dao.PaymentDao;
import com.flamingo.entities.Passenger;
import com.flamingo.entities.Payment;

/**
 * @author akansh_sai
 * @creation_date 4th oct 2019 9:00pm
 * @modification_date 4th oct 2019 9:00pm
 * @version 1.0
 * @copyright Zensar technologies. all rights reserved.
 * @description services implementation by payment 
 *
 */
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentDao paymentDao;
	
	public void AddCard(Payment payment) {
		paymentDao.insert(payment);
		
	}

	public void updateCard(Payment payment) {
		paymentDao.update(payment);

	}

	public void removeCard(Payment payment) {
		
		paymentDao.delete(payment);
	}

	@Override
	public Passenger findPassengerById(int id) {
		// TODO Auto-generated method stub
		return paymentDao.getById(id);
	}

	
	
	
}