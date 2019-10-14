package com.flamingo.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.entities.CreditCard;
import com.flamingo.entities.Passenger;
import com.flamingo.entities.UserLogin;

public class PassengerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Passenger p = new Passenger();
		p.setFname("Aditee");
		p.setLname("Chourasiya");
		p.setProfileId(1002);
		p.setAddress("Pune");
		p.setEmailId("aditee.chourasiya30@gmail.com");
		p.setPhoneNo(215313);
		
		CreditCard credit = new CreditCard();
		credit.setCard(1);
		credit.setCardType("Debit");
		credit.setEx_month("02");
		credit.setEx_year("2045");
		
		credit.setProfile(p);
		
		CreditCard credit1 = new CreditCard();
		credit1.setCard(2);
		credit1.setCardType("Credit");
		credit1.setEx_month("03");
		credit1.setEx_year("2023");
		credit1.setProfile(p);
		
		List<CreditCard> cardlist = new ArrayList<CreditCard>();
		cardlist.add(credit);
		cardlist.add(credit1);
		
		
		UserLogin user = new UserLogin();
		user.setUsername("aduu3");
		user.setPassword("Aditee");
		user.setId(2);
		user.setProfileId(p);
		
		s.save(p);
		s.save(credit);
		s.save(credit1);
		s.save(user);
		t.commit();
		s.close();
	}

}
