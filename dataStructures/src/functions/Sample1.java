package functions;

import java.util.Arrays;

public class Sample1 {

	static void changeName(String name) {
		name="biradar mahesh";
		System.out.println(name);
	}
	static void change(int arr[]) {
		arr[0]=100;
	}
	static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a + "  " + b);
		
	}
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	static void multiple(int a, int b, int...v) {
		System.out.println(Arrays.toString(v));
	}
	public static void main(String[] args) {
		String name= "mahesh biradar";
		changeName(name);
		
		int arr[]= {2,5,7,9,11};
		System.out.println(name);
		change(arr);
		System.out.println(Arrays.toString(arr));
		int a=10;
		int b=20;
		swap(a, b);
		fun(2,3,4,6,7,8,9);
		multiple(200, 300, 3,4,5,6,7);
		
		
				
	}
}
