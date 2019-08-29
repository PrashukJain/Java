package Array;

import java.util.Scanner;

public class InverseArray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		int[] arr=takeinput(n);
int[] ans=Inverse(arr);
for(int val:ans)
	System.out.println(val);
	}
public static int[] takeinput(int n) {
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=scn.nextInt();
	return arr;
}
public static int[] Inverse(int[] arr) {
	int[] ans=new int[arr.length];
	for(int i=0;i<arr.length;i++)
		ans[arr[i]]=i;
	return ans;
}
}
