public class Computer {
	
	ThrowCalculator calc;
	
	public Computer(String difficulty)
	{
		calc = ThrowCalculator.makeCalculator(difficulty);
	}
	
	public int calculateThrow(int humanResponse) {
		return calc.calculateThrow(humanResponse);
	}
}
