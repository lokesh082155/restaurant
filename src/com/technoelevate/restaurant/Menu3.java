package com.technoelevate.restaurant;

import java.util.Scanner;

public class Menu3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st[]= {"","1-Panner--150rs","2-Chicken--250","3-mutton--300","4-fish--250","5-Drinks--560"};
		int ar[]= {0,150,250,300,250,560};
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		System.out.println("enter how many items do uu want");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("Enter the items no");
		String str[]=new String[n];
		int arr[]=new int[n];
		for (int i = 0; i <n; i++) {
			
			int items=sc.nextInt();
			sum=sum+ar[items];
			str[i]=st[items];
			arr[i]=ar[items];
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("Total amount is"+sum);
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(st[i]);
//		}
		
	}

}
