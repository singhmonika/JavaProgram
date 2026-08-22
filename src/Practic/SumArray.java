package Practic;

import java.util.HashMap;
import java.util.Map;

public class SumArray {
	
	public static int [] sumVal (int [] arr , int sum) {
		int [] res = new int[2];
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i = 0 ; i<arr.length; i++) {
			mp.put(arr[i], i);
		}
		for(int i = 0 ; i<arr.length; i++) {
			int dif = sum - arr[i];
			int index = 0;
			if(mp.containsKey(dif)) {
				index = mp.get(dif);
			}
			res[0] = i;
			res[1] = index;
			System.out.println(res[0] + " " + res[1]);
		}
			
				
			
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = new int[] {2,3,7,3};
		System.out.println(sumVal(ar,6));

	}

}
