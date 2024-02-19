package functions;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {
public static void main(String[] args) {

ArrayList l1=new ArrayList();
l1.add(10);
l1.add(60);
l1.add(30);
l1.add(10);
l1.add(50);
HashSet<Integer> h=new HashSet<Integer>();


if(l1.size()==h.size()) {
	System.out.println("duplicates not present");
}
else {
	System.out.println("duplicates are present");	
}

if(h.addAll(l1)) {
	System.out.println(l1);
}
}
}
