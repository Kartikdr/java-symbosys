package uplodeproram;

public class remainder {
	
	    public static void main(String[] args) {
	        int dividend = 17;
	        int divisor = 5;
	        int remainder = findRemainder(dividend, divisor);
	        System.out.println("Remainder: " + remainder);
	    }

	    public static int findRemainder(int dividend, int divisor) {
	        return dividend - (divisor * (dividend / divisor));
	    
	}
}
