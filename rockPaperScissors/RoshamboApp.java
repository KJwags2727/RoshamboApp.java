package rockPaperScissors;

import java.util.Scanner;

import rockPaperScissors.*;

public class RoshamboApp {

	public static void main(String[] args) {

		System.out.println("Welcome to Rock Paper Scissors!!");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter your name.");
		String name = scan1.nextLine();
		String TheJets = "";
		String TheSharks = "";
		
		

				String choose = "yes";

				while (choose.equalsIgnoreCase("yes")) {

					
		System.out.println("Would you like to play against 'TheJets' or 'TheSharks'?");

		String choice = scan1.nextLine();
		System.out.println("ok, " + name + ", play against " + choice);

		Scanner scan11 = new Scanner(System.in);
		System.out.println("Rock, paper, or scissors?");
		String playChoice = scan11.nextLine();
		if (!(playChoice.equalsIgnoreCase("rock") || playChoice.equalsIgnoreCase("scissors")
				|| playChoice.equalsIgnoreCase("paper")))

		{
			System.out.println("Please enter rock, paper, or scissors");
			playChoice = scan11.nextLine();
		}

		if (choice.equalsIgnoreCase("TheJets")) {

			RockPlayer r1 = new RockPlayer();
			r1.generateRoshambo();
			String compare0 = r1.generateRoshambo();

			System.out.print("The Jets picked " + compare0 + " so... ");

			if (choice.equalsIgnoreCase("TheJets") && (playChoice.equalsIgnoreCase("rock")))

			{
				System.out.println("it is a tie!");
			} else {
				if (choice.equalsIgnoreCase("TheJets") && (playChoice.equalsIgnoreCase("scissors"))) {
					System.out.println("Doh! You lose");
				}
				if (choice.equalsIgnoreCase("TheJets") && (playChoice.equalsIgnoreCase("paper"))) {
					System.out.println("Yay! You win!!");
				}
			}

		} else {
			RandomPlayer selection = new RandomPlayer();
			String compare = selection.generateRoshambo();

			System.out.print("TheSharks picked " + compare + " so it's a ");

			if (compare.equalsIgnoreCase("rock") && (playChoice.equalsIgnoreCase("rock"))) {
				System.out.println("tie");
			}
			if (compare.equalsIgnoreCase("scissors") && (playChoice.equalsIgnoreCase("rock"))) {
				System.out.println("You win!!");
			}
			if (compare.equalsIgnoreCase("paper") && (playChoice.equalsIgnoreCase("rock"))) {
				System.out.println("Doh!! You lose.");
			}
			if (compare.equalsIgnoreCase("rock") && (playChoice.equalsIgnoreCase("scissors"))) {
				System.out.println("You lose");
			}
			if (compare.equalsIgnoreCase("scissors") && (playChoice.equalsIgnoreCase("scissors"))) {
				System.out.println("Tie!!");
			}
			if (compare.equalsIgnoreCase("paper") && (playChoice.equalsIgnoreCase("scissors"))) {
				System.out.println("You win!!");
			}
			if (compare.equalsIgnoreCase("rock") && (playChoice.equalsIgnoreCase("paper"))) {
				System.out.println("You win");
			}
			if (compare.equalsIgnoreCase("scissors") && (playChoice.equalsIgnoreCase("paper"))) {
				System.out.println("You lose!!");
			}
			if (compare.equalsIgnoreCase("paper") && (playChoice.equalsIgnoreCase("paper"))) {
				System.out.println("Tie!!");
			}
			System.out.println("Continue? 'yes' or 'no'");
			choose = scan1.nextLine();
		}

	}

}

		
	}

