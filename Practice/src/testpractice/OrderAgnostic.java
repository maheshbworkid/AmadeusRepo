package testpractice;

public class OrderAgnostic {

	static int search(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		boolean isAsc;
		if(arr[start]<arr[end]) {
			isAsc=true;
		}
		else {
			isAsc=false;
		}
	
	
	while(start<=end) {
		int mid=start+(end-start)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		
		if(isAsc==true) {
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			
		}
		else {
			if(target>arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
	}
	return -1;
	}
	public static void main(String[] args) {
	//	int arr[]= {90, 75, 18, 12, 6, 4 ,3, 1};
		int arr[]= {1,3,4,6,12,18,75,90};
		int target=758;
		int ans=search(arr, target);
	System.out.println(ans);
	}
}
