package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author risha ansari
 * @creation_date 12 oct 2019 03.40pm
 * @modification_date 12 oct 2019 03.40pm
 * @version 1.0
 * @copyright zensar technologies.all rights reserved
 * @description It is a restful web service to access product entity
 *
 */

import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.TicketInfo;
import com.zensar.services.TicketInfoServices;



@RestController
public class TicketInfoController {
	@Autowired
	private TicketInfoServices ticketInfoService;
	@GetMapping("/tickets")
	public List<TicketInfo> getAllTickets(){
		
		return ticketInfoService.findAllTicketInfos();
		
	}
	@GetMapping("/tickets/{id}")
	public TicketInfo getTicket(@PathVariable("id")int ticketId)
	{
		return ticketInfoService.findTicketInfoById(ticketId);
		
	}
	@PostMapping("/tickets/add")
	public String addTicket(@PathVariable("id")TicketInfo ticketId)
	{
		ticketInfoService.add(ticketId);
		return "new ticket is added" +ticketId.getTicketId(); 
	}
	@PostMapping("/tickets/add1")
	public String addTicket(@RequestParam("id")int ticketId,@RequestParam("name")String name,@RequestParam("brand")String brand,@RequestParam("price")float price) {
		TicketInfo ticketInfo=new TicketInfo();
		ticketInfoService.add(ticketInfo);
		return "new ticket is added successfully";
	}
	@PutMapping("tickets/update")
	public String update(@RequestBody TicketInfo ticketInfo) 
	{
		if(ticketInfoService.findTicketInfoById(ticketInfo.getTicketId())!=null)
				{
			ticketInfoService.update(ticketInfo);
		return "ticket is updated successfully" +ticketInfo.getTicketId();
		
	}
		else {
			return "sorry ticket not found";
		}	

}
	@DeleteMapping("tickets/delete")
	public String delete(@RequestBody TicketInfo ticketInfo) 
	{
		if(ticketInfoService.findTicketInfoById(ticketInfo.getTicketId())!=null)
				{
			ticketInfoService.remove(ticketInfo);
		return "ticket is deleted successfully";
		
	}
		else {
			return "sorry ticket not found";
		}	

}
}