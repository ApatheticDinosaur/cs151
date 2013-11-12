import java.util.Hashtable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STEPHEN
 */
public class SmartThrow extends ThrowCalculator{

    Hashtable<String, Integer> throwCount = new Hashtable<String, Integer>();
    int previousHumanThrow = -1;
    int previousComputerThrow = -1;
    int currentHumanThrow = -1;
    int computerResponse;

    
	@Override
    public int calculateThrow(int humanResponse) {
        currentHumanThrow = humanResponse;
        
        if (previousHumanThrow != -1) {
            String threeDigitKey = Integer.toString(previousHumanThrow) + Integer.toString(previousComputerThrow) + Integer.toString(currentHumanThrow);
            int count = 0;
            if (throwCount.containsKey(threeDigitKey)) {
                count = throwCount.get(threeDigitKey);
                throwCount.put(threeDigitKey, count + 1);
            } else {
                throwCount.put(threeDigitKey, 1);
            }
        }
        
        System.out.println(throwCount);
        
        //ADD DAT ALGORITHM (determine what the computer's response is)
        
        
        previousHumanThrow = humanResponse;
        previousComputerThrow = computerResponse;
        
        return computerResponse;
       
    }

}
