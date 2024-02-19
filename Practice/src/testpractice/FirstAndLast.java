package testpractice;

import java.util.Arrays;

public class FirstAndLast {
	
	static int[] firstandlast(int arr[], int target) {
		int ans[]= {-1, -1};
		int start=search(arr, target, true);
		int end=search(arr, target, false);
		
		ans[0]=start;
		ans[1]=end;
		return ans;
		
		
			}
	
	static int search(int arr[], int target, boolean findStartIndex) {
		int start=0;
		int end=arr.length-1;
		int ans= -1;;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				ans=mid;
				if(findStartIndex) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
		}
		return ans;

	}
public static void main(String[] args) {
	int arr[]= {5,7,7,8,8,10};
int target=11;
int answer[]=firstandlast(arr, target);
System.out.println(Arrays.toString(answer));
}
}
