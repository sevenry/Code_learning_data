//page 112
//no "public" before class GameHelper and SimpleDotCom.
//this game has bug,if locations is [2,3,4],when i guess 4 for 3 times, i could win .so ..
import java.io.*;
import java.util.ArrayList;

class GameHelper {
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + "  ");
		try {
			BufferedReader is = new BufferedReader(
			new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length()==0) return null;
		}	catch (IOException e) {
			System.out.println("IOException:  "+e);
		}
		return inputLine;
	}
}

public class DotComTestDrive{	
	public static void main(String[] args){
		int numOfGuesses =0;
		GameHelper helper = new GameHelper();
		DotCom theDotCom = new DotCom();
		int randomNum = (int) (Math.random()*5);
		ArrayList<String> locations = new ArrayList<String>();
		locations.add(String.valueOf(randomNum));
		locations.add(String.valueOf(randomNum+1));
		locations.add(String.valueOf(randomNum+2));
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
	
		while (isAlive ==true) {
			String guess = helper.getUserInput("enter a number:  ");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("you took  " + numOfGuesses + "  times to guess");
			}
		}
	}
}

class DotCom {
	//int[] locationCells;
	//int numOfHits = 0;
	private ArrayList<String> locationCells;
	
	public void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String userInput) {
		//int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		System.out.println(result);
		return result;
	}
}