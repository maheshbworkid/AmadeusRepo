package testpractice;

public class LinearSearch {
	
	static int search(int arr[], int target) {
		if(arr.length==0) {
			return -1;
		}
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		
		int arr[]= {10,22,33,44,55};
		int target=3;
		int z=search(arr, target);
		System.out.println(z);
		
	}
}
//