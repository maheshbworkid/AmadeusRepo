package functions;

public class ReverseAstring {
	static void reverse(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			 System.out.println(str.charAt(i));
		}	
	}
public static void main(String[] args) {
	String str="Welcome to java";
	reverse(str);
    
//	String [] words=str.split(" ");
//	String reverseString= "";
//	for(String w:words) {
//		
//		
//		String reversewords="";
//		
//		for(int i=w.length()-1; i>=0;i--) {
//			reversewords=reversewords+w.charAt(i);
//		}
//		reverseString=reverseString+reversewords+" ";
//	}
//System.out.println(	reverseString);
}
}
