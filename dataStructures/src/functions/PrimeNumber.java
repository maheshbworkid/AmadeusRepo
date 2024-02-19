package functions;

import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int n) {
//		if(n<=1) {
//			return false;
//		}
//		int c=2;
//	while(c*c<=n) {
//		if(n%c==0) {
//			return false;
//		}
//		c++;
//	}
//	if(c*c>n) {
//		return true;
//	}
//	return false; 
//	}
		if(n<=1) {
			return false;
		}
		
		int c=2;
		while(c*c<=n) { //4<=3
			if(n%c==0) { //3%4==0
				return false;
			}
			c++;
			
		}
		if(c*c>n) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean c=isPrime(n);
		System.out.println(c);
	}
}

/*

	

*/