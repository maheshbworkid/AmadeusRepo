package functions;

public class SplitMethod {

	public static void main(String[] args) {
		String s1="this-is-the-example-for-split-method-the-test";
		//String st[]=s1.split(" ");
		//String st[]=s1.split(" ",4);
		String st[]=s1.split("the");
		for(String element:st) {
			System.out.println(element);
		}
	}
}
