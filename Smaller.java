package com.shrishti.basic;

public class Smaller {

	public static void main(String[] args) {
		int []arr= new int[]{20,300,46,789,45}; 
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
        	if (arr[i] < min)
        	 {min = arr[i];}
        }
        System.out.println("Smallest no. in an array is " + min);
	}

	}

