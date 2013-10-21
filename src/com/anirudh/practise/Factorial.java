package com.anirudh.practise;

/**
 * 
 * @author Anirudh
 *
 */
public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println("factorial of 5 = "+f.fact(5));
	}
	
	public long fact(long n){
		if(n==0){
			return 1;
		}
		return n * fact(n-1);
	}
	
	
}
