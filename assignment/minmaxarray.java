package uplodeproram;
import java.util.Arrays;
public class minmaxarray {
	
	    public static void main(String[] args) {
	        int[] array = {5, 2, 8, 1, 3};

	        int min = Arrays.stream(array).min().getAsInt();
	        int max = Arrays.stream(array).max().getAsInt();

	        System.out.println("Minimum: " + min);
	        System.out.println("Maximum: " + max);
	    }
	}

