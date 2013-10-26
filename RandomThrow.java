import java.util.Random;

public class RandomThrow extends ThrowCalculator{

	@Override
	public int calculateThrow(int humanResponse) {
		Random rand = new Random();
		return rand.nextInt(3);
	}

}
