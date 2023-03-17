/*import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;*/
import java.util.stream.Collectors;
import java.util.*;
public class SortingAnArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter a number ");
			int x = scan.nextInt();
			arr[i] = x;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * for(int i=0;i<size-1;i++) { 
		 *     for(int j=i+1;j<size;j++) { 
		 *            if(arr[i] > arr[j]) {
		 * 				int t = arr[i]; 
		 * 				arr[i] =arr[j]; 
		 * 				arr[j] = t; 
		 * 			  } 
		 * 		} 
		 * }
		 */
		
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		List lst = Arrays.stream(arr).boxed()
				.collect(Collectors.toList());
		Collections.reverse(lst);
		
		System.out.println(lst);
		
	}
}
