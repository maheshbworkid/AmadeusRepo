package DSACoding;

import java.util.Arrays;

public class SelectionSort1 {
	
	static void sortselection(int []arr) {
		for(int i=0; i<arr.length; i++) {
			//find max item and swap with correct index
			int lastIndex=arr.length-i-1;
			int maxIndex=getMaxIndex(arr, 0, lastIndex);
			swap(arr, maxIndex, lastIndex);
		}
	}
	
	static void swap(int []arr, int first, int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	
	static int getMaxIndex(int arr[], int start, int end) {
		int max=start;
		for(int i=start; i <=end ; i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}
public static void main(String[] args) {
	int arr[]= {3,1,5,4,2};
	sortselection(arr);
	System.out.println(Arrays.toString(arr));
			}
}
