package Array;

import java.util.Scanner;

public class RotateArray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		int[] arr=takeinput(n);
		int r=scn.nextInt();
	Rotate(arr,r)	;
	for(int val:arr)
		System.out.println(val);

	}
	public static int[] takeinput(int n) {
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=scn.nextInt();
		return arr;
	}
	public static void Rotate(int[] arr,int r) {
		r=r%arr.length;
		if(r<0) {
			r=r+arr.length;
		}
		for(int i=1;i<=r;i++) {
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
	}
	

}
