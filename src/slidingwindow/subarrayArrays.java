package slidingwindow;

import java.util.ArrayList;

public class subarrayArrays {
	//All the Indices of subarray whose sum is equal to k
	public static ArrayList<Integer> subArrayCount(int[] arr, int k){
		ArrayList<Integer> arrls = new ArrayList<>();
		int sum = 0 ;
		int i = 0;
		int count =0;
		for ( int j = 0 ;j<arr.length;j++) {
			sum = sum +arr[j];
			while(sum > k) {
				sum = sum -arr[i];
				i++;
			}
			if(sum == k) {
				count = count+1;
				if (count>0) {
					arrls.add(i);
					arrls.add(j);
					//System.out.println(arrls);
				}
			}
			
			
		}
		//arrls.add(-1);
		return arrls;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {1,1,1};
		int k =2;
		ArrayList<Integer>ls = new ArrayList<>();
		ls = subarrayArrays.subArrayCount(arr, k);
		if(ls.isEmpty()) {
			System.out.println("subarray doesnot exist");
		}else {
			System.out.println(ls);
		}

	}

}
