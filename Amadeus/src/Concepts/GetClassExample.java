package Concepts;

import java.lang.reflect.Method;

public class GetClassExample {
	
	void disp() {
		System.out.println("methods");
	}
public static void main(String[] args) {
	Object obj=new GetClassExample();
	Class c1=obj.getClass();
	System.out.println(c1.getName());
	int count=0;
Method[] m1=c1.getDeclaredMethods();
for(Method ele:m1) {
	count++;
	System.out.println(ele.getName());
}
System.out.println(count);
}
}
