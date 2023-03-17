import java.util.Scanner;

public class MathFunctions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double sqrt = Math.sqrt(x);
		System.out.println(Math.abs(x));
		System.out.println(Math.PI);
		System.out.println(Math.addExact(15, 21));
		
	}
}
