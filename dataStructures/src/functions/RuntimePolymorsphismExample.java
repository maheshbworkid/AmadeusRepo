package functions;

class Corporates{
	void Engineers() {
		System.out.println("Life of coporates");
	}
}

class Manager extends Corporates{
	void Engineers() {
		System.out.println("Manager rules");
	}
}

class Lead extends Corporates{
	void Engineers() {
		System.out.println("Lead rules");
	}
}

class Junior extends Corporates{
	void Engineers() {
		System.out.println("Junior sucks");
	}
}
public class RuntimePolymorsphismExample {
public static void main(String[] args) {
	Corporates c1=new Manager();
	Corporates c2=new Lead();
	Corporates c3=new Junior();


	c1.Engineers();
	c2.Engineers();
	c3.Engineers();
	
	int x=(int)10.35;
	
	double y=(double)10;
	System.out.println(x);
	System.out.println(y);
}
}
