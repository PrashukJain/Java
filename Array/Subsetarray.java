package Array;

import java.util.Scanner;

public class Subsetarray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=scn.nextInt();
int[] arr=takeinput(n);
subset(arr);
//validParenthesis(3, 0, 0, "");
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
	public static void subset(int[] arr) {

		int limit = (int) Math.pow(2, arr.length);

		for (int n = 0; n <= limit-1; n++) {

			int temp = n;
			int idx = 0;

			while (temp != 0) {

				int rem = temp % 2;

				if (rem == 1) {
					System.out.print(arr[idx] + " ");
				}
				temp = temp / 2;
				idx++;

			}

			System.out.println();
		}

	}
}
