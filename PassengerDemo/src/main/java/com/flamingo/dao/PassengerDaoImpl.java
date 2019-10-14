package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.flamingo.entities.Passenger;
import com.flamingo.entities.PassengerDao;
/**
 * @author CHARAN R
 * @creation date: 4th oct 2019 10:23am
 * @modification date: 4th oct 2019 10:23am
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */
@Repository
public class PassengerDaoImpl implements PassengerDao {


		@Autowired
		private HibernateTemplate hibernateTemplate;
		
		@Override
		public List<Passenger> getAll() {
			// TODO Auto-generated method stub
			return (List<Passenger>) hibernateTemplate.find("from Passenger");
		}

		@Override
		public Passenger getById(int PassengerId) {
			// TODO Auto-generated method stub
			return hibernateTemplate.get(Passenger.class, PassengerId);
		}

		@Override
		public void insert(Passenger Passenger) {
			// TODO Auto-generated method stub
			hibernateTemplate.save(Passenger);
		}

		@Override
		public void update(Passenger Passenger) {
			// TODO Auto-generated method stub
			hibernateTemplate.update(Passenger);
		}

		@Override
		public void delete(Passenger Passenger) {
			// TODO Auto-generated method stub
			hibernateTemplate.delete(Passenger);
		}

		
}
