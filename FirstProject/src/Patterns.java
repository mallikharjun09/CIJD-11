/**
 * Print the numbers as follows
 * 1 
 * 2  3  
 * 4  5  6
 * 7  8  9  10
 * @author dell
 *
 */
public class Patterns {
        public static void main(String[] args) {
        	
        	for(int i=1,count=1;i<5;i++) {
        		for(int j=1;j<=i;j++,count++) {
        			System.out.print(count+"  ");
        		}
        		
        		System.out.println();
        	}
        }
}
