package com.shristi.basicscanner;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String[] usernames = {"Harshita", "Amrit", "Prabal", "Chandan"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to register: ");
		String name = sc.nextLine();
		
		boolean temp = true;
		for(String username: usernames) {
			if(username.equalsIgnoreCase(name)) {
				temp = false;
				break;
			}
		}
		if(temp)
			System.out.println("You are registered");
		else
			System.out.println("Already registered");

	}

}
