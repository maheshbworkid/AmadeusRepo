package testpractice;

public class InfiniteArray {
	static int search(int arr[], int target) {
		int start=0;
		int end=1;
		
		while(target>arr[end]) {
			int newStart=end+1;
			end=end+(end-start+1)*2;
			start=newStart;
		}
		return binarySearch(arr, target, start, end);
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
public static void main(String[] args) {
	int arr[]= {1,3,4,6,8,9,11,13,22,44,56,78,99, 101, 122, 124,215};
	int target=56;
	int answer=search(arr, target);
	System.out.println(answer);
}
}
