package Concepts;

public class PassByValue {
	
	void demo() {
		System.out.println("Running demo");
	}
	static void disp(int x, PassByValue p2) {
		p2.demo();
		System.out.println(x);
		System.out.println("Running passby value");
	}
public static void main(String[] args) {
	PassByValue p1=new PassByValue();
	
	disp(22, p1);
}
}
