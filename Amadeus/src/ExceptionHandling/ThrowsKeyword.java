package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsKeyword {
public static void main(String[] args) throws FileNotFoundException{
//	try{
		PrintWriter pt=new PrintWriter("abc.txt");
		pt.print("test");
 System.out.println("hello");

//	}
//	catch(FileNotFoundException f) {
//		System.out.println("test");
//		
//			
//	}
	
	
	
}
}
