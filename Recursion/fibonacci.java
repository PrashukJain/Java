package Recursion;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(fib(n));

	}
	public static int fib(int n) {
		if(n==1||n==2)
			return n-1;
		return fib(n-1)+fib(n-2);
	}

}
