
class TestDemo {
	public static void main(String [] args) {
		Dog []dogs = new Dog[4];
		
		dogs[0]=new Dog();
		dogs[1]=new Dog();
		dogs[0].age=1;
		dogs[0].color="red";
		dogs[1].age=2;
		dogs[1].color="blue";
		dogs[2]=dogs[1];
		dogs[2].age=5;//dogs[1] changed with dogs[2]
		dogs[3]=dogs[0];
		dogs[3]=null;//dogs[0] keeps original,while dogs[3] is null.
		dogs[1]=dogs[3];//dogs[1],[2],[3] are null now. but why?
		int x=0;
		while (x<4) {
			System.out.println("dog"+x+" age,color"+dogs[x].age+dogs[x].color);
			x=x+1;
		}

	}
}

class Dog {
	int age;
	String color;
}