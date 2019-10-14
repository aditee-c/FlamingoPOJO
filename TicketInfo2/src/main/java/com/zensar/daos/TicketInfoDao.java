package com.zensar.daos;
import java.util.List;
import com.zensar.entities.TicketInfo;

/**
 * @author Risha Ansari
 * @creation_date 4 oct 2019 07:10pm
 * @modification_date 4 oct 2019 07:10pm
 * @version 2.0
 * @copyright Zensar technologies. All rights reserved
 * @description It is persistent class
 * 				It represents database table TicketInfo.
 * 				It is POJO class
 *
 */

public interface TicketInfoDao
{
	List<TicketInfo> getAll();
	TicketInfo getById(int ticketId);
	void insert(TicketInfo ticket);
	void update(TicketInfo ticket);
	void delete(TicketInfo ticket);
}
