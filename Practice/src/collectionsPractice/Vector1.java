package collectionsPractice;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(10);
		v1.add(60);
		v1.addElement(10);
		v1.addElement(null);
		v1.addElement('t');
		v1.addElement("testpurpose");
		System.out.println(v1);
		v1.removeElement(null);
		System.out.println(v1);
	
		System.out.println(	v1.elementAt(3));
		
		System.out.println(v1.capacity());
	}
}
