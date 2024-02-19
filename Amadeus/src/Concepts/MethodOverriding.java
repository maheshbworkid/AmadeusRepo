package Concepts;

class Temp{
static void disp() {
	System.out.println("1mp");	
	}
}
public class MethodOverriding extends Temp{
static void disp() {
	System.out.println("3mp");	
	}
public static void main(String[] args) {
	MethodOverriding m1=new MethodOverriding();
	m1.disp();
	
}
}
