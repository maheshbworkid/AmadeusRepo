package functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public class CollectionInterface {
public static void main(String[] args) {
	
	Vector l=new Vector();
	l.addElement(20);
	l.addElement(30);
	l.addElement(40);
	System.out.println(l);
	Vector l2=new Vector();
	l2.addElement(100);
	l2.addElement(99);
	l2.addElement(80);
	l2.addElement(l);
	System.out.println(l2);
	Enumeration e=l2.elements();
	while(e.hasMoreElements()) {
	Integer i=(Integer) e.nextElement();
	if(i%2==0) {
		System.out.println(i);
	}
	}
	
	
}
}
