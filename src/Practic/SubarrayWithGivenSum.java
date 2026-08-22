package Practic;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
	
	public static ArrayList<Integer> subArraySum(int [] arr, int n, int s){
		ArrayList<Integer> ls = new ArrayList<>();
		int i = 0 ; 
		int sum = 0;
		for(int j = 0 ; j < n; j++) {
			sum = sum + arr[j];
			while(sum > s) {
				sum = sum - arr[i];
				i++;
			}
			if(sum == s & i<j) {
				ls.add(i+1);
				ls.add(j+1);
				return ls;
			}
		}
		ls.add(-1);
		return ls;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		int [] arr = new int[] {8,9,3,4};
		int sum = 7;
		System.out.println(SubarrayWithGivenSum.subArraySum(arr, n, sum));
		

	}

}
