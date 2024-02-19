package collectionsPractice;

import java.util.Stack;

public class Stack1 {
public static void main(String[] args) {
	Stack s1=new Stack();
	s1.add(10);
	s1.push(10);
	s1.push(20);
	s1.push('q');
	s1.push("text");
	System.out.println(s1);
	System.out.println(s1.peek());
	s1.pop();
	System.out.println(s1);
	System.out.println(s1.search('z'));
	System.out.println(s1.empty());
	}
}
