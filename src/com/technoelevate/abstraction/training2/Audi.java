package com.technoelevate.abstraction.training2;

public class Audi implements Car {

	public static void main(String[] args) {
		
	}

	@Override
	public void brake() {
		System.out.println("Audi brake");
	}

	@Override
	public void accerlation() {
		System.out.println("Audi accerlation");
	}

	@Override
	public void gear() {
		System.out.println("audi gear");
	}

}
