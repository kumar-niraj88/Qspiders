class Vehicle
{
	String reg_no,state;
     
	 Vehicle(){}

	 Vehicle(String reg_no,String state){
		this.reg_no=reg_no;
		this.state=state;
	 }
}

class Bike extends Vehicle
{
	String name;
	double price;

	Bike(){}
	Bike(String name,double price,String reg,String state){
		super(reg,state);
		this.name=name;
		this.price=price;
	}
	public void detailofBike(){
		System.out.println("Bike Name :"+name);
		System.out.println("Bike price :"+price);
		System.out.println("Bike Registation No :"+reg_no);
		System.out.println("State of Bike :"+state);
	}
}
