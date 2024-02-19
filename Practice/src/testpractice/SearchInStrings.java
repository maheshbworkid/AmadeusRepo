package testpractice;

public class SearchInStrings {

	static boolean search(String st, char target) {
		if(st.length()==0) {
			return false;
		}
		 
//		for(int i=0; i<st.length(); i++) {
//			if(st.charAt(i)==target) {
//				return true;
//			}
//		}
//		return false;
		
		for(char ch: st.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String name="praful";
		char target='z';
		boolean p=search(name, target);
		System.out.println(p);
	}
}
