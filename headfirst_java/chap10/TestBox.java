import java.util.Date;

public class TestBox {
	Integer i;
	int j;
	
	public static void main (String[] args) {
		TestBox t = new TestBox();
		t.go(3);
	}
	
	public void go(int i) {
		j = i;
		System.out.println(j);
		System.out.println(i);
		System.out.println(String.format("%tr",new Date()));
	}
}