package Concepts;

final public class ImmutableClassCreation {
	
	private int x=10;
	ImmutableClassCreation(int x){
		this.x=x;
	}
	
	public ImmutableClassCreation modify(int z) {
		if(this.x==z) {
			return this;
		}
		else {
			return new ImmutableClassCreation(z);
		}
	}
public static void main(String[] args) {
	ImmutableClassCreation i1=new ImmutableClassCreation(10);
	ImmutableClassCreation i2=i1.modify(200);
	ImmutableClassCreation i3=i1.modify(10);
	System.out.println(i1==i2);
	System.out.println(i1==i3);
	char [] ch= {'a', 'b', 'c'};
	String sh=new String(ch);
	System.out.println(sh);
	byte[] b1= {100, 101, 102, 103};
	String si=new String(b1);
	System.out.println(si);
	System.out.println();
}
}
