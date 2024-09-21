import java.util.*;
class Employee 
{
	private int id;
	private String name;
	private double sal;

	public Employee(int id,String name,double sal){
		
			this.id=id;
			this.name=name;
			this.sal=sal;
	}
	//setter method
	public void SetId(int id){
		this.id=id;
	}
	public void SetName(String name){
		this.name=name;
	}
	public void SetSalary(double sal){
		this.sal=sal;
	}
	//getter method

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return sal;
	}

	//overriding of the object class

	public String toString(){
		
		return "Id=" +id+"\n"+ "Name="+name+"\n"+"Salary="+sal+"\n";
	}

	public boolean equals(Object o){
		
		Employee e=(Employee)o;
		
		return this.id==e.id && this.name.equals(e.name) && this.sal==e.sal;
	}

	public int hashCode(){
		return Objects.hash(id,name,sal);
	}

}
