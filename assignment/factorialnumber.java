package uplodeproram;
import java.util.Scanner;
public class factorialnumber {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int number = scanner.nextInt();
	        long factorial = calculateFactorial(number);
	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }

	    
	    public static long calculateFactorial(int number) {
	        long factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        return factorial;
	        }
	   
}
