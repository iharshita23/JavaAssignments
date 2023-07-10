package com.shrishti.basic;

public class SecondSmallest {

	public static void main(String[] args) {
		int arr[] = {20,48,56,47,6,9};
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second smallest number in an array is " + arr[1]);

	}

}
