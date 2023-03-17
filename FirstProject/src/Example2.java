import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size = scan.nextInt();
		int arr[] =  new int[size];
		int sum=0;
		int primeCount=0;
		for(int i=0;i<size;i++) {
			System.out.println("Enter a number ");
			int x = scan.nextInt();
			arr[i] = x;
		}
		for(int x : arr) {
			boolean prime = true;
			for(int i=2;i<x/2;i++) {
				if(x%i == 0) {
					prime=false;
					break;
				}
			}
			if(prime == true) {
				System.out.println(x);
				sum += x;
				primeCount++;
			}
		}
		System.out.println("Prime number sum is "+sum);
		System.out.println("Prime numbers avg is "+(sum/primeCount));
		
	}

}
