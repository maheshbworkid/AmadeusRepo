package functions;

class A{
	int a=20;
	void disp(){
		System.out.println("Running demo");
	}
}

 class Beat{
 static	A a1=new A();
}
public class CompositionExample {

	public static void main(String[] args) {
		Beat.a1.disp();
		System.out.println(Beat.a1.a);
	}
}
