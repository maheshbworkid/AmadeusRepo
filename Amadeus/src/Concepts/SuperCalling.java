package Concepts;
class Testing{
	Testing(int x){
		System.out.println("Running testing");
	}
}
class Calling extends Testing{
	Calling(String st){
		super(20);
		System.out.println("Running calling");
	}
}
public class SuperCalling  extends Calling{
	SuperCalling(){
		super("test");
		System.out.println("Running supercalling");
	}
public static void main(String[] args) {
	SuperCalling s1=new SuperCalling();
	
}
}
