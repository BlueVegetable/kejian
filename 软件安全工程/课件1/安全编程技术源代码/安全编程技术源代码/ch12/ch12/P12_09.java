import java.util.Date;
import java.util.Random;
public class P12_09 {
	public static void main(String[] args)  {
		long seed=new Date().getTime();
		Random rnd = new Random();
		rnd.setSeed(seed);
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
	}
}
