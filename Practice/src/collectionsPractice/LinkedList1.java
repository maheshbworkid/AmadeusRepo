package collectionsPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(null);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add("test321");
	l1.add("test321");
	l1.add('u');
	l1.add(null);
	System.out.println(l1);
	l1.addFirst(0);
	l1.addLast(100);
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
	l1.removeFirst();
	System.out.println(l1);
	l1.removeLast();
	System.out.println(l1);
ArrayList l2=new ArrayList();
l2.addAll(l1);
System.out.println(l2);

	
}
}
