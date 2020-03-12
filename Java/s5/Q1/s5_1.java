import java.io.*;

class InsufficientFundsException extends Exception
{
	InsufficientFundsException(String s)
	{
		super(s);
	}
	}

class SavingAccount
{
	
	int acno;
	String name;
	double balance;
	
	
	public SavingAccount()
	{
		acno=0; name=""; balance=0;
	}
	
	
		public SavingAccount(int ooacno,String ooname,double oobalance)
	{
		acno=ooacno; name=ooname; balance=oobalance;
	}
	
	public void withdraw() throws IOException
	{	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter amount");
			double temp=Double.parseDouble(br.readLine());
		try{
			if(temp>balance)
			{
				throw new InsufficientFundsException("Insufficiney Balance");
			}
			
			else{
				try{
					if(balance-temp<500)
						throw new InsufficientFundsException("500 Balance minimum");
							balance-=temp;
					System.out.println("Withdraw Successull .. available Bal : "+balance);
					
				}
				catch(InsufficientFundsException e)
				{
						e.printStackTrace();
				}
				
			}
			
		}
		catch(InsufficientFundsException e)
		{
		e.printStackTrace();
		}
	}

	public void deposit() throws IOException
	{	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter amount");
			double temp=Double.parseDouble(br.readLine());
		
		
				balance+=temp;
					System.out.println("Deposit Successull .. available Bal : "+balance);
		
	
	}
	
	public void viewbalance() throws IOException
	{
		System.out.println(" Available Bal : "+balance);
	}
}

class s5_1
{
	
	public static void main(String []args) throws IOException
	{
		int cano; String cname; double cbal;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name"); cname=br.readLine();
			System.out.println("Enter acc no"); cano=Integer.parseInt(br.readLine());
				System.out.println("Enter balance"); cbal=Double.parseDouble(br.readLine());
				
			SavingAccount s= new SavingAccount(cano,cname,cbal);	
				
				while(true){
						System.out.println("1.Withdraw");
						System.out.println("2.Deposit");
						System.out.println("3.View Bal");
						System.out.println("4.Exit");
						int ch=Integer.parseInt(br.readLine());
						switch(ch)
						{
							case 1: s.withdraw(); break;
								case 2:s.deposit();break;
									case 3:s.viewbalance();break;
										case 4: System.exit(0);
											default: ;
						}
				}		
	}
	
}