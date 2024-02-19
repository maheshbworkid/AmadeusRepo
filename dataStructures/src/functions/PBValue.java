package functions;


public class PBValue {
	int b=44;
void test(int a) {
	System.out.println(a);	
	}

static void posting(PBValue p2) {
	System.out.println("Running pass by reference");
	System.out.println(p2.b);
	p2.test(22);
}
public static void main(String[] args) {
	PBValue p1=new PBValue();
	posting(p1);
	
}
}
