
import java.io.*;
import java.util.*;

public class JukeBoxv2 {
	ArrayList<String> songList = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JukeBoxv2().go();//这样调用的原因是，main是static，无法调用songList这种非静态变量
	}

	private void go() {
		// TODO Auto-generated method stub
		getSongs();
		System.out.println(songList);		
		Collections.sort(songList);
		System.out.println(songList);
	}

	private void getSongs() {
		// TODO Auto-generated method stub
		try {
			File file = new File("SongList.txt");
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
		songList.add(tokens[0]);		
	}
}
