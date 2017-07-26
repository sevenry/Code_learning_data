class PoolPuzzleOne {
	public static void main(String [] args) {
		int x =0;
		while (x<4) {
			System.out.print("a");
			if (x<1){
			System.out.print(" ");
			System.out.print("noise");
			}
			if  (x>1) {
			System.out.print("n");
			x=x+2;
			}
			if  (x==1) {
			System.out.print("nnoys");
			}
			if (x>3){
			System.out.print(" oyster");
			}
			System.out.println("");
			x=x+1;
		}
	}
}