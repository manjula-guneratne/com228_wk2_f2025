package com.mg.week2.ex3;

import java.util.Scanner;

/**
 * @author Vivek Ahuja
 * @since 2025-09-10
 * Collect input values for principal, rate, and time.
 * Calculate the simple interest using the formula.
 */

public class SIExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		double principal = scan.nextDouble();
		
		System.out.println("Enter the rate of interest per annum (as %):");
		double rate = scan.nextDouble();
		rate = rate/100; // get rate to decimal notation.
		
		System.out.println("Enter the time in years:");
		double time = scan.nextDouble();
		
		double simpInt = principal * time * rate;
		
		System.out.printf("The simple interest is: %.2f\n",simpInt);
		
		System.out.printf("The Total is: %.2f\n",(simpInt+principal));
		
		scan.close();
	}

}
