package Recursion;

import java.util.Scanner;

public class Printarray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=scn.nextInt();
int[] arr=takeinput(n);
print(arr,0);
printRev(arr, 0);
	}
	public static int[] takeinput(int n) {
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		return arr;
	}
	public static void print(int[] arr,int videx) {
		if(videx==arr.length)
			return;
		System.out.println(arr[videx]);
	print(arr, videx+1);
	
	}

	public static void printRev(int[] arr,int videx) {
		if(videx==arr.length)
			return;
		
	printRev(arr, videx+1);
	System.out.println(arr[videx]);
	}

}
