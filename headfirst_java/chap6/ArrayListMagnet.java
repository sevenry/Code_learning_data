import java.util.*;
public class ArrayListMagnet {
	public static void main (String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(0,"zero");
		a.add(1,"one");
		printAL(a);
		a.add(2,"two");
		a.add(3,"three");
		a.remove(2);
		printAL(a);
		
	}
	public  static void printAL(ArrayList<String> a1) {
		for (String element:a1) {
			System.out.print(element+"  ");
		}
	}
}