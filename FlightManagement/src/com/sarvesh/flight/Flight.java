package com.sarvesh.flight;

public class Flight {

	private int passengers;
	private int seats;
	
	public Flight() {
		/* this.seats = 150;
		this.passengers = 0; */
		this(150, 0);
	}
	
	public Flight(int seats, int passengers) {
		this.seats = seats;
		this.passengers = passengers;
	}

	public int getPassengers() {
		return this.passengers;
	}
	
	public void add1Member() {
		if(this.seats > this.passengers)
			this.passengers++;
		else
			handleTooMany();
	}
	
	private void handleTooMany() {
		System.out.println("Too many passengers");
	}
	
	public boolean hasRoom(Flight otherFlight) {
		System.out.println("Number of passengers in passed flight: "+otherFlight.getPassengers());
		otherFlight.add1Member();
		System.out.println("Number of passengers in passed flight after: "+otherFlight.getPassengers());
		return (otherFlight.passengers + this.passengers) <= this.seats;
	}
	
	public Flight createNewWithBoth(Flight otherFlight) {
		Flight newFlight = new Flight();
		newFlight.seats = this.seats;
		newFlight.passengers = this.passengers + otherFlight.passengers;
		return newFlight;
	}
}
