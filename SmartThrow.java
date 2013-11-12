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

        int maxCount = 0;
        int predictedHumanThrow = 0;
        //ADD DAT ALGORITHM (determine what the computer's response is)
        for (int i=0; i<3;i++)
        {
            String key = Integer.toString(previousHumanThrow) + Integer.toString(previousComputerThrow) + Integer.toString(i);
            if (throwCount.containsKey(key)){
            int instanceOfCount = throwCount.get(key);
            if (instanceOfCount > maxCount)
            {
                maxCount = instanceOfCount;
                predictedHumanThrow = i;
            }
            }
        }

        if (predictedHumanThrow == 0)
            computerResponse = 1;
        else if (predictedHumanThrow == 1)
            computerResponse = 2;
        else if (predictedHumanThrow == 2)
            computerResponse = 0;

            
        previousHumanThrow = humanResponse;
        previousComputerThrow = computerResponse;
        
        return computerResponse;
       
    }

}
