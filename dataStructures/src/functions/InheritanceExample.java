package functions;
class Q{
	int x=99;
	void test(){
		System.out.println("Running test method");
	}
}

class P extends Q{
	int a=50;
	void disp(){
	System.out.println("Running sub calss methods");	
	}
}
public class InheritanceExample  extends P{
int c=90;
void post() {
	System.out.println("Running superclass method");
}
	public static void main(String[] args) {
		InheritanceExample i1=new InheritanceExample();
		i1.disp();
		i1.post();
		System.out.println(i1.a);
		System.out.println(i1.c);
		i1.test();
		System.out.println(i1.x);
	}
}