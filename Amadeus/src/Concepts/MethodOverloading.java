package Concepts;

public class MethodOverloading {
	
	void disp(int a) {
		System.out.println("Running int");
	}
	
	void disp(String st) {
		System.out.println("Running String");	
	}
	
	void disp(char ch, int x) {
		System.out.println("Running ch and int");
	}
	
	void disp(int u, char c) {
		System.out.println("Running int and ch");
	}
public static void main(String[] args) {
new MethodOverloading().disp(20);
new MethodOverloading().disp("test");
new MethodOverloading().disp('c', 55);
new MethodOverloading().disp(99, 'z');

	
}
}
