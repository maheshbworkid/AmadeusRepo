package Concepts;

public class BlocksExample {
	BlocksExample(){
		System.out.println("Running constructor");
	}
	
	static {
		System.out.println("Running static block");
	}
	
	{
		System.out.println("Running non static block");
	}
	
	void disp() {
		System.out.println("Running disp");
	}
	
	static void test() {
		System.out.println("Running test");
	}
public static void main(String[] args) {
	test();
	new BlocksExample().disp();
	
	
}
}

/*****
 * Platform independent language
 * Object oriented pgm language
 * Easy to learn
 * compilation and interpretation
 * Open source
 * Highly robust
 * Highly secured 
 * 
 * 
 * 
