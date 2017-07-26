public class Boo{
	public Boo(int i){}
	public Boo(String s){}
	public static void main(String []args){
		SonOfBoo a1 = new SonOfBoo(2);
		
	}
}

class SonOfBoo extends Boo{
	SoneOfBoo(int i ){
		super("boo");
		return ;
	}
}