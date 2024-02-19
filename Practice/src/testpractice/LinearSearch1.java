package testpractice;

public class LinearSearch1 {
	static int search(int arr[], int target){
		if(arr.length==0) {
			return -1;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
public static void main(String[] args) {
	
	int arr[]= {19, 12, 9, 14, 77, 50};
	int target=14;
	int ans=search(arr, target);
	System.out.println(ans);
}
}
