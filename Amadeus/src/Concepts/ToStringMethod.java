package Concepts;

public class ToStringMethod {
	String name;
	int num;
	ToStringMethod(String name, int num){
		this.name=name;
		this.num=num;
	}
	
	public String toString() {
		return getClass().getName()+ "@" + Integer.toHexString(hashCode());
		
	}
	
	
public static void main(String[] args) {
	ToStringMethod t1=new ToStringMethod("ram", 101);
	ToStringMethod t2=new ToStringMethod("lakshman", 102);
	System.out.println(t2);
	System.out.println(t1);
}
}
