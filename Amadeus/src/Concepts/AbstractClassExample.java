package Concepts;
abstract class Text{
	abstract void test();
	abstract void disp();
	void plus() {
		System.out.println("Running plus");
	}
}
public class AbstractClassExample extends Text{
	void test() {
	System.out.println("Running test");	
	}
	void disp() {
	System.out.println("Running disp");	
	}
public static void main(String[] args) {
	AbstractClassExample a1=new AbstractClassExample();
	a1.test();
	a1.disp();
	a1.plus();
}
}
