package Concepts;
class SampleTest{
	static SingleTonDesignPattern obj1=SingleTonDesignPattern.getInstance();
	static SingleTonDesignPattern obj2=SingleTonDesignPattern.getInstance();
	
}
public class SingleTonDesignPattern extends SampleTest{
	private SingleTonDesignPattern() {
		
	}
	
	private static SingleTonDesignPattern instance;
	static SingleTonDesignPattern getInstance() {
	if(instance==null) {
		instance=new SingleTonDesignPattern();
	}
	
	return instance;
	}
public static void main(String[] args) {
	System.out.println(obj1);
	System.out.println(obj2);
}
}
