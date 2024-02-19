package Concepts;

public class StringObjectCreation {
	
	
public static void main(String[] args) {
	String  st=new String("test");

	System.out.println(st.concat("post"));
	
	StringBuffer sb=new StringBuffer("test");
	System.out.println(sb);
	sb.append("post");
	System.out.println(sb);
	
	
}
}
