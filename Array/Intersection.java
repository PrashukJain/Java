package Array;

import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one = { 10,20, 30, 40, 40, 45, 50, 50, 50, 60, 90 };
		 int[] two = { 20, 35, 40, 40, 40, 40, 47, 50, 60, 60, 60 };
System.out.println(intersection(one,two));
	}
	public static ArrayList<Integer> intersection(int[] one,int[] two){
		ArrayList<Integer> rr=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<one.length&&j<two.length) {
			if(one[i]<two[j])
				i++;
			else if(two[j]<one[i])
				j++;
			else {
				rr.add(one[i]);
				i++;
				j++;
			}
				
		}
		return rr;
	}

}
