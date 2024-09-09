package uplodeproram;
import java.util.Scanner;
public class areaofrectangle {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter length of rectangle:");
	        double length = scanner.nextDouble();
	        System.out.println("Enter width of rectangle:");
	        double width = scanner.nextDouble();
	        double rectangleArea = calculateRectangleArea(length, width);
	        System.out.println("Area of rectangle: " + rectangleArea);
	        
	        System.out.println("Enter radius of circle:");
	        double radius = scanner.nextDouble();
	        double circleArea = calculateCircleArea(radius);
	        double circleCircumference = calculateCircleCircumference(radius);
	        System.out.println("Area of circle: " + circleArea);
	        System.out.println("Circumference of circle: " + circleCircumference);
	    }	   
	    public static double calculateRectangleArea(double length, double width) {
	        return length * width;
	    }
	    public static double calculateCircleArea(double radius) {
	        return Math.PI * Math.pow(radius, 2);
	    }
	    public static double calculateCircleCircumference(double radius) {
	        return 2 * Math.PI * radius;
	    }
	}

