package testpractice;

public class SingleTonPattern {

	private SingleTonPattern(){
		
	}
	
	private static SingleTonPattern instance;
	
	public static SingleTonPattern getInstance() {
		if(instance==null) {
			instance=new SingleTonPattern();
		}
		return instance;
	}

	
}

