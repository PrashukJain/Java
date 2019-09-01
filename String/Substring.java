package String;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		substring(str);
		

	}
	public static void substring(String str) {
		for(int si=0;si<str.length();si++) {
			for(int ei=si+1;ei<=str.length();ei++) {
				System.out.println(str.substring(si, ei));
			}
		}
	}

}
