package functions;

import java.lang.reflect.Method;

public class EqualsMethod {
	String name;
	int rollno;
	
	public boolean equals(Object obj) {
		String name1=name;
		int rollno1=rollno;
		
		EqualsMethod e=(EqualsMethod)obj;
		String name2=e.name;
		int rollno2=e.rollno;
		
		if(name1.equals(name2) && rollno1==rollno2) {
			return true;
		}
		else {
			return false;
		}
	}
	EqualsMethod(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
public static void main(String[] args) {
	EqualsMethod e1=new EqualsMethod("durga", 101);
	EqualsMethod e2=new EqualsMethod("Ravi", 102);
	EqualsMethod e3=new EqualsMethod("durga", 101);
	EqualsMethod e4=e1;
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
	System.out.println(e1.equals(e4));
	
	int count =0;
	Class c1=e1.getClass();
	Method[] m1=c1.getDeclaredMethods();
	for(Method methods:m1) {
		System.out.println(methods.getName());
		count++;
	}
	System.out.println(count);
}
}
