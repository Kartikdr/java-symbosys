package uplodeproram;
import java.util.Arrays;
public class averagearray {
	
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};
	        double average = Arrays.stream(numbers).average().getAsDouble();
	        System.out.println("Average: " + average);
	    }
}

