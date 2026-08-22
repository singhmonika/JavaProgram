package Practic;

import java.util.Scanner;

public class TwoSum {
	
	public int[] sum(int [] arr, int val) {
		int [] res = new int [2];
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==val) {
					res[0]=i;
					res[1]=j;
					System.out.println("Output" + res[0] + " " + res[1]);
				}
			}
			
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
		TwoSum t = new TwoSum();
		t.sum(arr, sum);
		
		
		

	}

}
