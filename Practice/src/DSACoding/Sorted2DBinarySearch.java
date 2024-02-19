package DSACoding;

import java.util.Arrays;

public class Sorted2DBinarySearch {



	
	static int[] search(int arr[][], int target) {
		int rows=arr.length;
		int cols=arr[0].length;//matrix may be empty
		
		if(rows==1) {
			return binarySearch(arr, target, 0, 0, cols-1);
		}
		int rowStart=0;
		int rowEnd=rows-1;
	
		//run the loop till 2 rows are remaining
	int colMid=	cols/2;
	while(rowStart<(rowEnd-1)){
		int midElement=rowStart+(rowEnd-rowStart)/2;
		if(arr[midElement][colMid]==target) {
			return new int[] {midElement, colMid};
		}
		if(arr[midElement][colMid]<target) {
			rowStart=midElement;
		}else {
			rowEnd=midElement;
		}
			
	}
	
	
	if(arr[rowStart][colMid]==target) {
		return new int[] {rowStart, colMid};
	}
	 if(arr[rowStart+1][colMid]==target) {
		return new int[] {rowStart+1, colMid};
	}
	 
	 //1st
	 if(target<=arr[rowStart][colMid-1]) {
		return binarySearch(arr, target, rowStart, 0, colMid-1) ;
	 }
	 //2nd
 if(target>=arr[rowStart][colMid+1]  && target<=arr[rowStart][cols-1])  {
	 return binarySearch(arr, target, rowStart, colMid+1, cols-1) ;
	 }
	//3rd
 if(target<=arr[rowStart+1][colMid-1]) {
		return binarySearch(arr, target, rowStart+1, 0, colMid-1) ; 
 }
	 //4th
 else{
	 return binarySearch(arr, target, rowStart+1, colMid+1, cols-1) ;
 }
	
	}

	//binarySearch
	
	static int[] binarySearch(int arr[][], int target, int row, int colStart, int colEnd) {
		while(colStart<=colEnd) {
			int mid=colStart+(colEnd-colStart)/2;
			if(arr[row][mid]==target) {
				return new int[] {row, mid};
			}
			if(arr[row][mid]<target) {
				colStart=mid+1;
			}
			else {
				colEnd=mid-1;
			}		
		}
		return new int[] {-1,-1};
	}		
	
public static void main(String[] args) {
	int arr[][]= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	int target=6;
	System.out.println(Arrays.toString(search(arr, target)));
	
	}
}
