package uplodeproram;
import java.util.Scanner;
public class asciivalue {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a character:");
	        char character = scanner.next().charAt(0);
	        int asciiValue = character;
	        System.out.println("ASCII value of '" + character + "' is: " + asciiValue);
	    
	}
}
