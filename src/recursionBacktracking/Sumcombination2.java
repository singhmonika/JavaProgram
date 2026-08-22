package recursionBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sumcombination2 {
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> comb = new ArrayList<>();
		generateSum(0, candidates, new ArrayList(), comb, target);
		return comb;
	}
	
	void generateSum(int start, int [] nums, List<Integer>current, List<List<Integer>>comb, int target) {
		if(target == 0) {
			comb.add(new ArrayList(current));
		}
		if(target < 0) {
			return;
		}
		for(int i = start; i<nums.length;i++) {
			if (i > start && nums[i] == nums[i - 1]) continue;
			current.add(nums[i]);
			generateSum(i+1, nums, current, comb, target-nums[i]);
			current.remove(current.size()-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] candidate = new int [] {2,5,2,1,2};
		int target = 5;
		Sumcombination2 com1 = new Sumcombination2();
		System.out.println(com1.combinationSum(candidate, target));

	}

}
