package functions;



class C{
int a=99;
void lit(PassbyreferenceExample p3) {
System.out.println(p3.c);
	System.out.println("Running lit");
	p3.disp();
}
	}

public class PassbyreferenceExample {
	int c=40;

	void disp() {
		System.out.println("Running disp");
	}
	
	static void post(PassbyreferenceExample p2) {
		
		System.out.println("running post");
		System.out.println(p2.c);
		p2.disp();
	}
public static void main(String[] args) {
	PassbyreferenceExample p1=new PassbyreferenceExample();
	post(p1);
	 
	C c1=new C();
	System.out.println(c1.a);
	c1.lit(p1);
}
}
