package testpractice;

public class RotatedBinarySearch {
	
	static int findPivot(int arr[]) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int mid=start+(end-start)/2;
			
			if(mid < end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			
			if(arr[mid]<= arr[start]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
	}
		return -1;
	}
	
	
	static int search(int arr[], int target) {
		int pivot=findPivot(arr);
		int start=0;
		int end=arr.length-1;
		if(pivot==-1) {
			return bsearch(arr, target,start, end );
		}
		if(arr[pivot]==target) {
			return pivot;
		}
		else if(target >=arr[start]){
			return bsearch(arr, target,start, pivot-1);
		}
		else {
			return bsearch(arr, target, pivot+1, arr.length-1);
		}
	}
	
	static int bsearch(int arr[], int target, int start, int end) {
		
		
		while (start<=end) {
			
			int mid=start+(end-start)/2;
			if(target<arr[mid]){
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}

public static void main(String[] args) {
	int arr[]= {4,5,6,7,0,1,2};
	System.out.println(findPivot(arr));
}
}
