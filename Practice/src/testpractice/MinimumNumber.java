package testpractice;

public class MinimumNumber {
	static int searchMin(int arr[]){
		int min=arr[0];
		
		if(arr.length==0) {
			return -1;
		}
	
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		return min;
	}
public static void main(String[] args) {
	int arr[]= {18, 12, -7, 3, 14 , 28, -1, -9};
	int ans=searchMin(arr);
	System.out.println(ans);
			
	}
}

