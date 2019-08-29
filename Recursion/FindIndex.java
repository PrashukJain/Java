package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class FindIndex {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=scn.nextInt();
int[] arr=takeinput(n);
int item=scn.nextInt();
System.out.println(firstIndex(arr,0,item));
	System.out.println(LastIndex(arr, item, 0));
	System.out.println(findAllIndex(arr, item, 0,new ArrayList<>()));}
	public static int[] takeinput(int n) {
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		return arr;
	}
	public static int firstIndex(int[] arr,int videx,int item) {
		if(videx==arr.length) {
			return -1;
		}
		if(arr[videx]!=item)
		return firstIndex(arr, videx+1, item);
		return videx;
	}
	public static int LastIndex(int[] arr,int item,int videx) {
		if(videx==arr.length) {
			return -1;
		}
		int rr=LastIndex(arr,item,videx+1);
		if(arr[videx]==item&&rr==-1) {
			return videx;
		}
		return rr;
		
	} 
	public static ArrayList<Integer> findAllIndex(int[] arr,int item,int videx,ArrayList<Integer> rr){
if(videx==arr.length) {
	if(rr.size()==0)
		rr.add(-1);
	return rr;
}
		if(arr[videx]==item) {
			rr.add(videx);
		}
		rr=findAllIndex(arr, item, videx+1,rr);
		return rr;
	}
}
