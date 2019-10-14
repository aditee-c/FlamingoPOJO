package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entities.FlightDetails;
import com.zensar.services.FlightDetailService;

@Controller
public class FlightDetailController {
        @Autowired
	private FlightDetailService flightDetailService;
        
        @GetMapping("/flightdetails")
        public List<FlightDetails> getAllFlightDetails(){
        return flightDetailService.findAllFlightDetails();
  }
        @GetMapping("/flightdetails/{id}")
	public FlightDetails getFlightDetail(@PathVariable("id")int flightId) {
		return flightDetailService.findFlightDetailsByflightId(flightId);
	}
         
        @PostMapping("/flightdetails/add")
	public String add(@RequestBody FlightDetails flightDetail) {
		flightDetailService.addFlightDetails(flightDetail);
		return "new flightDetail" + flightDetail.getFlightId() + "is added successful";
		
	}
    @PutMapping("/product/update")
	public String update(@RequestBody FlightDetails flightDetail) {
		if(flightDetailService.findFlightDetailsByflightId(flightDetail.getFlightId())!=null) {
		flightDetailService.updateFlightDetails(flightDetail);
		return "new flightDetail" + flightDetail.getFlightId() + "is updated successful";
		}
		else {
			return "sorry!Flight not found";
		}
	}
	
	@DeleteMapping("/product/delete")
	public String delete(@RequestBody FlightDetails flightDetail) {
		if(flightDetailService.findFlightDetailsByflightId(flightDetail.getFlightId())!=null) {
		flightDetailService.removeFlightDetails(flightDetail);
		return "new flightDetail" + flightDetail.getFlightId() + "is deleted successful";
		}
		else {
			return "sorry!Flight not found";
		}
	}

}
