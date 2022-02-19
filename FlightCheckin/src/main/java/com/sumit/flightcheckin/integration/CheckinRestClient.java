package com.sumit.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sumit.flightcheckin.dto.Reservation;
import com.sumit.flightcheckin.dto.ReservationUpdateRequest;

@Component
public class CheckinRestClient implements ReservationRestClient {

	private static final String reservation_rest_url = "http://localhost:8080/Reservations/";
	RestTemplate rest=new RestTemplate();
	//http://localhost:8080/Reservations

	@Override
	public Reservation findReservation(int id) {
		
		Reservation reservation=rest.getForObject(reservation_rest_url+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		Reservation reservation=rest.postForObject(reservation_rest_url,request, Reservation.class);
		return reservation;
	}

}
