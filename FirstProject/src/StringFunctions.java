import java.util.Scanner;

public class StringFunctions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "India is having lot of issues";
		System.out.println(str);
		String part = str.substring(7);
		System.out.println(part);
		String part2 = str.substring(7,10);
		System.out.println(part2);
	}
}
/*
 * sample input: success carrace finest umbrella
 * 
 * Sample output: success s carrace c finest - umbrella l
 */