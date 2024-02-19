package Collections;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
		
//		if(i1<i2) {
//			return +1;
//		}
//		else if(i1>i2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
	}
}

public class SortedSetExample {
public static void main(String[] args) {
	TreeSet t1=new TreeSet(new MyComparator());
	//t1.add(null);
	t1.add(20);
	t1.add(30);
	t1.add(50);
	t1.add(15);
	t1.add(10);
	t1.add(99);
	System.out.println(t1);
System.out.println(t1.first());
System.out.println(t1.last());
System.out.println(t1.headSet(30));
System.out.println(t1.tailSet(30));
System.out.println(t1.subSet(30, 10));
	//properties of treeset - balanced tree, duplicates not allowed, insetion some sorting order
	//hetrogenous not allowed - null possible only once
	
	
}
}
