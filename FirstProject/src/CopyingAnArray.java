import java.util.Arrays;
import java.util.Scanner;

public class CopyingAnArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int arr[][] = new int[x][y];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.println("Enter a number ");
				arr[i][j] = scan.nextInt();
				
			}
		}
		
		for(int array[] : arr) {
			System.out.println(Arrays.toString(array));
		}
	}
}
