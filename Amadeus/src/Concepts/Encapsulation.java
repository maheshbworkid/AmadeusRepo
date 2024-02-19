package Concepts;

public class Encapsulation {
	
	private int bal=2000;
	
	public int getBalance() {
		return bal;
	}
	
	public int setBalance(int x) {
		this.bal=x+bal;
		return bal;
	}
public static void main(String[] args) {
	Encapsulation e1=new Encapsulation();
	e1.getBalance();
	int newbal=e1.setBalance(300);
	System.out.println(newbal);
}
}
