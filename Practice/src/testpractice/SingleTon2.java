package testpractice;

public class SingleTon2 {
	public static void main(String[] args) {
		SingleTonPattern obj1=SingleTonPattern.getInstance();
		System.out.println(obj1);
		SingleTonPattern obj2=SingleTonPattern.getInstance();
		System.out.println(obj2);
	}
	
}
