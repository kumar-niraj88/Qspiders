/*Q.8 write a program to read percentage display grade accounding to following

      .Percentage >=90%:Grade A
      .Percentage >=80%:Grade B
      .Percentage >=70%:Grade C
      .Percentage >=60%:Grade D
      .Percentage >=40%:Grade E
      .Percentage <=40%:Grade F
*/
import java.util.*;
class GradeCheck 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Eneter A Percentage : ");
		int per=sc.nextInt();

		if (per>0 && per<=40)
		{
			System.out.println("Grade F");
		}
		else if(per>=40 && per<60)
		{
			System.out.println("Grade E");
		}
		else if (per>=60 && per<70)
		{
			System.out.println("Grade D");
		}
		else if (per>=70 && per<80)
		{
            System.out.println("Grade C");
		}
		else if (per>=80 && per<90)
		{
			System.out.println("Grade B");
		}
		else if (per>=90 && per<=100)
		{
			System.out.println("Grade A");
		}
		else
		{
			System.out.println("Invalid Grade");
		}
	}
}
