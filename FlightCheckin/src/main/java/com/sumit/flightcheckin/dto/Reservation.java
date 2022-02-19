package com.sumit.flightcheckin.dto;





public class Reservation {
	int id;
	private boolean chk_in;
	private int no_of_bags;
	private Passenger passenger;
	private Flight flight;
	//private Timestamp created; we will use default time stamp from database

	
	public boolean isChk_in() {
		return chk_in;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setChk_in(boolean chk_in) {
		this.chk_in = chk_in;
	}
	public int getNo_of_bags() {
		return no_of_bags;
	}
	public void setNo_of_bags(int no_of_bags) {
		this.no_of_bags = no_of_bags;
	}
	public Passenger getPid() {
		return passenger;
	}
	public void setPid(Passenger pid) {
		this.passenger = pid;
	}
	public Flight getFid() {
		return flight;
	}
	public void setFid(Flight fid) {
		this.flight = fid;
	}
	
}
