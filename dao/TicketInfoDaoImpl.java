package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.entities.TicketInfo;

public class TicketInfoDaoImpl implements TicketInfoDao {
	private Session session;
	public TicketInfoDaoImpl() 
	{
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		session = f.openSession();		
	}
	@Override
	public List<TicketInfo> getAll() {
		// TODO Auto-generated method stub
		return session.createQuery("from TicketInfo").getResultList();
	}

	@Override
	public TicketInfo getById(int ticketId) {
		// TODO Auto-generated method stub
		return session.get(TicketInfo.class,ticketId);
	}

	@Override
	public void insert(TicketInfo ticketInfo) {
		// TODO Auto-generated method stub
		Transaction t= session.beginTransaction();
		session.save(ticketInfo);
		t.commit();

	}

	@Override
	public void update(TicketInfo ticketInfo) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
	    session.update(ticketInfo);
	    t.commit();
	}

	@Override
	public void delete(TicketInfo ticketInfo) {
		// TODO Auto-generated method stub
		 Transaction t = session.beginTransaction();
		   session.delete(ticketInfo);
		   t.commit();
	}

}
