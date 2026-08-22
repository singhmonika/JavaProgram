package Practic;

public class SplitSubarray {
	public static int splitEqualSubarray(int []arr, int n) {
		int sum = 0;
		int left_sum = 0 ;
		int right_sum = 0 ;
		for(int i = 0; i<n;i++) {
			sum = sum + arr[i];
			
		}
		for(int i = 0; i<n;i++) {
			left_sum = left_sum + arr[i];
			right_sum = sum - left_sum;
			
			if(left_sum == right_sum) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int[]{1,2,4,5,5,6,1};
		int splitIndex = splitEqualSubarray(arr, arr.length);
		if(splitIndex == -1) {
			System.out.println("subarray doesn't exist");
		}
		else {
			for(int i = 0 ; i<arr.length;i++) {
				if(i == (splitIndex+1)) {
					System.out.println();
				}
				System.out.println(arr[i] + " ");
			}
		}
	}

}
