/*
 * Accept employees date of joining and get his date of retirement
 * as per the company policy 58 is the retirement age.
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class A_21_EmployeeRetirement 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date of birth(YYYY-MM-DD) : ");
		String date_of_birth = sc.next();
		System.out.println("Enter the joining date(YYYY-MM-DD) : ");
		String date_of_joining = sc.next();
		
		LocalDate BirthDate = LocalDate.parse(date_of_birth);
		LocalDate joiningDate = LocalDate.parse(date_of_joining);
		
		LocalDate date_of_retirement = BirthDate.plusYears(58);
		Period YearsRemaining = Period.between(joiningDate, date_of_retirement);
		System.out.println("Retirement Remaining years for a employeee : " ); 
		System.out.println(YearsRemaining.getYears() + " Years ");
		System.out.println(YearsRemaining.getMonths() + " Months ");
		System.out.println(YearsRemaining.getDays() + " Days ");
		
		System.out.println("Retirement Date of the empployee is : " + BirthDate.plusYears(58));
		
	}

}
