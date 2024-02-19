package functions;
class ST{
	int a=99;
	void disp() {
		System.out.println("Runing superclass");
	}
}
public class TypeCasting extends ST {
int k=88;
void post() {
	System.out.println("Running subclass");
}
public static void main(String[] args) {
		
	ST t1=	new TypeCasting();
	System.out.println(t1.a);
	t1.disp();
	 TypeCasting t2=(TypeCasting)t1;
	t2.post();
	t2.disp();
	
		double c=20;
		System.out.println(c);
		double d=(double)c;
		System.out.println(d);
		int a=(int)20.0;
		System.out.println(a);
	}
}
