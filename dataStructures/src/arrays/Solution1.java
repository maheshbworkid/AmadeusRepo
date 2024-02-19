package arrays;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		//q: store a roll number
//		int a=19;
//		String name="mahesh";
//		//q: store 5 roll nos
//		int b=21;
//		int c=33;
//		int d=44;
//		int f=66;
//		int g=77;
		//1: store 500 roll numbers
		//syntax
	//	int arr[]=new int[5];
		//int arr[]= {10,20,30,40,50};
		//int arr[] = declaration here arr is getting defined in the stack = arr is reference variable
		//currently its not pointing to anything
		//actual memory creation happens when =new int[5]; object is created in the heap memory
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int row=0; row<arr.length;row++) {
			for(int col=0; col<arr[row].length;col++) {
				arr[row][col]=sc.nextInt();
			}
		}
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0; col<arr[row].length;col++) {
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
	}
}
