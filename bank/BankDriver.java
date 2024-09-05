class BankDriver 
{
	public static void main(String[] args) 
	{
		Bank b1=new ICICI();
		Bank b2=new SBI();
		System.out.println("Rate of ICICI bank: "+b1.getRateOfIntrest());
		System.out.println("Rate of SBI bank: "+b2.getRateOfIntrest());
	}
}
