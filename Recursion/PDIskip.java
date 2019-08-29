package Recursion;

import java.util.Scanner;

public class PDIskip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		skip(n);

	}
public static void skip(int n) {
	if(n==0)
		return;
	if(n%2!=0)
		System.out.println(n);
	skip(n-1);
	if(n%2==0)
		System.out.println(n);
}
}
