package com.zensar.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.TicketInfoDao;

import com.zensar.entities.TicketInfo;

@Service
@Transactional
public class TicketInfoServicesImpl implements TicketInfoServices {
	private TicketInfoDao ticketInfoDao;
	@Override
	public List<TicketInfo> findAllTicketInfos() {
		List<TicketInfo> product =(List<TicketInfo>) new TicketInfo();
		return product;
	}

	@Override
	public TicketInfo findTicketInfoById(int ticketId) {
		List<TicketInfo> ticketInfo =(List<TicketInfo>) new TicketInfo();
		return (TicketInfo) ticketInfo;
		
	}

	@Override
	public void add(TicketInfo ticketInfo) {
		ticketInfoDao.insert(ticketInfo);
		
	}

	@Override
	public void update(TicketInfo ticketInfo) {
		ticketInfoDao.update(ticketInfo);
	}
		
	

	@Override
	public void remove(TicketInfo ticketInfo) {
		ticketInfoDao.delete(ticketInfo);
		
	}
}