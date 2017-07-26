//普通数组

import java.util.Iterator;

public class TestGenericsV1 {

	public static void main(String[] args) {
		new TestGenericsV1().go();
	}

	private void go() {
		Animal[] animals = {new Dog(), new Cat(), new Dog()};
		
		Dog[] dogs = {new Dog(), new Dog(), new Dog()};
		
		takeAnimals(animals);
		takeAnimals(dogs);
	}
	
	private void takeAnimals(Animal[] animals) {
		// TODO Auto-generated method stub
		for (Animal a : animals) {
			a.eat();
			a.sound();
		}		
	}
}

abstract class Animal {
	void eat(){
		System.out.println("Animal Eating");
	}
	void sound() {	}
}

class Dog extends Animal {
	void bark() { }
	void sound() {
		System.out.println("wow");
	}
}

class Cat extends Animal {
	void meow() { }
	void sound() {
		System.out.println("mew");
	}
}