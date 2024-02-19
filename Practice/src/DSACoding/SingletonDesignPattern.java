package DSACoding;
class Test{
	
	private Test() {
		
	}
	
	static private Test instance;
	
	static Test SingletonInstance(){
	if(instance==null) {
		instance=new Test();
	}
	return instance;
	}
	
}
public class SingletonDesignPattern {
	
public static void main(String[] args) {
	Test t1=Test.SingletonInstance();
	Test t2=Test.SingletonInstance();
}
}
