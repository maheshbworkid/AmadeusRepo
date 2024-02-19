package linearSearchAlgos;

public class Sample2 {
	static boolean search(String name, int target) {
	
		if(name.length()==0) {
			return false;
		}
		
//		for(int i=0; i<name.length();i++) {
//			if(name.charAt(i)==target) {
//				return true;
//			}
//		}
		for(char ch: name.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		return false;
	}
public static void main(String[] args) {
	String name="kunal";
	char target='u';
boolean ans=	search(name, target);
System.out.println(ans);
	
}
}
