package uplodeproram;
import java.util.Scanner;

public class simpleintrest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter annual interest rate (in percent):");
        double rate = scanner.nextDouble() / 100;

        System.out.println("Enter time (in years):");
        int time = scanner.nextInt();

        double simpleInterest = principal * rate * time;
        double compoundInterest = principal * Math.pow((1 + rate), time) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}