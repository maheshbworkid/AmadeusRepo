package functions;

class DC{
	DC(int z){
		System.out.println("Running super superclass constructor");
	}
}
class AB extends DC{
	 AB(int v){
		 super(99);
		System.out.println("Running Supeerclass constructor"); 
	 }
	
}

public class SuperCallingStatement extends AB {
	
	SuperCallingStatement(){
		super(30);
		System.out.println("Running subclass constructor");
	}
public static void main(String[] args) {
	SuperCallingStatement s1=new SuperCallingStatement();
	
	
}
}

