/*
 * To change this template, choose Tools | Templatesz
 * and open the template in the editor.
 */

/**
 *
 * @author STEPHEN
 */
import java.io.*;
import java.util.*;

public class GameController {

    public static void main(String[] args) {
        // Prompt the player to enter the amount of throws
        System.out.print("Enter the number of throws: ");

        Scanner sc = new Scanner(new InputStreamReader(System.in));

        int numberOfThrows = 0;
        try {
            numberOfThrows = Integer.parseInt(sc.next());
        } catch (NumberFormatException nfe) {
            System.out.println("Number not recognized");
            System.exit(1);
        }

        //Prompt the player to set the difficulty
        System.out.print("Enter the difficuluty (random or smart): ");

        String difficulty = null;
        difficulty = sc.next();
        System.out.println(difficulty);


        Computer c = new Computer(difficulty);
        ScoreKeeper sk = new ScoreKeeper();
        Human h = new Human();

        // Rock = 0, Paper = 1, Scissors = 2, show score = -1
        for (int i = 0; i < numberOfThrows; i++) {
            int humanResponse = h.getChoice();



            //Stores in Group of 3, the RPS and adds it a to hash table which records the counts of that RPS value.

            int computerResponse = c.calculateThrow(humanResponse);


            if (humanResponse == computerResponse) {
                sk.storeTie();
                System.out.println("Tie!");
            } else if ((humanResponse == 0 && computerResponse == 2) || (humanResponse == 1 && computerResponse == 0) || (humanResponse == 2 && computerResponse == 1)) {
                sk.storeWin();
                System.out.println("You win!");
            } else if (humanResponse == -1){
            	System.out.println(sk.showScore());
            	i--;
            } else {
            	sk.storeLoss();
                System.out.println("You lose!");
            }



        }
        System.out.println(sk.showScore());
        sc.close();
    }
}
