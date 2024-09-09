package uplodeproram;
import java.util.Scanner;
public class calculategrades {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter student's marks:");
	        int marks = scanner.nextInt();
	        scanner.close();

	        String grade = calculateGrade(marks);
	        System.out.println("Grade: " + grade);
	    }
	    public static String calculateGrade(int marks) {
	        if (marks >= 90) {
	            return "A+";
	        } else if (marks >= 80) {
	            return "A";
	        } else if (marks >= 70) {
	            return "B";
	        } else if (marks >= 60) {
	            return "C";
	        } else if (marks >= 50) {
	            return "D";
	        } else {
	            return "F";
	        }	    
	}
}
