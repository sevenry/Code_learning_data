//page 43
class DrumKitTestDrive{
	public static void main(String [] args) {

		DrumKit d = new DrumKit();
		d.snare = false;
		d.playSnare();
		if (d.snare == true) {
			d.playSnare();
		}
		
		d.playTopHat();
	}
}


class DrumKit {
	boolean topHat = true;
	boolean snare = true;

	void playSnare() {
		System.out.println("bangbangba-ang");
	}
	void playTopHat() {
		System.out.println("dingdingda-ding");

	}
}

