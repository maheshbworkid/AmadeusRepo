package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
public static void main(String[] args) {
	HashMap h1=new HashMap();
//	IdentityHashMap h1=new IdentityHashMap();
	Integer i1=new Integer(10);
	Integer i2=new Integer(20);
	h1.put(i1, "pawan");
	h1.put(i2, "kalyan");
	System.out.println(h1);
	//
	//System.out.println();
//	h1.put(1, "rahul");
//	h1.put(2, "arun");
//	h1.put(3,  "Rohit");
//	h1.put(4,  "sharan");
//	h1.put(5,  "test");
//	h1.put(5, "Kishan");
	System.out.println(h1);
//	System.out.println(h1.keySet());
//	System.out.println(h1.values());
//	System.out.println(h1.containsKey(10));
//	System.out.println(h1.containsValue("test"));
//	Collection c1=h1.keySet();
//	Iterator itr=c1.iterator();
//	while(itr.hasNext()) {
//		Map.Entry m1=(Map.Entry)itr.next();
//		System.out.println(m1.getKey() + "  " + m1.getValue());
//		if(m1.getKey().equals(5)) {
//		m1.setValue("Bumrah");	
//		}
//		System.out.println(h1
//				);
	//	}
}
}
