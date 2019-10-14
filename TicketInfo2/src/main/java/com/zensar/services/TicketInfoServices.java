package com.zensar.services;
	import java.util.List;

import com.zensar.entities.TicketInfo;

/**
 * @author Risha Ansari
 * @creation_date 4 oct 2019 8.00pm
 * @modification_date  4 oct 2019 8.00pm
 * @version 2.0
 * @copyright Zensar technologies. All rights reserved
 * @description It is persistent class
 * 				It represents database table PRODUCT
 * 				It is POJO class
 *
 */

	public interface TicketInfoServices {
	
		List<TicketInfo> findAllTicketInfos();
		TicketInfo findTicketInfoById(int ticketId);
		void add(TicketInfo ticketInfo);
		void update(TicketInfo ticketInfo);
		void remove(TicketInfo ticketInfo);
		
	}


