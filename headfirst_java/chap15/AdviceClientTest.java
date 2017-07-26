import java.io.*;
import java.net.*;

public class AdviceClientTest {
	public void go() {
		try {
			//System.out.println("Today you should:222 " );
			Socket s = new Socket("127.0.0.1", 5005);
			//System.out.println("Today you should: " );
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			
			String advice = reader.readLine();
			System.out.println("Today you should: " + advice);
			
			reader.close();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main (String[] args) {
		AdviceClientTest client = new AdviceClientTest();
		client.go();
	}
}