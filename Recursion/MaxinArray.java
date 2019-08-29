package Recursion;

import java.util.Scanner;

public class MaxinArray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=scn.nextInt();
int[] arr=takeinput(n);
//max1(arr,0);
System.out.println(max2(arr, 0));
	}
	public static int[] takeinput(int n) {
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		return arr;
	}
	static int max=Integer.MIN_VALUE;
	public static void max1(int[] arr,int videx) {
		if(videx==arr.length) {
			System.out.println(max);
			return;}
		if(arr[videx]>max)
			max=arr[videx];
		max1(arr,videx+1);
	}
	public static int  max2(int[] arr,int videx) {
		if(videx==arr.length)
			return Integer.MIN_VALUE;
		int max=max2(arr, videx+1);
		if(max<arr[videx])
			max=arr[videx];
		return max;
	}
}
