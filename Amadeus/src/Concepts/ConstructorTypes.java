package Concepts;

public class ConstructorTypes {
	ConstructorTypes(){
	System.out.println("Running non paramatrized constructor ");	
	}
	
	ConstructorTypes(String sb){
		System.out.println(sb);
	}
public static void main(String[] args) {
	ConstructorTypes c1=new ConstructorTypes();
	ConstructorTypes c2=new ConstructorTypes("test");
	
}
}
