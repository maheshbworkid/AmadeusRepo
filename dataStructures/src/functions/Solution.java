package functions;

import java.util.Scanner;

public class Solution {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in); 
			
			int size=scan.nextInt();
	        int arr[]=new int[size];
	       
	        for(int i=0;i<arr.length-1; i++){
	            String inputString = scan.nextLine();
	            System.out.print(inputString);
	        }
	 }
}
