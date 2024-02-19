package testpractice;

public class EncapsulationExample {

	private int balance=2000;
	
	public int getBalance(){
		return balance;
		
	}
	
	public int setBalance(int a) {
		this.balance=balance+a;
		return balance;
	}
	
	public static void main(String[] args) {
		EncapsulationExample e1=new EncapsulationExample();
		System.out.println(e1.getBalance());
		int newbalance=e1.setBalance(1000);
		System.out.println(newbalance);
		
	}
}
