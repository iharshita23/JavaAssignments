package com.shrishti.basic;

public class reverseno {

	public static void main(String[] args) {
		int num=12345678, num2=0;
		for(; num != 0; num/= 10) {
			int temp = num%10;
			num2 = num2 * 10 + temp;
		}
		System.out.println("Reversed number " + num2);
	}

}
