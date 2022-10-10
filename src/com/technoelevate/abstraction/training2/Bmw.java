package com.technoelevate.abstraction.training2;

import java.util.Scanner;

public class Bmw implements Car {
	public static void main(String[] args) {

	}

	@Override
	public void brake() {
		System.out.println("bmw brake");
	}

	@Override
	public void accerlation() {
		System.out.println("bmw accerlation");
	}

	@Override
	public void gear() {
		System.out.println("bmw gear");
	}

}
