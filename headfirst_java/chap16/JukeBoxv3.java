
import java.io.*;
import java.util.*;

class Song implements Comparable<Song> {//以Comparable接口的类的对象才可排序使用Colletions.sort()方法
	String title;
	String artist;
	String rating;
	String bpm;
	
	public int compareTo(Song s) {//该方法返回要比较的对象
		return title.compareTo(s.getTitle());
	}
	
	Song(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getRating() {
		return rating;
	}
	
	public String getBpm() {
		return bpm;
	}
	
	public String toString() {//这里设置了返回第一个属性，覆盖了父类的toString方法。
		return title;
	}
}

public class JukeBoxv3 {
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JukeBoxv3().go();//这样调用的原因是，main是static，无法调用songList这种非静态变量
	}

	private void go() {
		// TODO Auto-generated method stub
		getSongs();
		System.out.println(songList);		
		Collections.sort(songList);//sort方法只接受Comparable对象的list
		System.out.println(songList);
	}

	private void getSongs() {
		// TODO Auto-generated method stub
		try {
			File file = new File("SongListMore.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			/*String sss ="wbwbd";
			String [] aaa = sss.split("b");
			System.out.println(aaa[0]);*/
			//这一段测试String用法，aaa是切分的String组，但是直接输出aaa是没有字符的

			while((line = reader.readLine()) != null){
				addSong(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}

	private void addSong(String line ) {//这里不需要把line换成lineToParse吧。
		// TODO Auto-generated method stub
		String [] tokens = line.split("/");
		//System.out.println(tokens);//这里全是类似地址的东西
		
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		System.out.println(nextSong);//Song是四个String的集合，输出的结果为title是因为设置了函数toString
		songList.add(nextSong);		
	}
}
