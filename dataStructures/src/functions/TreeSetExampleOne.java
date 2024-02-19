package functions;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
//		if(i1<i2) {
//			return +1;
//		}
//		else if(i1>i2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		
		return -i1.compareTo(i2);
	}
}
public class TreeSetExampleOne {
public static void main(String[] args) {
	TreeSet t1=new TreeSet(new MyComparator());
	t1.add(10);
	t1.add(50);
	t1.add(30);
	t1.add(40);
	t1.add(99);
	System.out.println(t1);
	
}


}
