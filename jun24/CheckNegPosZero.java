//write a program to check whether a number negative, positive or Zero
import java.util.*;
class CheckNegPosZero 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Eneter A Number : ");
		int number=sc.nextInt();

		if (number<0)
		{
			System.out.println(number+" Is A Negative Number");
		}
		else if (number>0)
		{
			System.out.println(number+" Is A Postive Number");
		}
		else
		{
			System.out.println(number+" Is A Zero");
		}
	}
}
