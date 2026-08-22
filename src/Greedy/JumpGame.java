package Greedy;

public class JumpGame {
	boolean canJump(int[] nums) {

	   int finalPos = nums.length-1;
	   for(int i = nums.length-2;i>=0;i--) {
		   if(i+nums[i]>=finalPos) {
			   finalPos=i;
		   }
	   }
	   return finalPos == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [] {1,1,2,5,2,1,0,0,1,3};
		JumpGame j = new JumpGame();
		System.out.println(j.canJump(arr));

	}

}
