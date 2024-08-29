class Bank 
{
	String ifsc;
	String bname;

	Bank(){}

	Bank(String ifsc,String bname){
		this.ifsc=ifsc;
		this.bname=bname;
	}

}

class CurrentAccount extends Bank
	{
		String acc_holder_name,types;
		double bal=0;
		long contact;
		
		CurrentAccount(){}

		CurrentAccount(String acc_holder_name,long contact,String types,String ifsc,String bname){
			super(ifsc,bname);
			this.acc_holder_name=acc_holder_name;
			this.contact=contact;
			this.types=types;
		}

		public void deposite(double d){
			bal+=d;
			System.out.println("Deposite Successfull");
		}

		public void withdraw(double w){
			if (bal>=w)
			{
				bal-=w;
				System.out.println("Withdraw Successfull");
				System.out.println("Avaialable Balance"+bal);
			}
			else{
				System.out.println("Insufficient Balance");
			}
		}

		public void detailsofAccount(){
			System.out.println("Bank Name:"+bname);
			System.out.println("Bank ifsc:"+ifsc);
			System.out.println("Account Holder :"+acc_holder_name);
			System.out.println("Balance :"+bal);
			System.out.println("Contact of Account Holder:"+contact);
			System.out.println("Account Types :"+types);
			System.out.println("***************************************************");
		}
	}


	//saving account 

class SavingAccount extends Bank
	{
		String acc_holder_name,types;
		double bal=0;
		long contact;
		
		SavingAccount(){}

		SavingAccount(String acc_holder_name,long contact,String types,String ifsc,String bname){
			super(ifsc,bname);
			this.acc_holder_name=acc_holder_name;
			this.contact=contact;
			this.types=types;
		}

		public void deposite(double d){
			bal+=d;
			System.out.println("Deposite Successfull");
		}

		public void withdraw(double w){
			if (bal>=w)
			{
				bal-=w;
				System.out.println("Withdraw Successfull");
				System.out.println("Avaialable Balance"+bal);
			}
			else{
				System.out.println("Insufficient Balance");
			}
		}

		public void detailsofAccount(){
			System.out.println("Bank Name:"+bname);
			System.out.println("Bank ifsc:"+ifsc);
			System.out.println("Account Holder :"+acc_holder_name);
			System.out.println("Balance :"+bal);
			System.out.println("Contact of Account Holder:"+contact);
			System.out.println("Account Types :"+types);
			System.out.println("***************************************************");
		}
	}


