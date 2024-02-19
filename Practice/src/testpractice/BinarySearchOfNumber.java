package testpractice;

public class BinarySearchOfNumber {
	
	static int bsearch(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		if (arr.length==0) {
			return -1;
		}
		
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
		int arr[]= {2,4,5,6,7,8,9,11,22,34};
		int target=-109;
		int ans=bsearch(arr, target);
		System.out.println(ans);
	}
}
