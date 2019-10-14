package com.flamingo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flamingo.dao.TicketInfoDao;

import com.flamingo.entities.TicketInfo;
@Service
@Transactional
public class TicketInfoServicesImpl implements TicketInfoServices {
	@Autowired
	private TicketInfoDao ticketInfoDao;
	
	@Override
	public List<TicketInfo> findAllTicketInfos() {
		// TODO Auto-generated method stub
		return ticketInfoDao.getAll();
	}

	@Override
	public TicketInfo findTicketInfoById(int ticketId) {
		// TODO Auto-generated method stub
		return ticketInfoDao.getById(ticketId);
	}

	@Override
	public void add(TicketInfo ticketInfo) {
		// TODO Auto-generated method stub
		ticketInfoDao.insert(ticketInfo);
	}

	@Override
	public void update(TicketInfo ticketInfo) {
		// TODO Auto-generated method stub
		ticketInfoDao.update(ticketInfo);
	}

	@Override
	public void remove(TicketInfo ticketInfo) {
		// TODO Auto-generated method stub
		ticketInfoDao.delete(ticketInfo);
	}

}
