package functions;

import java.util.Comparator;
import java.util.TreeSet;
class Employee implements Comparable {
	String name;
	int rollno;
	
	
	Employee(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public String toString() {
		return name +  "  " +rollno;
	}
	
	public int compareTo(Object obj) {
		int rollno1=this.rollno;
		Employee e=(Employee)obj;
		int rollno2=e.rollno;
		
		if(rollno1<rollno2) {
			return -1;
		}
		else if(rollno1>rollno2) {
			return +1;
		}
		else {
			return 0;
		}
	}
	
}

class Student implements Comparator{
//	String sname;
//	int sid;
//	
//	Student(String sname, int sid){
//		this.sname=sname;
//		this.sid=sid;
//	}
	
	public int compare(Object obj1, Object obj2) {
		Employee st1=(Employee) obj1;
		Employee st2=(Employee)obj2;
		String sname1=st1.name;
		String sname2=st2.name;
		return sname1.compareTo(sname2);
	}
}
public class TreeSetExample2 {	
	
public static void main(String[] args) {
Employee t1= new Employee("durga", 101);
	Employee t2=new Employee("Ravi", 102);
	Employee t3=new Employee("Mahesh", 105);
	Employee t4=new Employee("Manu", 100);
	Employee t5=new Employee("Malli", 200);
//	
//	Student s1= new Student("durga", 101);
//	Student s2=new Student("Ravi", 102);
//	Student s3=new Student("Mahesh", 105);
//	Student s4=new Student("Manu", 100);
//	Student s5=new Student("Malli", 200);
	
//	TreeSet t=new TreeSet();
//	t.add(t1);
//	t.add(t2);
//	t.add(t3);
//	t.add(t4);
//	t.add(t5);
//	System.out.println(t);
	
	TreeSet tent=new TreeSet(new Student());
	tent.add(t1);
	tent.add(t2);
	tent.add(t3);
	tent.add(t4);
	tent.add(t5);
	System.out.println(tent);
}
}
