package testpractice;

public class ConstructorOverloading {

	ConstructorOverloading(int a){
		this("rahul", 'x');
		
		System.out.println("this is running integer value");
	}
	
	ConstructorOverloading(){
		this(20);
		System.out.println("this is blank");
	}
	
	ConstructorOverloading(String y, char ch){
		System.out.println("this is running string and character");
	}
	public static void main(String[] args) {
		ConstructorOverloading v1=new ConstructorOverloading();
//		ConstructorOverloading v2=new ConstructorOverloading(20);
//		ConstructorOverloading v3=new ConstructorOverloading("rahul", 'a');
		
		
	}
	
}
