package com.flamingo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flamingo.entities.Payment;
import com.flamingo.services.PaymentService;



/**
 * @author akansh_sai
 * @creation_ date 12th oct 2019 9:00pm
 * @modification_ date 12th oct 2019 9:00pm
 * @version 1.0
 * @copyright Zensar technologies. all rights reserved.
 * @description controller implementation by payment 
 *
 */
@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	
	@PostMapping("/addpaymentmethod")
	public String addPayment(@RequestBody Payment payment) {
		paymentService.AddCard(payment);
		return "card added of user";
	}
	
	@PostMapping("/addproduct")
	public String addPayment(@RequestParam("id")int profileid,@RequestParam("card")int cardNumber,@RequestParam("cardtype")String cardType,@RequestParam("ex_month")int ex_month,@RequestParam("ex_year")int ex_year ) {
		Payment payment = new Payment(profileid,cardNumber,cardType, ex_month,ex_year);
		paymentService.AddCard(payment);
		return "new payment method added successfully";
	}
	
	
	@PutMapping("/updatepayment")
	public String updatePayment(@RequestBody Payment payment) {
		
		if(paymentService.findPassengerById(payment.getId())!=null) 
		{
			paymentService.updateCard(payment);
			return "product is updated ";
		}
		else {
			return "product not found";
		}
		
		
	}
	@DeleteMapping("/deletepayementmethod")
	public String delete(@RequestBody Payment payment) {
		if(paymentService.findPassengerById(payment.getId())!=null) {
			paymentService.removeCard(payment);
			return "product is deleted ";//+payment.getProductId();
		}
		else {
			return "product not found";
		}
	}
}
