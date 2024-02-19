package Concepts;

public class EqualsMethod {
	
	String name;
	int rollno;
	
	EqualsMethod(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	
	public boolean equals(Object obj) {
		String name1=this.name;
		int rollno1=this.rollno;
		
		EqualsMethod e2=(EqualsMethod) obj;
		String name2=e2.name;
		int rollno2=e2.rollno;
		try {
		if(name1.equals(name2) && rollno1==rollno2) {
			return true;
		}
		return false;
	}
	catch(NullPointerException e) {
	return false;	
	}
	catch(ClassCastException c) {
		return false;
	}
	
	}
	
	
public static void main(String[] args) {
	EqualsMethod e1=new EqualsMethod("rahul", 101);
	EqualsMethod e2=new EqualsMethod("rohit", 102);
	EqualsMethod e3=new EqualsMethod("rahul", 101);
	EqualsMethod e4=new EqualsMethod("ram", 111);
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
	System.out.println(e1.equals(e4));
	System.out.println();
	System.out.println(e1.equals(null));
}
}
