package ExceptionHandling;

public class TryCatchExample1 {
public static void main(String[] args) {
	System.out.println("Hi");
	try {
		System.out.println(10/0); //risky code
	}
	catch(ArithmeticException a) {
	//a.printStackTrace();//Exception in thread main java.lang.ArithmeticException:/byzero
	// at ExceptionHandling.TryCatchExample.main()
	//System.out.println(a.getMessage());
System.out.println(a.toString());
	}
	//java.lang.ArithmeticException:/byzero	}

	System.out.println("Bye");
}
}
