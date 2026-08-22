package Greedy;

public class JumpGame2 {
	
	int jump(int[] nums) {

	    int totalJumps = 0;

	    // destination is last index
	    int destination = nums.length - 1;

	    int coverage = 0, lastJumpIdx = 0;

	    // Base case
	    if (nums.length == 1) return 0;

	    // Greedy strategy: extend coverage as long as possible
	    for (int i = 0; i < nums.length; i++) {

	      coverage = Math.max(coverage, i + nums[i]);

	      if (i == lastJumpIdx) {
	        lastJumpIdx = coverage;
	        totalJumps++;

	        // check if we reached destination already
	        if (coverage >= destination) {
	          return totalJumps;
	        }
	      }
	    }

	    return totalJumps;
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [] {2,4,1,2,3,1,1,2};
		JumpGame2 j = new JumpGame2();
		System.out.println(j.jump(arr));

	}

}
