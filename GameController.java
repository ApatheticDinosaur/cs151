/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STEPHEN
 */
import java.io.*;
import java.util.*;

public class GameController {
	

	private int numberOfThrows;
	private String difficulty;
	private Computer c = new Computer();
    private ScoreKeeper sk = new ScoreKeeper();
    private Human h = new Human();
    private ThrowCalculator calc;
    private int computerResponse;
	
	public GameController(String diff, int t) {
        numberOfThrows = t;
        difficulty = diff;
        calc = ThrowCalculator.makeCalculator(difficulty);        
        
    }
	
	public String makeThrow(int humanResponse)
	{
		// Rock = 0, Paper = 1, Scissors = 2



            //Stores in Group of 3, the RPS and adds it a to hash table which records the counts of that RPS value.

			computerResponse = calc.calculateThrow(humanResponse);


            if (humanResponse == computerResponse) {
                sk.storeTie();
                return("Tie!");
            } else if ((humanResponse == 0 && computerResponse == 2) || (humanResponse == 1 && computerResponse == 0) || (humanResponse == 2 && computerResponse == 1)) {
                sk.storeWin();
                return("You win!");
            } else {
                sk.storeLoss();
                return("You lose!");
            
        }
	}
	
	public String getScore() {
		return sk.showScore();
	}
	
	public String getPredictedThrow()
	{
		if(computerResponse == 0)
			return "Scissors";
		else if(computerResponse == 1)
			return "Rock";
		else
			return "Paper";	
	}
}
