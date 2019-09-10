package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {82,
				55,
				44,
				99,
				33,
				77,
				88,
				11,};
		InsertionS(arr);
		for(int val:arr) {
			System.out.println(val);
		}

	}
	public static void InsertionS(int[] arr) {
		for(int counter=1;counter<arr.length;counter++) {
			int val=arr[counter];
			int j=counter-1;
			for(;j>=0;j--) {
				if(arr[j]>val) {
					arr[j+1]=arr[j];
					}
				else 
					break;
				}
			arr[j+1]=val;
			
		}
	}

}
