import java.util.*;

public class TestTree2 {
	public static void main (String[] args) {
		new TestTree2().go();
	}
	
	public void go() {
		Book b1 = new Book("how cats work");
		Book b2 = new Book("remix your body");
		Book b3 = new Book("fingding emo");
		
		BookCompare bCompare = new BookCompare();
		TreeSet<Book> tree = new TreeSet<Book>(bCompare);
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);		
	}
}

class Book implements Comparable <Book> {
	String title;
	public Book(String t) {
		title = t;
	}
	public int compareTo(Book s) {//该方法返回要比较的对象
		return title.compareTo(s.getTitle());
	}
	public String getTitle(){
		return title;
	}
	public String toString() {//需要加上这个方法确保tree中加入的每个book输出时为书名。
		return title;
	}
	
}

class BookCompare implements Comparator<Book> {
	public int compare(Book one, Book two) {
		return (one.title.compareTo(two.title));
	}
}