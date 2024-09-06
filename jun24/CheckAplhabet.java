//Q.7 write a program to check Wheter a character is alphabet or not
import java.util.*;
class CheckAplhabet 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Eneter A Number : ");
		char letter=sc.next().charAt(0);

		if (letter>='A' && letter<='Z' || letter>='a' && letter<='z')
		{
			System.out.println(letter+": Alphabet Character");
		}
		else
		{
			System.out.println(letter+": Not A Alphabet Character");
		}
	}
}
