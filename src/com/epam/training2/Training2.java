package com.epam.training2;

public class Training2 {

	public static void main(String[] args) {

		for (int prime = 3; prime < 1000000; prime++) {
			
			boolean isPrime = true;
			for (int tester = 2; tester < prime; tester++) {
				if (prime % tester == 0)
				{
					isPrime=false;
					break;

				}
			}
			
			if (isPrime)
			{
				System.out.println(prime);
			}
		
		}

	}

}