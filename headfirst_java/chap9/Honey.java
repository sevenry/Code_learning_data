class Bees {
	Honey [] beeHA;
}

class Raccoon {
	Kit k;
	Honey rh;
}

class Kit {
	Honey kh;
}

public class Honey {
	public static void main(String []args) {
		Honey honeyPot = new Honey();
		Honey [] ha = {honeyPot,honeyPot};
		Bees b1 = new Bees();
		b1.beeHA = ha;
	}
}