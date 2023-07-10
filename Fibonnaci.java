package com.shrishti.basic;

public class Fibonnaci {
    static int fibonnaci(int n) {
    	if(n <= 1)
    		return n;
    	return fibonnaci(n-1)+fibonnaci(n-2);
    }
	public static void main(String[] args) {
		int num = 10;
		for(int i = 0; i < num; i++) {
			System.out.println(fibonnaci(i) + " ");
		}

	}

}
