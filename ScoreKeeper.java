/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STEPHEN
 */
public class ScoreKeeper {
    public int wins;
    public int losses;
    public int ties;

    public ScoreKeeper()
    {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void storeWin()
            {
        wins++;
    }

    public void storeLoss()
    {
        losses++;
    }

    public void storeTie()
    {
        ties++;
    }

    public String showScore()
    {
        return "Wins: " + wins + " Losses: " + losses + " Ties: " + ties;
    }

}
