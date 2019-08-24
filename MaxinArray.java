package Array;

import java.util.Scanner;

public class MaxinArray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=scn.nextInt();
		int[] arr=takeinput(n);
		System.out.println(Maxelement(arr));

	}
public static int[] takeinput(int n) {
	int[] arr=new int[n];
	for(int i=0;i<arr.length;i++)
		arr[i]=scn.nextInt();
	return arr;
}
public static int Maxelement(int[] arr) {
	int temp=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>temp)
			temp=arr[i];
	}
	return temp;
}
}
