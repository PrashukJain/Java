package Searching;

import java.util.Scanner;

public class BinarySearch {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=scn.nextInt();
int[] arr=takeinput(n);
int item=scn.nextInt();
System.out.println(BSearch(arr,item));
	}
	public static int[] takeinput(int n) {
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=scn.nextInt();
		return arr;
	}
	public static int BSearch(int[] arr,int item) {
		int l=0;
		int h=arr.length-1;
		while(l<=h) {
		int mid=(l+h)/2;
if(arr[mid]<item)
	l=mid+1;
else if(arr[mid]>item)
	h=mid-1;
else
	return mid;
}
	
	return -1;}
}
