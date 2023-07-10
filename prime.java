package com.shrishti.basic;

public class prime {

	public static void main(String[] args) {
		int num = 11;
		int temp = 0;
		for(int i = 2; i <= num; ++i) {
			if(num % i == 0) {
				temp = 1;
				break;
			}
		}
      if(temp == 1)
    	  System.out.println("Its is a prime number");
      else
    	  System.out.println("It is not an prime number");
	}

}
