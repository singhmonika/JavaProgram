package Practic;

import java.util.Arrays;

public class evenThenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,8,9};
		int start = 0;
		int end = arr.length-1;
		while(end>=start) {
			if(arr[start]%2!=0) {
				if(arr[end]%2==0) {
					int temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
					start ++;
					end --;
					System.out.println(Arrays.toString(arr));
					
					
			
				}else {
				end--;
				}
			}else {
			start++;
			}
			
		}
		
		
		
		}
	

}
