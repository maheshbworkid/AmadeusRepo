package BinarySearchAlgos;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
	static int[] search(int nums[], int target) {
		int ans[]= {-1,-1};
	
		int starting=binarySearch(nums, target, true);
		int ending=binarySearch(nums, target, false);
		 
		ans[0]=starting;
		ans[1]=ending;
		return ans;
	}
	
	static int binarySearch(int nums[], int target, boolean startIndex) {

		

	
int ans=-1;
if(startIndex==true) {
	for(int i=0; i<=5; i++) {
		if(nums[i]==target) {
			ans=i;
			return ans;
		}
	}
	
}

else {
	for(int i=5; i>=0; i--) {
		if(nums[i]==target) {
			ans=i;
			return ans;
		}
	}
}
return ans;
}


	
	
public static void main(String[] args) {
	int nums[]= {5,7,7,8,8,10};
	int target=8;
	int ans[]=search(nums, target);
	System.out.println(Arrays.toString(ans));
}
}
