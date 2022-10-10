package com.technoelevate.restaurant;

import java.util.Scanner;

public class Menu1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st[]= {"","Panner--1","Chicken--2","mutton--3","fish--4","Drinks--5"};
		int ar[]= {0,100,150,200,140,500};
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}
		System.out.println("enter how many items");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("Enter the items no");
		int arr[]=new int[n];
		String str[]=new String[n];
		for (int i = 0; i <n; i++) {
			int items=sc.nextInt();
			sum=sum+ar[items];
			str[i]=st[items];
			arr[i]=ar[items];					
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(str[i]+" "+arr[i]);
		}
		System.out.println("total amount="+sum);
		
	}

}
