package Practic;

public class SubarraySumK {
	
	public static int subArrayCount(int [] arr, int k) {
		int count = 0;
		int i = 0;
		int sum = 0 ;
		for(int j = 0; j<arr.length;j++) {
			sum = sum + arr[j];
			while(sum > k) {
				sum = sum - arr[i];
				i++;
			}
			if(sum == k) {
				count = count+1;
				
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int [] {1,1,1};
		int k = 2;
		System.out.println(SubarraySumK.subArrayCount(arr, k));

	}

}
