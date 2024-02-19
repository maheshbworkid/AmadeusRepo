package functions;

public class VariableShadowing {
 int a=25;

 void disp() {
	 int a=30;
	 System.out.println(this.a);
 }
	public static void main(String[] args) {
		
	new VariableShadowing().disp();
	                             
	}
}
