package Practic;

import java.util.ArrayList;

public class SubarraySumK_Array {
	
	public static ArrayList<Integer>subArraySum(int [] arr, int k){
		ArrayList<Integer> ls = new ArrayList<>();
		int count = 0;
		int sum = 0;
		int i = 0;
		for(int j=0 ; j< arr.length; j++ ) {
			sum = sum + arr[j];
			while(sum>k) {
				sum = sum - arr[j];
				i++;
			}
			if(sum == k) {
				count = count+1; 
			}
			if(count>0) {
				ls.add(i);
				ls.add(j);
			}
		}

		return ls;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {1,1,1};
		int k = 2;
		System.out.println(SubarraySumK_Array.subArraySum(arr, k));

	}

}
