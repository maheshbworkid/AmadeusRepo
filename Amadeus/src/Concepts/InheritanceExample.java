package Concepts;
class Test{
void disp(){
	System.out.println();
}
}
class Sample extends Test {

}

class Demo extends Test{
		
}
public class InheritanceExample {
public static void main(String[] args) {
	Demo  d1=new Demo();
	d1.disp();
	Sample s1=new Sample();
	s1.disp();
}
}
