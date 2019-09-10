package Sorting;

import java.util.Scanner;

public class BubbleSort {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		int[] arr=takeinput(n);
		Sort(arr);
		for(int val:arr)
			System.out.println(val);

	}
	public static int[] takeinput(int n) {
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		return arr;
	}
	public static void Sort(int[] arr) {
		for(int counter=0;counter<arr.length-1;counter++) {
			for(int j=0;j<arr.length-counter-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
