import java.util.*;

public class TestTree {
	public static void main (String[] args) {
		new TestTree().go();
	}
	
	public void go() {
		Book b1 = new Book("how cats work");
		Book b2 = new Book("remix your body");
		Book b3 = new Book("fingding emo");
		
		TreeSet<Book> tree = new TreeSet<Book>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);		
	}
}

class Book implements Comparable {
	String title;
	public Book(String t) {
		title = t;
	}
	public int compareTo(Object b) {
		Book book = (Book) b;
		return (title.compareTo(book.title));
	}
	public String toString() {//需要加上这个方法确保tree中加入的每个book输出时为书名。
		return title;
	}
}