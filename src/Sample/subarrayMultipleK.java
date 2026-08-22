package Sample;

import java.util.*;

public class subarrayMultipleK {
	public boolean checkSubarraySum(int[] nums, int k) {
		int sum = 0;
		int rem = 0;
		Map <Integer,Integer> mp = new HashMap<>();
		mp.put(0,-1);
		for(int i = 0; i<nums.length;i++) {
			sum = sum + nums[i];
			rem = sum%k;
			if(mp.containsKey(rem)) {
				if(i-mp.get(rem)>1) {
					return true;
				}
			}else {
				mp.put(rem, i);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 7;
		int arr[] = new int[] { 23, 2, 4, 6, 6 };
		subarrayMultipleK mul = new subarrayMultipleK();
		System.out.println(mul.checkSubarraySum(arr, k));

	}

}
