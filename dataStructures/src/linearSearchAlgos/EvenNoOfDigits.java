package linearSearchAlgos;

public class EvenNoOfDigits {
	
	static int search(int arr[]) {
		int count=0;
		for (int num:arr) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	
	static boolean even(int num) {
		if(digits(num)%2==0) {
			return true;
		}
		return false;
	}
	static int digits(int num) {
		
		if(num<0) {
			num=num*-1;
		}
		
		if(num==0) {
			return 1;
		}
		int count=0;
		while(num>0) {
			count++;
			num=num/10;	
		}
		return count;
		
	}
	
	
public static void main(String[] args) {
	int arr[]= {12,345,2,6,7896,11};
	int ans=search(arr);
	System.out.println(ans);
}
}
