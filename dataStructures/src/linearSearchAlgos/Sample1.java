package linearSearchAlgos;

public class Sample1 {

	
	static int lSearch(int arr[], int target) {
		if(arr.length==0) {
			return -1;
			
		}
		
		for(int ele:arr) {
			if(ele==target) {
				return ele;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {23, 4,5,2,45,-2,10,22};
		int target=10;
	int ans=lSearch(arr, target);
	System.out.println(ans);
		
	}
}
