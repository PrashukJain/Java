package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String str=scn.next();
if(ispalindrome(str))
	System.out.println("Yes");
else
	System.out.println("No");}
public static boolean ispalindrome(String str) {
	int l=0;
	int r=str.length()-1;
	while(l<r) {
		if(str.charAt(l)!=str.charAt(r))
			return false;
		l++;
		r--;
	}
	return true;
}
}
