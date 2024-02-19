package collectionsPractice;

import java.util.Comparator;
import java.util.TreeSet;
 class MyComparator implements Comparator {
	 
	 public int compare(Object obj1, Object obj2) {
		 Integer i1=(Integer)obj1;
		 Integer i2=(Integer)obj2;
		 if(i1<i2) {
			 return +1;
		 }
		 else if(i1>i2) {
			 return -1;
		 }
		 else {
			 return 0;
		 }
	 }
	 
 }
public class SortedSetExample {
public static void main(String[] args) {
	TreeSet t1=new TreeSet(new MyComparator());
	t1.add(10);
	t1.add(90);
	t1.add(50);
	t1.add(5);
	t1.add(19);
	t1.add(99);
	System.out.println(t1);
	System.out.println(t1.first());
	System.out.println(t1.last());
//System.out.println(t1.subSet(10,90));
//	System.out.println(t1.tailSet(19));
//	System.out.println(t1.headSet(50));
//System.out.println(t1.comparator());
//System.out.println(t1);
}
}
