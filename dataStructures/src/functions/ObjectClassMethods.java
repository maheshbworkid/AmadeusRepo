package functions;

import java.lang.reflect.*;

public class ObjectClassMethods {
public static void main(String[] args) throws ClassNotFoundException  {
	int count=0;
	Class c1=Class.forName("java.lang.Object");
	Method[] methods=c1.getDeclaredMethods();
	for(Method m1:methods) {
		System.out.println(m1.getName());
		count ++;
	}
	System.out.println(count);
}
}
