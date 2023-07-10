package com.shristi.basicscanner;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] usernames = {"Harshita", "Amrit", "Prabal", "Chandan"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username to login: ");
		String name = sc.nextLine();
		
		boolean temp = false;
		for(String username: usernames) {
			if(username.equalsIgnoreCase(name)) {
				temp = true;
				break;
			}
		}
		if(temp)
			System.out.println("You are logged in successfully");
		else
			System.out.println("Invalid username");

	}

}
