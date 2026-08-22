package binarySearch;

public class Example1 {
	
	public static int search(int arr[], int element, int low, int high) {
		int mid = 0;
		while(low<=high) {
			mid = low+(high-low)/2;
			if(arr[mid] == element) {
				System.out.println("Number Found "+ arr[mid]);
				break;
			}else if(arr[mid]>element) {
				high = mid-1;
			}else if(arr[mid]<element) {
				low = mid+1;
			}else {
				return -1;
			}
			
		}
		return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int [] {11,15,16,19,25,36,67};
		int n = arr.length;
		int element = 15;
		int result = Example1.search(arr, element, 0, n-1);
		if(result == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found in index " + " " + result);
		}
	}

}
