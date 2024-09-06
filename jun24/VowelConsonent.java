/*
write a program to input any alphabet and check it is vowel or consonent
*/
import java.util.*;
class VowelConsonent 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a Alphabet:");
		char ch=sc.next().cahrAt(0);

		if (ch>='A' && ch<='Z' ||ch>='a' && ch<='z')
		{
			System.out.println("");
		}
	}
}
