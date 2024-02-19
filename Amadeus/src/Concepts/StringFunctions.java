package Concepts;

public class StringFunctions {
public static void main(String[] args) {
	String st="Encycl_opedia";
	System.out.println(st.length());
	System.out.println(st.charAt(3));
	System.out.println(st.contains("cyclo"));
	System.out.println(st.indexOf('c'));
	System.out.println(st.lastIndexOf('e'));
	System.out.println(st.startsWith("Encyclo"));
	System.out.println(st.endsWith("edio"));
	System.out.println(st.substring(3));
	System.out.println(st.substring(3, 7));
	System.out.println(st.toUpperCase());
	System.out.println(st.toLowerCase());
	String[] s2=st.split("_");
	for(String test:s2) {
		System.out.println(test);
	}
	System.out.println(st.concat("post"));
	
}
}
