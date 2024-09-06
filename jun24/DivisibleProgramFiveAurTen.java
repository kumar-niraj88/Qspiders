//write a program to check whether a  number is divisible by 5 and 10 or not 
//if it is divisible then Development else print Testing
import java.util.*;
class DivisibleProgramFiveAurTen 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Eneter A Number : ");
		int number=sc.nextInt();

		if (number%5==0 && number%10==0)
		{
			System.out.println("Development");
		}
		else
		{
			System.out.println("Testing");
		}
	}
}
