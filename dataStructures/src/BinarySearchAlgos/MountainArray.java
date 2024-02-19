package BinarySearchAlgos;

public class MountainArray {

	static int answer(int arr[], int target) {
		int peak=search(arr);
		int firstTry=binarySearch(arr, target, 0, peak);
		if(firstTry!=-1) {
			return firstTry;
		}
		return OrderAgnosticsearch(arr, target, peak+1, arr.length-1);
	}
	
	
	static int search(int arr[]) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
		int mid=start+(end-start)/2;
		if(arr[mid]>arr[mid+1]) {
			
			end=mid;
			
		}
		else {
		 start=mid+1;	
		}
		
		}
		return start;
	
	}
	
	static int binarySearch(int arr[], int target, int start, int end) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	static int OrderAgnosticsearch(int arr[], int target, int start, int end) {
	
		
		
		while(start<end) {
			int mid=start+(end-start)/2;
			if(target>arr[mid]) {
				end=mid+1;
			}
			else if(target<arr[mid]) {
				start=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		//int arr[]= {0,2,3,1,0};
		int arr[]= {1,2,3,4,5,3,1};
	int ans=answer(arr,3);
	System.out.println(ans);
	}
}
