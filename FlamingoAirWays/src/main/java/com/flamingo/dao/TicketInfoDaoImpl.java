package com.flamingo.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.flamingo.entities.TicketInfo;
/**
 * @author Risha Ansari
 * @creation_date 4 oct 2019 07:20pm
 * @modification_date 4 oct 2019 07:20pm
 * @version 2.0
 * @copyright Zensar technologies. All rights reserved
 * @description It is persistent class
 * 				It represents database table TicketInfo.
 * 				It is POJO class
 *
 */
@Repository
public class TicketInfoDaoImpl implements TicketInfoDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public List<TicketInfo> getAll() 
	{
		return (List<TicketInfo>) hibernateTemplate.find("from Ticketinfo");
	
	}

	@Override
	public TicketInfo getById(int ticketId) {
		return hibernateTemplate.get(TicketInfo.class, ticketId);
		
	}

	@Override
	public void insert(TicketInfo ticketInfo) {
		hibernateTemplate.save(ticketInfo);
	}

	@Override
	public void update(TicketInfo ticketInfo) {
		hibernateTemplate.update(ticketInfo);
		
	}

	@Override
	public void delete(TicketInfo ticketInfo) {
		hibernateTemplate.delete(ticketInfo);
		
	}

}