//printing the detail of employee and total salary of the emlpoyee
import java.util.*;
class EmployeeDriver 
{
	public static void main(String[] args) 
	{
		Employee[] e=new Employee[3];

		e[0]=new Employee(1,"niraj",20000);
		e[1]=new Employee(2,"suraj",50000);
		e[2]=new Employee(3,"manav",50000);

		System.out.println(e);//[LEmployee;@36baf30c object address

		System.out.println(Arrays.toString(e));

		for(Employee e1 : e)
		{
			System.out.println(e1);
		}
		double sum=0;

		for(Employee e1 : e)
		{
			sum+=e1.getSalary();
		}

		System.out.println("Total salary of Employee: "+sum);

		



        

	}
}
