package Collections;

import java.util.Comparator;
import java.util.TreeMap;
class MyComparator2 implements Comparator{
	public int compare(Object obj1, Object obj2) {
	String s1=obj1.toString();
	String s2=obj2.toString();
	return s2.compareTo(s1);
		
	}
	
}
public class TreeMapSorting {
public static void main(String[] args) {
	TreeMap t1=new TreeMap(new MyComparator2());
	t1.put("rahul", 100);
	t1.put("rohan", 200);
	t1.put("rohit", 188);
	t1.put("shyam", 121);
	System.out.println(t1);
	
	
}
}
