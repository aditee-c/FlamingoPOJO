package com.flamingo.dao;

import java.util.List;

import com.flamingo.entities.CreditCard;


/**
 * @author akansh_sai
 * @creation_date 4th oct 2019 9:00pm
 * @modification_date 4th oct 2019 9:00am
 * @version 1.0
 * @copyright Zensar technologies. all rights reserved.
 * @description dao interface using persistence layer
 *
 */
public interface CreditCardDao {
void insert(CreditCard creditCard);
void update(CreditCard creditCard);
void delete(CreditCard creditCard);
List<CreditCard> getAll(); 
}
