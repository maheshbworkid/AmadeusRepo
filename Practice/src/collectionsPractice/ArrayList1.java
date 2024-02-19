package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
void disp() {
	System.out.println("Running disp");
}
	public static void main(String[] args) {
//		ArrayList l3=new ArrayList();
//		l3.add(999);
//		l3.add('P');
//		l3.add("dev");
		
		ArrayList l6=new ArrayList();
		l6.add(10);
		l6.add(20);
		l6.add(30);
		l6.add("test123");
		l6.add('z');
		l6.add(null);
		l6.add(null);
		System.out.println(l6.toString());
		System.out.println(l6.size());
		System.out.println(l6.contains(20));
		//List l2=Collections.synchronizedList(l6);
//		System.out.println(l7);
//		l1.addAll(l3);
		System.out.println(l6);
		
		
	}
}
