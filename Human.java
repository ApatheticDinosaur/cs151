import java.util.Scanner;

public class Human {
	
	//"0" for Rock, "1" for Paper, "2" for Scissors  ; -1 for Score
	String choice;
	Scanner input;
	
	public Human() {
		choice = "";
		input = new Scanner(System.in);
	}
	
	//Asks the Human for what their input is.
	private void makeChoice() {
		
		choice = "";
		
		//Now, this will handle actual string 'rock' 'paper' 'scissors'
		//Make it as robust as it needs to be. For now...
		//Exit while loop by making it a 0 1 or 2
		
		while (choice.equals("")) {
			System.out.println("Choose Rock, Paper, Scissors, Help, or Show Score (R, P, S, help, score): ");
			
			choice = input.next();
			choice = choice.toLowerCase();
			
			if (choice.equals("r")) {
				choice = "0";
			} else if (choice.equals("p")) {
				choice = "1";
			} else if (choice.equals("s")) {
				choice = "2";
			} else if (choice.equals("help")) { //Show help
				getHelp();
				choice = "";
			} else if (choice.equals("score")) {//Show score
				choice = "-1";
			} else {//Man it's nothing now
				choice = "";
				System.out.println("Invalid: If help is needed, type 'help'");
			}
			
		}
		
	}
	
	public int getChoice() {
		makeChoice();
		int number = Integer.parseInt(choice);
		return number;
	}
	
	private void getHelp() {
		System.out.println("User is allowed these commands:"
				+ "\n'R' = Rock "
				+ "\n'P' = Paper"
				+ "\n'S' = Scissors"
				+ "\n'score' = Show the Current score"
				+ "\n'help' = Gets this info again");
	}
	
}