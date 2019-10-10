package com.flamingo.services;

import java.util.List;

import com.flamingo.dao.CreditCardDao;
import com.flamingo.dao.CreditCardDaoImpl;

/**
 * @author akansh_sai
 * @creation_date 4th oct 2019 9:00pm
 * @modification_date 4th oct 2019 9:00am
 * @version 1.0
 * @copyright Zensar technologies. all rights reserved.
 * @description services implementation by credit card 
 *
 */
public class CreditCardServiceImpl implements CreditCardService {
	private CreditCardDao creditCardDao;
	public CreditCardServiceImpl() {
	
		creditCardDao = new CreditCardDaoImpl();
	}
	public void AddCard(com.flamingo.entities.CreditCard creditCard) {
		creditCardDao.insert(creditCard);
		
	}

	public void updateCard(com.flamingo.entities.CreditCard creditCard) {
		creditCardDao.update(creditCard);

	}

	public void removeCard(com.flamingo.entities.CreditCard creditCard) {
		
		creditCardDao.delete(creditCard);
	}

	public List<com.flamingo.entities.CreditCard> getAllCards() {
		
		return creditCardDao.getAll();
	}

}