package Recursion;

import java.util.Scanner;

public class Printinc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		printinc(n);
		

	}
public static void printinc(int n) {
	if(n==0) {
		return;
	}
	printinc(n-1);
	System.out.println(n);
}
}
