package com.sumit.flightcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sumit.flightcheckin.dto.Reservation;
import com.sumit.flightcheckin.integration.ReservationRestClient;

@Controller
public class CheckinController {
	 
	@Autowired
	ReservationRestClient rest;
	@GetMapping("/showcheckin")
	public String showCheckin()
	{
		return "showCheckin";
	}
	
	@PostMapping("/startcheckin")
	public String showCheckin(@RequestParam("reservationId") int id,ModelMap map)
	{
		Reservation reservation=rest.findReservation(id);
		
		System.out.println("HIIIIIIIIIIII"+reservation.getFid().getARRIVAL_CITY());
		map.addAttribute("reservation",reservation);
		return "displayreservationdetails";
	}

}
