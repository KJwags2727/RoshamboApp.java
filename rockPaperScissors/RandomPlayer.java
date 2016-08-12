package rockPaperScissors;

import java.util.Random;

public class RandomPlayer extends Player {
	private String name;

	public RandomPlayer(String name) {
		setName(name);
	}

	public RandomPlayer() {
		
	}

	@Override
	public String generateRoshambo() {
		int selection= 0;
		String randomInput= "";
		Random rd= new Random();
		selection = rd.nextInt(3) + 1;
		
		if (selection==1) {
			setRoshambo("rock");
		}
		if (selection==2) {
			setRoshambo("scissors");
		}if (selection==3) {
			setRoshambo("paper");
		}
		//System.out.println(getRoshambo());
		
		
		return getRoshambo();
		
	}
		
		
	

	public boolean equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	
	}


