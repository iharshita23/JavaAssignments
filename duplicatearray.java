package com.shrishti.basic;

public class duplicatearray {

	public static void main(String[] args) {
		int i = 0,j,duplicate = 0;
		int[] arr = {10,16,37,28,28,49};
		while(i < arr.length) {
			j=i+1;
			while(j<arr.length) {
				if(arr[i] == arr[j]) {
					duplicate++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println("Total no of duplicates are " + duplicate);
	}

}
