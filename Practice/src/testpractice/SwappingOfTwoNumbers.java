package testpractice;

import java.util.Arrays;

public class SwappingOfTwoNumbers {

	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int x;
		x=arr[3];
		arr[3]=arr[0];
		arr[0]=x;
		System.out.println(Arrays.toString(arr));
		
	}
}
