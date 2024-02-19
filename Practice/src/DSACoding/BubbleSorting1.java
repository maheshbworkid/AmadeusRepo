package DSACoding;

import java.util.Arrays;

public class BubbleSorting1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void bubblesort(int arr[]) {
		boolean swapped;
		//run the steps n-1 time
		for(int i=0;i<arr.length;i++) {
			swapped=false;
			//for each step max item will come at the last respective index
			for(int j=1; j<arr.length-i;j++) {
				//swap if the item is smaller then the previous item
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
					
				}
			}
			//if you did not swap for a particular value of i it means
			//the array is sorted hence stop the pgm
			//break 
			if(!swapped) {
				break;
			}
		}
	}
}
