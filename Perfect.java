package com.shrishti.basic;

public class Perfect {

	public static void main(String[] args) {
		int num = 28, sum = 0;
		for (int i = 1; i < num; i++) {
			if(num % i == 0){
				sum = sum + i;
			}
		}
      if(sum == num)
    	  System.out.println("It is a perfect number " + num);
      else
    	  System.out.println("Not a perfect number ");
	}

}
