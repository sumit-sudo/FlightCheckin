package com.sumit.flightcheckin.integration;

import com.sumit.flightcheckin.dto.Reservation;
import com.sumit.flightcheckin.dto.ReservationUpdateRequest;

/*
 * Interfaces inside integration package is responsible for calling restful web services.
 * In this micro service ( i.e flightCheckin ), we only added started web dependency not sql/jpa as we will be
 * consuming FlightReservation micro service from this.
 * 
 * 
 * 
 * 
 */

public interface ReservationRestClient {

	public Reservation findReservation(int id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
