package Recursion;

import java.util.Scanner;

public class Printdecr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		printdec(n);
}
	public static void printdec(int n) {
		//base case
		if(n==0) {
			return;
		}
		//
		System.out.println(n);
		printdec(n-1);
	}

}
