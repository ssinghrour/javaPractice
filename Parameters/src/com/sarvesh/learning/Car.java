package com.sarvesh.learning;

public class Car {
	public int maxSpeed = 0;
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void swap(int small, int large) {
		int temp = small;
		small = large;
		large = temp;
		System.out.printf("Value of small is %d and of large is %d\n\n", small, large);
		//swap complete
	}
}
