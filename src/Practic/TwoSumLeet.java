package Practic;

import java.util.HashMap;

public class TwoSumLeet {
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int [] arr = new int[2];
        // for(int i = 0; i< nums.length; i++){
        //     mp.put(nums[i], i);
        // }
        for(int i = 0 ; i < nums.length; i++ ){
            int res = nums[i];
            int diff = target - res; 
            int index = 0;
            if(mp.containsKey(diff)){
                //index = mp.get(diff);
                return new int[]{i,mp.get(diff)};
            }
           mp.put(nums[i], i);
        }
        return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int[] {2,7,11,15};
		int target = 9;
		System.out.println(TwoSumLeet.twoSum(arr, target));
		

	}

}
