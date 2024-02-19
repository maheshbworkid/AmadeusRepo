package functions;

public class ToStringExample {
//	String name;
	int rollno;
	



ToStringExample(int rollno){
		//this.name=name;
this.rollno=rollno;
	}


public int hashcode() {
	return rollno;
}

public static void main(String[] args) {
	ToStringExample t1=new ToStringExample(10);
	ToStringExample t2= new ToStringExample(20);
	System.out.println(t1.hashcode());
	System.out.println(t2.hashcode());
}
}
