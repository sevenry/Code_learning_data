
public class MyAnimalList {
	private Animal [] animals = new Animal[5];
	private int nextIndex = 0;
	
	public void add(Animal d) {
		if (nextIndex < animals.length) {
			animals[nextIndex] = d;
			System.out.println("animal added at " + nextIndex);
			nextIndex++;
		}
	}
}

public class AnimalTestDrive{
	public static void main (String[] args) {
		MyAnimalList list = new MyAnimalList();
		Dog a = new Dog()
		Cat c = new Cat()
		list.add(a);
		list.add(c)
	}
}