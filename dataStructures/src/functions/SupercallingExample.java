package functions;
class A1{
	A1(int a){
		System.out.println("Super A");
		System.out.println(a);
	}
}

class B1 extends A1{
	B1(){
		super(30);
		System.out.println("super B");
	}
}
public class SupercallingExample extends B1{
public static void main(String[] args) {
	SupercallingExample s1=new SupercallingExample();
	System.out.println("Running SupercallingExample");
}
}
