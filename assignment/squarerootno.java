package uplodeproram;

public class squarerootno {
	
	    public static void main(String[] args) {
	        double num = 16.0;
	        System.out.println("Square root of " + num + " is " + findSquareRoot(num));
	    }

	    public static double findSquareRoot(double num) {
	        double x = num;
	        double y = (x + 1) / 2;

	        while (y < x) {
	            x = y;
	            y = (x + num / x) / 2;
	        }

	        return x;
	    
	}
}
