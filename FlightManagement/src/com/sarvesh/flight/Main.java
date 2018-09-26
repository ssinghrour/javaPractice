package com.sarvesh.flight;

public class Main {
	
	public static void main(String[] args) {
		//System.out.println("DEBUG : Running Flight main");
		Flight lax1 = new Flight(150, 100);
		lax1.add1Member();
		lax1.add1Member();
		System.out.println("Passengers on Flight lax1 are: "+lax1.getPassengers());
		Flight lax2 = new Flight(50, 45);
		System.out.println("Before: "+lax2.getPassengers());
		System.out.println(lax1.hasRoom(lax2));
		System.out.println("After: "+lax2.getPassengers());
		System.out.println();
		
		Flight lax3 = null;
	}

}
