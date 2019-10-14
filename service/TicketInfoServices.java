package com.flamingo.service;

import java.util.List;

import com.flamingo.entities.TicketInfo;

public interface TicketInfoServices {

	List<TicketInfo> findAllTicketInfos();

	TicketInfo findTicketInfoById(int ticketId);

	void add(TicketInfo ticketInfo);

	void update(TicketInfo ticketInfo);

	void remove(TicketInfo ticketInfo);

}
