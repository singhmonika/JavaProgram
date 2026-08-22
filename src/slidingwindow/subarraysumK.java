package slidingwindow;

import java.util.ArrayList;

public class subarraysumK {
	
	//Index of subarray whose sum is equal to k
	
	public static ArrayList<Integer> subArray(int[] arr, int k){
		ArrayList<Integer> arrlist = new ArrayList<>();
		int i = 0;
		int sum =0;
		for (int j=0; j<arr.length;j++) {
			sum = sum + arr[j];
		
		while(sum > k) {
			sum = sum - arr[i];
			i++;
		}
	
		if(sum == k && i<=j) {
			arrlist.add(i);
			arrlist.add(j);
			for(int l = 0; l<arrlist.size();i++) {
			System.out.println(arrlist);
			return arrlist;
		}
	}
		
}
		arrlist.add(-1);
		System.out.println("subarray doesnot exist");
		return arrlist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 6;
		int arr[] = new int[] {1,2,4,8};
		subarraysumK.subArray(arr, k);
			

	}

}
