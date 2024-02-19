package BinarySearchAlgos;

public class SmallestLetter {
	static char search(char arr[], char target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid =start +(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
				
			}
			else{
				start=mid+1;
			}
			
		}
		return arr[start%arr.length];
		
	}
public static void main(String[] args) {
	char arr[]= {'c', 'g', 'h'};
	char target='g';
	char ans=search(arr, target);
	System.out.println(ans);
}
}
