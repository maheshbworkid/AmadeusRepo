package testpractice;

import java.util.Arrays;

public class MaxItemInArray {
//	static void maxItem(int arr[]) {
//		int max=arr[0];
//		for (int i=1; i<arr.length; i++) {
//			if(arr[i]>max) {
//				max=arr[i];//3>1 max=3 
//			}
//			max=max+0;
//		}
//		System.out.println(max);
//	}
 
//	static void maxItemInRange(int arr[], int start, int end) {
//	int max=arr[0];
//	for (int i=start; i<end; i++) {
//		if(arr[i]>max) {
//			max=arr[i];//3>1 max=3 
//		}
//		max=max+0;
//	}
//	System.out.println(max);
//}
	static void swap(int arr[], int start, int end) {
		int temp;
	 temp= arr[end];
	 arr[end]=arr[start];
	 arr[start]=temp;
	 
	}
	//44   189    9     23    3  1

	static void reverse(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			swap(arr, start, end);
			start++;//0, 1, 2, 3
			end--;//5, 4, 3, 2
		}
	
	}
public static void main(String[] args) {
	int arr[]= {1,3,23,9,189, 44};
//	maxItem(arr);
//	maxItemInRange(arr, 0,3);
	reverse(arr);
	System.out.println(Arrays.toString(arr));
}
}
