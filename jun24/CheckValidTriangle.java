//write a program to input angles of a Triangle and check whether triangle is valid not 
import java.util.*;
class CheckValidTriangle 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Eneter A Number : ");
		int num1=sc.nextInt();

		System.out.print("Eneter A Number : ");
		int num2=sc.nextInt();

		System.out.print("Eneter A Number : ");
		int num3=sc.nextInt();

		int sum=num1+num2+num3;

		if (sum==180)
		{
			System.out.println("Valid Triangle");
		}
		else
		{
			System.out.println("Not Valid triangle");
		}
	}
}
