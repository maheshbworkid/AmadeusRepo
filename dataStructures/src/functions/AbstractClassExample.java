package functions;

abstract class Test{
	abstract void demo();
	abstract void disp();
	void post() {
		System.out.println("Running post");
	}
}

abstract class Sample2 extends Test implements TestPurpose{
	void demo() {
		System.out.println("Running demo");
	}
public 	void create() {
	System.out.println("creating");	
	}
	}
public class AbstractClassExample extends Sample2 {
	void disp() {
	System.out.println("Running disp");	
	}
	public void done()
	{
	System.out.println("Running done");	
	}
	public static void main(String[] args) {
		AbstractClassExample a1=new AbstractClassExample();
		a1.demo();
		a1.disp();
		a1.done();
		a1.create();
	
	}
}
