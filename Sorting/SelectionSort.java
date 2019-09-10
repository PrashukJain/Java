package Sorting;

import java.util.Scanner;

public class SelectionSort {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=scn.nextInt();
		int[] arr=takeinput(n);
		sort(arr);
		for(int val:arr)
			System.out.println(val);
		

	}
public static int[] takeinput(int n) {
	
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=scn.nextInt();
	return arr;
}
public static void sort(int[] arr) {
	for(int counter=0;counter<arr.length-1;counter++) {
		int min=counter;
		for(int j=counter+1;j<arr.length;j++) {
			if(arr[min]>arr[j])
				min=j;
		}
		int temp=arr[min];
		arr[min]=arr[counter];
		arr[counter]=temp;
	}
}
}
