package testpractice;

public class SplitArrayLargestSum {
	
	static int splitArray(int arr[], int m) {
		int start=0;
		int end=0;
		
		for(int i=0; i<arr.length; i++) {
			start=Math.max(start, arr[i]);
			end+=arr[i];
		}
		
		while(start<end) {
			int mid=start+(end-start)/2;
		int	sum =0;
		int pieces=1;
		for(int num: arr) {
			if (sum+num>mid) {
				//you cannot add this in sub array make new one instead
				sum = num;
				pieces++;
			}
			else{
				sum+=num;
			}
		}
			
			
			
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {7,2,5,10,8};
		splitArray(arr);
	}
}
