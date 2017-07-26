
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
	
	public String toString() {//不知道怎么改才能适应第二个sort()方法。
		return title;
	}
}

public class JukeBoxv6 {
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JukeBoxv6().go();//这样调用的原因是，main是static，无法调用songList这种非静态变量
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
		//System.out.println(songList);
		
		HashSet<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);//这里的输出与Collections行调用有关。
		//但是并不是和Collections的输出顺序完全一致。这意味着，加入的songList本身的顺序
		//会影响输出结果。而且对编译后的文件再次调用，结果也会变化一次。但是如没有Collectiongs，
		//那么结果就不再变化保持稳定。
		
		//ArtistCompare artistCompare = new ArtistCompare();
		//Collections.sort(songList, artistCompare);//sort()方法通过重载重新排序
		//System.out.println(songList);
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
