package Array;

import java.util.Scanner;

public class Subsetarray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=scn.nextInt();
int[] arr=takeinput(n);
Subset(arr);
	}
	public static int[] takeinput(int n) {
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		return arr;
	}
	public static void Subset(int[] arr) {
		for(int si=0;si<arr.length;si++) {
			for(int ei=si;ei<arr.length;ei++) {
				for(int k=si;k<=ei;k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}

}
