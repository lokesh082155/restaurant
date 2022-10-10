package com.technoelevate.abstraction.training2;
import java.util.Scanner;
public class Check {
	public static Car getcar() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the car name");
	    String carname=sc.next();
	    if(carname.equalsIgnoreCase("Audi")) {
	    	return new Audi();
	    }else if(carname.equalsIgnoreCase("Bmw")) {
	    		return new Bmw();
	    	}
		return null;
	}
}
