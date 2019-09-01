package String;

import java.util.Scanner;

public class countPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		System.out.println(countpalindromic(str));

	}
	public static int countpalindromic(String str) {
		int c=0;
		for(int si=0;si<str.length();si++) {
			for(int ei=si+1;ei<=str.length();ei++) {
//				System.out.println(c);
				if(ispalindrom(str.substring(si, ei))){
					c+=1;
				}
				System.out.println(c);
			}
		}
		return c;
	}
	public static boolean ispalindrom(String substring) {
		// TODO Auto-generated method stub
		int l=0;
		int r=substring.length()-1;
		while(l<=r) {
			if(substring.charAt(l)!=substring.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
	}

}
