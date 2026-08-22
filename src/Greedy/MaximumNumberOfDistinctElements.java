package Greedy;

import java.util.Arrays;

public class MaximumNumberOfDistinctElements {
	//lEETCODE 3397. maximum number of distinct elements after operations in java
	
	 public int maxDistinctElements(int[] nums, int k) {
	        Arrays.sort(nums);
	        int count = 0;
	        int current = Integer.MIN_VALUE;

	        for (int n = 0 ; n<nums.length; n++) {
	            int low = n - k;
	            int high = n + k;

	            if (current + 1 <= high) {
	                int assinged = Math.max(current + 1, low);
	                current = assinged;
	                count += 1;
	            }
	        }

	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int[] {1,2,2,3,3,4};
		int k = 2;
		MaximumNumberOfDistinctElements max = new MaximumNumberOfDistinctElements();
		System.out.println(max.maxDistinctElements(arr, k));

	}

}
