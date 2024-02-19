package Concepts;
class Animal{
	void noise() {
		System.out.println("Sounds of animals");
	}
}

class Dog extends Animal{
	void noise() {
		System.out.println("Boww");
	}
}

class Cat extends Animal{
	void noise() {
		System.out.println("meow");
	}
}

class Cow extends Animal{
	void noise() {
		System.out.println("caw");
	}
}
public class PolymorphismExample {

public static void main(String[] args) {
	PolymorphismExample p1=new PolymorphismExample();
	Animal a1=new Dog();
	Animal a2=new Cat();
	Animal a3=new Cow();
	a1.noise();
	a2.noise();
	a3.noise();
	
}
}