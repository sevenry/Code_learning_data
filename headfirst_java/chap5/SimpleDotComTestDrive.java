//page 112
//no "public" before class GameHelper and SimpleDotCom.
//this game has bug,if locations is [2,3,4],when i guess 4 for 3 times, i could win .so ..
import java.io.*;
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

public class SimpleDotComTestDrive{	
	public static void main(String[] args){
		int numOfGuesses =0;
		GameHelper helper = new GameHelper();
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int) (Math.random()*5);
		int[] locations = {randomNum, randomNum+1,randomNum+2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
	
		while (isAlive ==true) {
			String guess = helper.getUserInput("enter a number:  ");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("you took  " + numOfGuesses + "  to guess");
			}
		}
	}
}

class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell : locationCells) {//what??
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}