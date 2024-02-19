package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	//LinkedHashSet h1=new LinkedHashSet();
	//Underlying ds is hashtable
	//Duplicates are not allowed
	//insertion order is not preserved
	//Null insertion is possible
	//Best option search operation
	//serializable and clonale interface
	h1.add(10);
	h1.add(10);
	h1.add(20);
	h1.add(44);
	h1.add(99);
	h1.add("test");
	h1.add(null);
	System.out.println(h1.add(10));
	System.out.println(h1);
	
	
}
}
