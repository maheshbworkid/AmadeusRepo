package linearSearchAlgos;

public class MaxWealth {

	static int calculate(int arr[][]){
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int rowsum=0;
			for(int j=0;j<arr[i].length;j++) {
				rowsum+=arr[i][j];
			}
			if(rowsum>max) {
				max=rowsum;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[][]= {
				
				{1,2,3},
				{4,1,6},
				{3,3,7}
		};
		int ans=calculate(arr);
		System.out.println(ans);
		
	}
}
