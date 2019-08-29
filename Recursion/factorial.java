package Recursion;

import java.util.Scanner;

public class factorial {
	static int ans=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		fact1(n);
System.out.println(fact2(n));
	}
public static void fact1(int n) {

if(n==0) {
		System.out.println(ans);
		return;
	}
ans=ans*n;
fact1(n-1);
}
public static int fact2(int n) {
	if(n==0)
		return 1;
	return fact2(n-1)*n;
	
}
}
