package linearSearchAlgos;

import java.util.Arrays;

public class SearchIn2DArray {

	static int search(int arr[][], int target){
		int max=arr[0][0];
	for(int i=0; i<arr.length;i++) {
		for(int j=0; j<arr[i].length;j++) {
			if(arr[i][j]>max) {
				max=arr[i][j];
			}
		}
		
	}
	return max;
	
	}
	public static void main(String[] args) {
		int arr[][]= {
				{23,4,1},
				{18,12,3,9},
				{78,99, 34,56},
				{18,12}
		};
		int target=34;
		int ans=search(arr, target); //format of return value{start, end}
		//System.out.println(Arrays.toString(ans));
		System.out.println(ans);
		}
	}

