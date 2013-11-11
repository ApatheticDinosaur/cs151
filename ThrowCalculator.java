 
public abstract class ThrowCalculator {
	
    public static ThrowCalculator makeCalculator(String difficulty) {
        if (difficulty.equalsIgnoreCase("random")) {
            return new RandomThrow();
        } else {
            return new SmartThrow();
        }
    }

    public abstract int calculateThrow(int humanResponse);  // abstract method
}
