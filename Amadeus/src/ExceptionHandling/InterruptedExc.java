package ExceptionHandling;

public class InterruptedExc extends Throwable{
	void stuff() throws InterruptedExc{
	doStuff();	
	System.out.println("test");
	}
	
	void doStuff() throws InterruptedExc{
	domorestuff();	
	System.out.println("test");
	}
	
	void domorestuff() throws InterruptedExc{
		
		Thread.sleep(1000);
		
	}
public static void main(String[] args) throws InterruptedExc{
	InterruptedExc i1=new InterruptedExc();
	i1.stuff();
	
}
}
