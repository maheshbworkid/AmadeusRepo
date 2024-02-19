package functions;

class Sample{
	static void test() {
		System.out.println("Running static method from another class");
	}
}
public class StaticExample {

	static void post() {
		System.out.println("running static method from main");
	}
	public static void main(String[] args) {
		post();
		Sample.test();
	}
}
