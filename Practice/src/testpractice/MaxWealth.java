package testpractice;

public class MaxWealth {
	
	static int maxwealth(int accounts[][]) {
		
	int ans=Integer.MIN_VALUE;
	for(int person=0; person<accounts.length; person++) {
		int sum=0;
		 for(int account=0; account<accounts[person].length; account++) {
			sum+=accounts[person][account] ;
		 }
		 if(sum>ans) {
				ans=sum;
			}
	}
	return ans;
	
	}
	
	
	
public static void main(String[] args) {
	int arr[][]= {
			{1,2,3},
			{3,4,5}
			};
	int p=maxwealth(arr);
	System.out.println(p);
}
}