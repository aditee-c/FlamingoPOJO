package com.flamingo.dao;

import com.flamingo.entities.Passenger;
import com.flamingo.entities.Payment;


/**
 * @author akansh_sai
 * @creation_date 4th oct 2019 9:00pm
 * @modification_date 4th oct 2019 9:00am
 * @version 1.0
 * @copyright Zensar technologies. all rights reserved.
 * @description dao interface using persistence layer
 *
 */
public interface PaymentDao {
void insert(Payment payment);
void update(Payment payment);
void delete(Payment payment);
Passenger getById(int id);
 
}