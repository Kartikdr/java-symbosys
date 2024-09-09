package uplodeproram;
import java.util.Scanner;
public class calculatepower {
	

	

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter base number:");
	        double base = scanner.nextDouble();

	        System.out.println("Enter exponent:");
	        double exponent = scanner.nextDouble();

	        double result = Math.pow(base, exponent);

	        System.out.println(base + " raised to the power of " + exponent + " is " + result);
	    }
	}

