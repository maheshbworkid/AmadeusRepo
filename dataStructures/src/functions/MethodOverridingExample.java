package functions;


class B{
	void demo(){
		System.out.println("3mp");
	}
}
public class MethodOverridingExample extends B {
	void demo() {
		System.out.println("5mp");
	}
	
	
public static void main(String[] args) {
	MethodOverridingExample m1=new MethodOverridingExample();
	m1.demo();
}
}
