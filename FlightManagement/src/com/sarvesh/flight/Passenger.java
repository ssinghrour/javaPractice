package com.sarvesh.flight;

public class Passenger {
	
	public int freeBags, checkedBags;
	public double perBagFee;
	
	public Passenger() {
		
	}
	
	public Passenger(int freeBags) {
		this(freeBags > 1 ? 25.0d :50.0d);
		this.freeBags = freeBags;
	}
	
	public Passenger(int freeBags, int checkedBags) {
		this(freeBags);
		this.checkedBags = checkedBags;
	}
	
	private Passenger(double perBagFee) {
		this.perBagFee = perBagFee;
	}

}
