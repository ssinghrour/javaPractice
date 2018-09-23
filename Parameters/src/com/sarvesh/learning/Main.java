package com.sarvesh.learning;

public class Main {

	public static void main(String[] args) {
		/**
		 * NOTE: Primitive data types are passed by value, this means when a primitive data type is passed
		 * 		 there will a new physical memory allocated to the variable inside the method and this means
		 * 		 the value was passed not the reference(important to remember primitive type do not have reference to begin with)
		 * 				This also means any changes made to the local copy of the variable does not affect the
		 * 		 original variable.
		 */
		int small = 120, large = 220;
		Car maruti = new Car(small);
		Car farari = new Car(large);
		
		maruti.swap(small, large);
		System.out.println("Primitives are passed av value, so modification in the smap method were done on a copy."
				+ "			\nThat means original variables were never modified");
		System.out.printf("Value in variable small is:  %d\n", small);
		System.out.printf("Value in variable large is:  %d", large);
		
		/**
		 * NOTE :: Other variables including classes are passed by reference.
		 * 
		 */
		swapCars(maruti, farari);
		System.out.println("\nThis time the swap method would affect values in car class instances");
		//System.out.println("Primitives are passed av value, so modification in the smap method were done on a copy."
		//		+ "			\nThat means original variables were never modified");
		System.out.printf("Speed of Maruti is:  %d\n", maruti.maxSpeed);
		System.out.printf("Speed of farari is:  %d", farari.maxSpeed);
		
	}
	
	private static void swapCars(Car small, Car large) {
		int temp = small.maxSpeed;
		//the small var here is different then maruti in main, but both point to same maxSpeed. 
		//So the reference is different but they point to same variable in storage. 
		small.maxSpeed = large.maxSpeed;
		large.maxSpeed = temp;
		System.out.printf("\n \nspeed of small car is %d and of large car is %d\n\n", small.maxSpeed, large.maxSpeed);
		//swap complete
	}
	
	

}
