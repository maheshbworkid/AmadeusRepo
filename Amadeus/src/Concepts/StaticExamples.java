package Concepts;

class MainTest{
	static int x=50;
	static void test() {
		
		System.out.println("Running test");
	}
}
public class StaticExamples {
static void	disp(){
		System.out.println("Running disp");
	}
public static void main(String[] args) {
	
	int a=10;
	System.out.println(a);
	disp();
	MainTest.test();
	System.out.println(MainTest.x);
	
}
}
