package ExceptionHandling;

public class Sample {
	
	void stuff() {
		doStuff();
		System.out.println("Running stuff");
	}
	void doStuff() {
		doMoreStuff();
		System.out.println(10/0);
		System.out.println("Running doStuff");
	}
	void doMoreStuff() {
		//System.out.println(10/0);//the method in which exception occurs is responsible for 
		//creating exception object
		System.out.println("Running domorestuff");
	}
public static void main(String[] args) {
	Sample s1=new Sample();
	s1.stuff();
}
}
