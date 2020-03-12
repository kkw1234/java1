import java.util.*;
import java.io.*;
class PhoneDirectory
{
private String name;
    private long phone_number;

    public PhoneDirectory()
    {
    	this.name="";
    	this.phone_number=0;
    }

    public PhoneDirectory(String name,long phone_number)
    {
        this.name=name;
        this.phone_number=phone_number;
    }

    public void makeEntry()
    {
		try
		{
        	File f=new File("phone.txt");
         	FileWriter f1=new FileWriter(f,true);
         	PrintWriter p=new PrintWriter(f1);
         	p.println(this.name);
         	p.println(this.phone_number);
         	p.close();
     	}
     	catch(IOException ie)
     	{
        	
     	}
    }

    public void searchEntry(String searchkey)
    {
    	int foundflag=0;
    	try
    	{
        	File f=new File("phone.txt");
           	Scanner sc=new Scanner(f);
           	while(sc.hasNextLine())
           	{
	String line=sc.nextLine();
                String number=sc.nextLine();
                if(line.equals(searchkey))
               	{
                	foundflag=1;
                	System.out.println("Found entry : "+line+" : "+number);
            	}
           }
       	}
       	catch(IOException ie)
       	{
        	
       	}
       	if(foundflag==0)
        	System.out.println("0 entries found for "+searchkey);
    }
}
public class Slip14_1
{
	public static void main(String[] args) throws IOException
	{
BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
    	int choice=0;
    	do
   		{
			String name="";
    	    long phone_number=0;
        	System.out.println("Choose an option:");
	        System.out.println("1.Add a new Name-Phone pair");
    	    System.out.println("2.Search Name and Display Phone No");
        	System.out.println("3.Exit");
	        System.out.println("Enter your choice:");
    	    choice=Integer.parseInt(b1.readLine());
        	switch(choice)
        	{
	        	case 1:
       			System.out.println("Enter name:");
                    	name=b1.readLine();
               	     	System.out.println("Enter phone number:");
                	    phone_number=Long.parseLong(b1.readLine());
                  	PhoneDirectory p1=new PhoneDirectory(name,phone_number);
                    	p1.makeEntry();
                    	break;

	case 2:
	System.out.println("Enter a name to search:");
                    	name=b1.readLine();
                    	PhoneDirectory p2=new PhoneDirectory();
                    	p2.searchEntry(name);
                    	break;
	case 3:
		break;
            	default: System.out.println("Wut");
			}
		}while(choice!=3);
    }
}
