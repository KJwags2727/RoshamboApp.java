package rockPaperScissors;

import java.util.Scanner;

public class HumanPlayer extends Player {
	

	
	public HumanPlayer(String name) {
		
		setName(name);
	}

	@Override
	public String generateRoshambo() {
		Scanner scan1 = new Scanner(System.in);
		String userInput="";
		System.out.println("Please enter: R, S, or P");
		userInput=scan1.nextLine();
		return userInput;
		
		}
	}
	


