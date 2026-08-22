package recursionBacktracking;

import java.util.ArrayList;
import java.util.List;

public class SumCombination1 {
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> comb = new ArrayList<>();
		generateCombination(0,candidates, new ArrayList(),comb,target);
		return comb;
		
	}
	
	void generateCombination(int start,int[] nums, List<Integer>current, List<List<Integer>>comb, int target) {
		
		if(target == 0) {
			comb.add(new ArrayList(current));
		}
		if(target<0) {
			return;
		}
		
		for(int i = start; i<nums.length;i++) {
			current.add(nums[i]);
			generateCombination(i, nums, current, comb, target-nums[i]);
			current.remove(current.size()-1);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] candidate = new int [] {2,3,6,7};
		int target = 7;
		SumCombination1 com1 = new SumCombination1();
		System.out.println(com1.combinationSum(candidate, target));

	}

}
