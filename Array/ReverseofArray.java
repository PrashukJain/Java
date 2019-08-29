package Array;

import java.util.Scanner;

public class ReverseofArray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		int[] arr=takeinput(n);
Reverse(arr);
for(int val:arr)
	System.out.println(val);
	}
	public static int[] takeinput(int n) {
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=scn.nextInt();
		return arr;
	}
	public static void Reverse(int[] arr) {
		int l=0;
		int h=arr.length-1;
		while(l<=h) {
			int temp=arr[l];
			arr[l]=arr[h];
			arr[h]=temp;
			l+=1;
			h-=1;
		}
	}
}
