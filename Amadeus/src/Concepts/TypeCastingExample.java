package Concepts;
class Above{
	void disp() {
		System.out.println("running disp");
	}
}

public class TypeCastingExample extends Above{
	void test() {
		System.out.println("running test");
	}
public static void main(String[] args) {
	Above a1=new TypeCastingExample();
	a1.disp();
	TypeCastingExample t1=(TypeCastingExample)a1;
	t1.test();
	t1.disp();
}
}
