/**
 * 
 */
package com.sarvesh.learning;

/**
 * @author ssinghrour
 *
 */
public class Flight {
	private int seats, passenges;
	private String flightName;
	
	private Flight() {
		System.out.println("DEBUG :: Constructor without any parameter called");
	}
	
	public Flight(String flightName) {
		this();
		System.out.println("DEBUG :: Constructor with 1 parameter called");
		this.flightName = flightName;
	}
	
	public Flight(String flightName, int seats) {
		this(flightName);
		System.out.println("DEBUG :: Constructor with 2 parameters called");
		this.seats = seats;
	}
	
	public Flight(String flightName, int seats, int passengers) {
		this(flightName, seats);
		System.out.println("DEBUG :: Constructor with 3 parameters called");
		this.passenges = passengers;
	}
	//First initialization block, I will be called before any external constructor call
	{
		System.out.println("DEBUG :: First Initialization block called");
	}
	//Second initialization block, I will also be called before any external constructor call but always after first initialization block
	{
		System.out.println("DEBUG :: Second Initialization block called");
	}
}
