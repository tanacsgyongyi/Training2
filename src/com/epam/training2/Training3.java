package com.epam.training2;

public class Training3 {

	public static void main(String[] args) {
		System.out.println(calcBorder(1, 2, 3));
	}

	public static int add(int a, int b) {
		int c = a + b;
		return c;

	}

	public static int mul(int a, int b) {
		int c = a * b;
		return c;
	}
	
	public static int calcBorder(int a, int b, int c){
		
		int result=a+b+c;
		return result;
	}
	
	
}
