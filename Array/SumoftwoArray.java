package Array;

import java.util.ArrayList;

public class SumoftwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one = { 9, 9, 9, 8 };
		int[] two = { 9, 9 };
	ArrayList<Integer> rr=sum(one,two);
	for(int val:rr)
		System.out.print(val+"\t");

	}
	public static ArrayList<Integer> sum(int[] one,int[] two){
		ArrayList<Integer> rr=new ArrayList<>();
		int i=one.length-1;
		int j=two.length-1;
		int carry=0;
		while(i>=0||j>=0) {
			int sum=carry;
			if(i>=0)
				sum+=one[i];
			if(j>=0)
				sum+=two[j];
			int rem=sum%10;
			rr.add(0, rem);
			carry=sum/10;
			i--;
			j--;
			}
		if(carry>0)
			rr.add(0,carry);
		return rr;
	}

}
