package com.technoelevate.restaurant;

import java.util.Scanner;

public class Menu2 {
	Scanner sc=new Scanner(System.in);
	
	public static void food() {
		String st[]= {"","Panner--1","Chicken--2","mutton--3","fish--4","Drinks--5"};
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
			
		}
		System.out.println("enter the itenms no");
		int number=sc.nextInt();
		Switch(number){
		
	}

	public static void main(String[] args) {
		Menu2.food();
	}

}
