package com.mg.week2.ex2;

import java.util.Scanner;

public class UserDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ask user to enter name:");
		String username = sc.next();
		
		System.out.println("Ask user to enter password:");
		String password = sc.next();
		
		User u1 = new User();
		u1.setUserName(username);
		u1.setPassword(password);
		
		System.out.println(u1.getUserName());
		System.out.println(u1.getPassword());
		
		sc.close();
	}

}
