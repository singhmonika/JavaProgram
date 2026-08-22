package slidingwindow;

public class subarrayCount {
	//count of subarrays whose sum is equal to k
	public static int subCount(int [] arr, int k) {
		int count = 0;
		int i =0;
		int sum =0;
		for(int j =0;j<arr.length;j++) {
			sum = sum +arr[j];
			while(sum>k) {
				sum = sum -arr[i];
				i++;
			}
			if(sum == k) {
				count = ++count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 2;
		int [] arr = new int[] {1,1,1};
		int c = subarrayCount.subCount(arr, k);
		if(c > 0) {
			System.out.println(c);
		}
		else {
			System.out.println("subarray doesnot exist");
		}

	}

}
