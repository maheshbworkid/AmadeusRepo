package functions;
class Demo{
	void post() {
		System.out.println("running non static method from another class");
	}
}
public class NonStaticExample {
	int a=20;
	
void parent() {
	System.out.println("running non static from main");
}
	public static void main(String[] args) {
		new NonStaticExample().parent();
		new Demo().post();
		System.out.println(new NonStaticExample().a);
		
		
	}
}
