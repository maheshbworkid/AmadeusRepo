package collectionsPractice;

import java.util.Comparator;
import java.util.TreeMap;
class MyComparator5 implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
public class SortedMap1 {

	public static void main(String[] args) {
		
	TreeMap t1=new TreeMap(new MyComparator5());
	//t1.put(null, "test");
	t1.put(10, "Ram");
	t1.put(20, "Mahesh");
	t1.put(30, "Sharan");

	//t1.put(null, "post");
	t1.put(30, "Sharanappa");
	t1.put(99, "Dev");
	t1.put(11, null);
	System.out.println(t1);
//	System.out.println(t1.firstKey());
//	System.out.println(t1.lastKey());
//	System.out.println(t1.firstEntry());
//	System.out.println(t1.lastEntry());
//	System.out.println(t1.headMap(30));
//	System.out.println(t1.tailMap(20));
//	
	
	}
}
