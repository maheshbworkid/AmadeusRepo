package functions;

public class ThisKeyword {
	int a=10;
	int b=20;
	int c=30;
	
	ThisKeyword(int a, int b, int c){
		a=this.a;
		b=this.b;
		c=this.c;
		
	}
	
public static void main(String[] args) {
	ThisKeyword t1=new ThisKeyword(100,200,300);
	System.out.println(t1.a);
	System.out.println(t1.b);
	System.out.println(t1.c);
}
}
