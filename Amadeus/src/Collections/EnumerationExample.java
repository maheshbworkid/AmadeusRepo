package Collections;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.addElement(10);
	v1.addElement(20);
	v1.addElement(33);
	v1.addElement(55);
	System.out.println(v1);
	Enumeration e=v1.elements();
	while(e.hasMoreElements()) {
		Integer i1=(Integer)e.nextElement();
		if(i1%2==0) {
			System.out.println(i1);
		}
	}
	System.out.println(v1);
	
	
}
}
