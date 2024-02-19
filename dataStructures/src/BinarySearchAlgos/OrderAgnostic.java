package BinarySearchAlgos;

public class OrderAgnostic {
	static int search(int arr[], int target) {
		if(arr.length==0) {
			return -1;
		}
		
		int start=0;
		int end=arr.length-1;
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
	int arr[]= {99,88,77,66,55,44,33,22,11};
	int target=66;
	int ans=search(arr, target);
	System.out.println(ans);
}
}
