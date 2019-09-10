package Searching;

import java.util.Scanner;

public class LinearSearch {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=scn.nextInt();
int[] arr=takeinput(n);
System.out.println("enter no. to find");
int item=scn.nextInt();
System.out.println(LSearch(arr,item));

	}
public static int[] takeinput(int n) {
	int[] arr=new int[n];
	for(int i=0;i<arr.length;i++)
		arr[i]=scn.nextInt();
	return arr;
}
public static int LSearch(int[] arr,int item) {
	for(int i=0;i<arr.length;i++) {
		if(item==arr[i])
			return i;
	}
	return -1;
}
}
