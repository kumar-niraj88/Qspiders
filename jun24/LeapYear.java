//Q.6 write a program to check Wheter a number is leap year or not
import java.util.*;
class LeapYear 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Eneter A Number : ");
		int num=sc.nextInt();

		if (num%4==0 || num%400==0)
		{
			System.out.println(num+": Leap Year");
		}
		else
		{
			System.out.println(num+": Not Leap Year");
		}
	}
}
