package Concepts;
class Sample21{
final void disp() {
		System.out.println("test");
	}
}
public  class FinalKeywordExample extends Sample21{
	static final double a=3.14;
	 void disp() {
		System.out.println("post");
	}
public static void main(String[] args) {
new	FinalKeywordExample();
}
}
