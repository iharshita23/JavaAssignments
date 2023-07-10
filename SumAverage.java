package com.shrishti.basic;

public class SumAverage {

	public static void main(String[] args) {
		int arr[] = {2,3,67,54,34,37};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of all the digits of array is " + sum);
		System.out.println("Average of all the digits is " + sum/arr.length);
	}
}
