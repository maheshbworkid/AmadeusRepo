package collectionsPractice;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
	String i1=obj1.toString();
	String i2=obj2.toString();
//	if(i1<i2) {
//		return +1;
//	}
//	else if(i1>i2) {
//		return -1;
//	}
//	else {
//		return 0;
//	}
	return i1.compareTo(i2);
	}
}

public class Treeset1 {
public static void main(String[] args) {
	TreeSet t1=new TreeSet(new MyComparator1());
//	TreeSet t1=new TreeSet();
//	t1.add(10);
//	t1.add(50);
//	t1.add(39);
//	t1.add(20);
//	t1.add(5);
	t1.add("A");
	t1.add(new StringBuffer("ABC"));
	t1.add(new StringBuffer("AA"));
	t1.add("XX");
	t1.add("ABCD");
	t1.add("C");
	System.out.println(t1);
	
	
	
	
}
}
