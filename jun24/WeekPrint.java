//write a program to input a week number and print week days(use switch)
import java.util.*;
class WeekPrint 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Eneter A Number : ");
		int week=sc.nextInt();

		switch (week)
		{
		case 1:
			{
				System.out.println("Monday");
				break;
			}
		case 2:
			{
				System.out.println("Tuesday");
				break;
			}
		case 3:
			{
				System.out.println("Wednusday");
				break;
			}
		case 4:
			{
				System.out.println("Thursday");
				break;
			}
		case 5:
			{
				System.out.println("Friday");
				break;
			}
		case 6:
			{
				System.out.println("Saturday");
				break;
			}
		case 7:
			{
				System.out.println("Sunday");
				break;
			}
		default:
			{
				System.out.println("Invalid Weeks Days");
				break;
			}
		
		}
	}
}
