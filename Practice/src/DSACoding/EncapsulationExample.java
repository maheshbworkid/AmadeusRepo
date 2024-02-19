package DSACoding;

public class EncapsulationExample {
	
	private int balance=2000;
	
 void getBalance() {
		System.out.println(balance);
	}
 
 int setBalance(int addBalance) {
	this.balance=addBalance+balance;
	return this.balance;
 }
public static void main(String[] args) {
	EncapsulationExample e1=new EncapsulationExample();
	e1.getBalance();
	System.out.println(e1.setBalance(599));
	
}
}
