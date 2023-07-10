package com.shrishti.basic;

public class Armstrong {

	public static void main(String[] args) {
	  int num = 153;
	  int ans = 0;
	  int rem =0;
	  int num2 = num;
	  while(num!=0) {
		  rem= num % 10;
		  ans += rem*rem*rem;
		  num = num / 10;
	  }
	  if(num2==ans)
	   System.out.println("This is an Armstrong number");
	   else
	   System.out.println("Not an armstrong number");
	}

}
