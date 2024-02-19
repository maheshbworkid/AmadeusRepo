package testpractice;

import java.util.Arrays;

public class Searchin2dArray {

	static int[] search(int arr[][], int target){
		if(arr.length==0) {
			return new int[] {-1, -1};
		}
		for(int row=0; row <arr.length; row++) {
			for (int col=0; col<arr[row].length; col++) {
				if(target==arr[row][col]) {
					return  new int[] {row, col};
				}
			}
		}
		return new int[] {-1, -1};
	}
	public static void main(String[] args) {
		int arr[][]= {
				{23, 4,1},
				{18, 12, 3, 9},
				{78, 99, 34, 56},
				{18, 12}
				
				
		};
		int target=341;
		int ans[]=search(arr, target); //format of return value {row, col};
		System.out.println(Arrays.toString(ans));
		}
	}

