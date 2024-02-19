package linearSearchAlgos;

public class RangeOfIndex {
	static int range(int arr[], int start, int end, int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=start;i<end;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int arr[]= {2,3,5,7,111,4,6,66};
	int start=2;
	int end=5;
	int target=111;
	int ans=range(arr, start, end, target);
	System.out.println(ans);
	
}
}
