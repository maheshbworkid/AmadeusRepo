package functions;

public class ThisKeywordExample {
int maths;
int phy;
int chem;

ThisKeywordExample(int maths, int phy, int chem){
	this.maths=maths;
	this.phy=phy;
	this.chem=chem;
}
	
	
	public static void main(String[] args) {
		ThisKeywordExample s1=new ThisKeywordExample(100,200,300);
	System.out.println(s1.maths);	
	System.out.println(s1.chem);	
	System.out.println(s1.phy);	
	
	}
}
