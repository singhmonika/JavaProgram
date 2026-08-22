package recursionBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		generateSubset(0,nums,new ArrayList(),res);
		return res;
	}
	void generateSubset(int start, int []  nums, List<Integer>current, List<List<Integer>>res) {
		res.add(new ArrayList<>(current));
		for(int i = start; i<nums.length;i++) {
			current.add(nums[i]);
			generateSubset(i+1,nums,current,res);
			current.remove(current.size()-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] candidate = new int [] {1,2,3};
		Subset subset = new Subset();
		System.out.println(subset.subsets(candidate));

	}

}
