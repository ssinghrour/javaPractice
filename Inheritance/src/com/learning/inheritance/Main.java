package com.learning.inheritance;

public class Main {

	public static void main(String[] args) {
		// creating instance of each class
		Flight flight = new Flight();
		CargoFlight cargoflight = new CargoFlight();
		
		// cargo flight can call method of parent class
		cargoflight.add1member();
		
		// Creating reference of cargoflight in flight type 
		Flight mixFlight = new CargoFlight();
		
		// mixFlight can not call cargo flight methods, following call would result in compile time error
		//mixFlight.add1Package();

	}

}
