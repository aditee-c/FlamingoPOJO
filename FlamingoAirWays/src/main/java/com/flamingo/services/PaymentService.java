package com.flamingo.services;

import java.util.List;


import com.flamingo.entities.Payment;

/**
 * @author akansh_sai
 * @creation_date 4th oct 2019 9:00pm
 * @modification_date 4th oct 2019 9:00am
 * @version 1.0
 * @copyright Zensar technologies. all rights reserved.
 * @description services by credit card 
 *
 */
public interface PaymentService {
	void AddCard(Payment payment);
	void updateCard(Payment payment);
	void removeCard(Payment payment);
	List<Payment> getAllCards(); 
}
