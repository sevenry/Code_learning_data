//普通数组

import java.util.*;

public class TestGenericsV2 {

	public static void main(String[] args) {
		new TestGenericsV2().go();
	}

	private void go() {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		
		takeAnimals(animals);
		//animals.add(new Cat());//在利用了? extends语句后，这一行就不能在调用了
		//takeAnimals方法之后使用了。已经被限定为animals了。
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		takeAnimals(dogs);
	}
	
	private void takeAnimals(ArrayList<Animal> animals) {
	//这里方法已经声明成Animal，调用该方法时用ArrayList<Dog>则不可以。
	//这里是泛型
	//private void takeAnimals(ArrayList<? extends Animal> animals) {
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