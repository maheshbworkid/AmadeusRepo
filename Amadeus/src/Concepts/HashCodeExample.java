package Concepts;

public class HashCodeExample {
	String name;
	int rollno;
	HashCodeExample(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}

	public String toString() {
		return name+ " " + rollno;
	}
	public int hashCode() {
		return rollno;
	}
public static void main(String[] args) {
	HashCodeExample h1=new HashCodeExample("lion", 10);
	HashCodeExample h2=new HashCodeExample("tiger",100);
	System.out.println(h1);
	System.out.println(h2);
}
}
