//treeset 
import java.io.*;
import java.util.*;

class Song implements Comparable<Song> {//以Comparable接口的类的对象才可排序使用Colletions.sort()方法
	String title;
	String artist;
	String rating;
	String bpm;
	
	public boolean equals(Object aSong) {//equals被覆盖，则hashCode必须被覆盖
	//对象相同，hashCode必须相同，hashCode相同，对象可以不同。
		Song s = (Song) aSong;
		return getTitle().equals(s.getTitle());
	}
	
	public int hashCode() {//把对象加入HashSet时，hashcode判断对象是否为新。
		return title.hashCode();
	}
	
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
	
	public String toString() {//不知道怎么改才能适应第二个sort()方法。
		return title;
	}
}

public class JukeBoxv8 {
	ArrayList<Song> songList = new ArrayList<Song>();
	int val;
	
	public static void main(String[] args) {
		new JukeBoxv8().go();//这样调用的原因是，main是static，无法调用songList这种非静态变量	
	}

	class ArtistCompare implements Comparator<Song> {
		public int compare(Song one, Song two) {
			return one.getArtist().compareTo(two.getArtist());
		}
	}
	
	private void go() {
		// TODO Auto-generated method stub
		getSongs();
		System.out.println(songList);		
		//Collections.sort(songList);//sort方法只接受Comparable对象的list
		System.out.println(songList);
		
		TreeSet<Song> songSet = new TreeSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);//自动排序且去重，因此结果和Collections是一样的，但是去重了。
	}

	private void getSongs() {
		// TODO Auto-generated method stub
		try {
			File file = new File("SongListMore2.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			
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
		
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		//System.out.println(nextSong);//Song是四个String的集合，输出的结果为title是因为设置了函数toString
		songList.add(nextSong);		
	}
}
