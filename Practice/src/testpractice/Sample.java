package testpractice;

public class Sample {
	 int physics;
	 int chemistry;
	 int maths;
	  Sample(int x,int y,int z){
		 physics=x;
		 chemistry=y;
		 maths=z;
		 	  
	  }
	 
	 void test() {
		System.out.println("test");
	}
public static void main(String[] args) {
	Sample S1=new Sample(20,30,40);
	System.out.println(S1.physics);
	System.out.println(S1.chemistry);
	System.out.println(S1.maths);	
	
}
}
