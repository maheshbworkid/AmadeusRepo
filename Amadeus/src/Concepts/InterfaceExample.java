package Concepts;
interface Testing11{
	void disp();
	static void test() {
		
	}
}
public class InterfaceExample implements Testing11 {
	public void disp() {
		System.out.println("Running disp");
	}
	static void test() {
		System.out.println("Running test");
	}
public static void main(String[] args) {
	//InterfaceExample i1=new InterfaceExample();
	Testing11 t1=new InterfaceExample();
t1.disp();

}
}
