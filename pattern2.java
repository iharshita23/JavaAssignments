package com.shrishti.basic;

public class pattern2 {

	public static void main(String[] args) {
		int num = 4,k = 1;
		for (int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println( );
		}

	}

}
