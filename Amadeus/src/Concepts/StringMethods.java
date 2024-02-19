package Concepts;

public class StringMethods {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Encyclopedia");
	System.out.println(sb.capacity());//28
	System.out.println(sb.append("Testpurposeqwertyuiop"));
	System.out.println(sb.capacity());//58
	System.out.println(sb.reverse());
	System.out.println(sb.insert(2, "Dev"));
	System.out.println(sb.replace(8, 10, "pos"));
	sb.ensureCapacity(1000);
	System.out.println(sb.capacity());
	sb.trimToSize();
	System.out.println(sb.capacity());
	
}
}
