package Concepts;

public class ThisCallingStatment {
	ThisCallingStatment(int z, String st){
		System.out.println(z);
	}
	
	ThisCallingStatment(char ch){
		this(99, "demo");
	}
	
	ThisCallingStatment(int a){
		this('A');
		System.out.println("Running integer");
	}
	
	ThisCallingStatment(String sh){
		this(20);
		System.out.println("Running String");
	}
public static void main(String[] args) {
	ThisCallingStatment t1=new ThisCallingStatment("good");
}
}
