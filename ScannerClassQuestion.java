package com.shristi.basicscanner;

import java.util.Scanner;

public class ScannerClassQuestion {

	public static void main(String[] args) {
		
		// Greatest among three
		
		/* int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		x = sc.nextInt();
		System.out.println("Enter the second number");
		y = sc.nextInt();
		System.out.println("Enter the third number");
		z = sc.nextInt();
		int result = ( x > y ) ?  (x > z ? x : z) :  (y > z ? y : z);
		System.out.println("Largest number is " + result); */

		//Question 2nd Smallest among three by using AND
		
		/* int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		x = sc.nextInt();
		System.out.println("Enter the second number");
		y = sc.nextInt();
		System.out.println("Enter the third number");
		z = sc.nextInt();
		if(x < y && x < z)
			System.out.println("x is smallest");
		else if(y < x && y < z)
			System.out.println("y is smallest");
		else if(z < x && z < y)
			System.out.println("z iz smallest");
		else
			System.out.println("Numbers are equal"); */
		
		//Question 3rd Even no. from 1 to 20
		
		/*for(int i = 1;i<20;i++) {
			if(i%2 == 0)
				System.out.println(i);
			*/
		
		//Question 4th Sum and Average
		
		/* int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements in an array");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of all the digits of array is " + sum);
		System.out.println("Average of all the digits is " + sum/arr.length); */
		
		//question 5th square root
		
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		double squareroot[] = new double[size];
		System.out.println("Enter the elements in an array");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			squareroot[i] = Math.sqrt(arr[i]);
		}
		System.out.println("Array of the square root is ");
		
		for(double squareRoot : squareroot) {
			System.out.println(squareroot);
		}*/
		

	}

}
