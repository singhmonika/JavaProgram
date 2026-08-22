package Practic;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumOptimum {
	
	public int [] sum1(int [] arr, int sum) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		int [] res = new int [2];
		for(int i = 0 ;i<arr.length;i++) {
			mp.put(arr[i], i);
		}
		
		for(int i = 0 ; i<arr.length; i++) {
			int nums = arr[i];
			int rem = sum - nums;
			int index = 0;
			if(mp.containsKey(rem)) {
				index = mp.get(rem);
			}
			res[0] = i;
			res[1] = index;
			
			System.out.println("Output" + res[0] + " " + res[1]);
			
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0 ;
		int sum = 6;
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter array input");
		for(int i = 0 ; i< arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		TwoSumOptimum t = new TwoSumOptimum();
		t.sum1(arr, sum);
		

	}

}
