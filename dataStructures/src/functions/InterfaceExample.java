package functions;


abstract class XYZ implements Example{
	public void disp() {
		System.out.println("Running disp");
	}
}
public class InterfaceExample extends XYZ{
 public void test() {
	System.out.println("Running test");
}
 public void post() {
	 System.out.println("Running post");
 }
	public static void main(String[] args) {
		InterfaceExample i1=new InterfaceExample();
		i1.test();
		i1.post();
		i1.disp();
	}
	
}