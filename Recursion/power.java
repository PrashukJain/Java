package Recursion;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int a=scn.nextInt();
System.out.println(pow(n,a));
	}
	public static int pow(int n,int a) {
		if(a==0) {
			return 1;
		}
		return pow(n,a-1)*n;
	}

}
