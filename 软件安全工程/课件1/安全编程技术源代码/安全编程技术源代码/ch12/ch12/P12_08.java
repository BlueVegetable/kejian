import java.util.Random;

public class P12_08 {

	public static void main(String[] args)  {
		long seed=5;
		Random rnd = new Random();
		rnd.setSeed(seed);
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
	}
}
