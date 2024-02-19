package BinarySearchAlgos;

public class InfiniteArray {
	static int search(int arr[], int target) {
		int start=0;
		int end=1;
		
		while (target>arr[end]) {
			int newstart=end+1;
			int newend=end+(end-start+1)*2;
			
			start=newstart;
			end=newend;
		}
		
		return binarysearch(arr, target, start, end);
	}

	static int binarysearch(int arr[], int target, int start, int end) {
	
		
		while (start<=end) {
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
	public static void main(String[] args) {
		int arr[]= {2,3,5,7,9,11,14,16,17,19,22,33,44,55,66,77,88,99,103,105,107,111,112,115,118};
		int target=44;
		int ans=search(arr, target);
		System.out.println(ans);
		
	}
}
