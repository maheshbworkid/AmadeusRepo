package BinarySearchAlgos;

public class FindTarget {
	static int search(int arr[], int target){
		if(arr.length==0) {
			return -1;
		}
		
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			
			if(target==arr[mid]) {
				return mid;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int arr[]= {2,4,9,11,13,15,19,27,56};
	int target=190;
	int ans=search(arr, target);
	System.out.println(ans);
}
}
