package com.technoelevate.training;

public class Accesspecifier {
	public void met1(){
		System.out.println("it is public method");
	}
	private void met2(){
		System.out.println("it is private method");
	}
	protected void met3() {
		System.out.println("it is protected mrthod");
	}
	void met4() {
		System.out.println("it is default method");
	}

	public static void main(String[] args) {
		Accesspecifier a=new Accesspecifier();
		a.met1();
		a.met2();
		a.met3();
		a.met4();
		
		
	}

}
