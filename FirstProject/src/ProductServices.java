import java.util.Scanner;

public class ProductServices {

	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		
		Product pro;
		pro = new Product();
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter product Id");
			int id = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter product Name ");
			String pname = scan.nextLine();
			scan.nextLine();
			System.out.println("Enter product Cost");
			double pcost = scan.nextDouble();
			scan.nextLine();
			System.out.println("Enter product warrenty");
			String warrenty = scan.nextLine();
			
			pro.displayProductDetails(id,pname,pcost,warrenty);
		}
	}
}
