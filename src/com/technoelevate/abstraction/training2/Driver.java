package com.technoelevate.abstraction.training2;

public class Driver {

	public static void main(String[] args) {
		Car car=Check.getcar();
		Drivers1 d=new Drivers1();	
		d.drive(car);
		
	}

}
