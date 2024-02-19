package functions;

 class Animal {

	 void noise() {
		System.out.println("Animal noise");
	}
	
}

 class Dog extends Animal{
	void noise() {
		System.out.println("bowbow");
	}
}

class Cat extends Animal{
	void noise() {
		System.out.println("mewomeow");
	}
}

class Lion extends Animal{
	void noise() {
		System.out.println("Gurrrr");
	}
}

class RuntimePolymorphism{
public static void main(String[] args) {
	Animal r1=new Dog();
	Animal r2=new Cat();
	Animal r3=new Lion();
	r1.noise();
	r2.noise();
	r3.noise();
	
	
}	
}