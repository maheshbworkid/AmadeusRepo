package testpractice;

public class EvenNumberOfDigits {
	
	static int findevenNum(int arr[]) {
		int count=0;
	for(int num:arr) {
		if(even(num)) {
			count++;
		}
	}
		
		return count;
	}
	
	static boolean even(int num) {
		int numberOfDigits=countdigits(num);
		if(numberOfDigits%2==0) {
			return true;
		}
		return false;
	}
	
	static int countdigits(int num) {
		int count=0; //7896>0 1
		//7892
		//783
		//74
		//0
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
		
	}
public static void main(String[] args) {
	int arr[]= {12, 34567, 2,6, 7896};
	int ans=findevenNum(arr);
	System.out.println(ans);
}
}
