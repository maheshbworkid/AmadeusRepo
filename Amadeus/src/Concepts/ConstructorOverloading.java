package Concepts;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("constructor with no params");
	}
	
	ConstructorOverloading(int b){
		System.out.println("constructor with int params");
	}
	
	ConstructorOverloading(int c, char ch){
		System.out.println("constructor with int and char params");
	}
	
	ConstructorOverloading(char ch, int q){
		System.out.println("constructor with char and int params");
	}
public static void main(String[] args) {
	ConstructorOverloading c1=new ConstructorOverloading();
	ConstructorOverloading c2=new ConstructorOverloading(100);
	ConstructorOverloading c3=new ConstructorOverloading(99, 'A');
	ConstructorOverloading c4=new ConstructorOverloading('B',222);
}
}
