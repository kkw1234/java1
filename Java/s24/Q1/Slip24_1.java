 import java.io.*;
class Vehicle
{             
                String cname;
                float price;

                void accept() throws IOException
                {
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                                System.out.println("Enter vehicle information");

                                System.out.println("Enter Company name : ");
                                cname= br.readLine();
                                System.out.println("Enter price : ");
                                price = Float.parseFloat(br.readLine());
                }

                void display()
                {
                                System.out.println("Company Name : "+cname+"\nPrice : "+price);
                }

}

class LightMotorVehicle extends Vehicle
{
                int mileage;

                void accept() throws IOException
                {
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                                super.accept();

                                System.out.println("Enter mileage : ");
                                mileage = Integer.parseInt(br.readLine());
                }

                void display()
                {
                                super.display();
                                System.out.println("\nMileage : "+mileage);
                }

}

class HeavyMotorVehicle extends Vehicle
{
                int capacity;

                void accept() throws IOException
                {
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                                super.accept();

                                System.out.println("Enter capacity in tones : ");
                                capacity = Integer.parseInt(br.readLine());
                }

                void display()
                {
                                super.display();
                                System.out.println("\nCapacity int tones  : "+capacity);
                }

}

class Slip24_1
{
                public static void main(String args[]) throws IOException              
                {
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                                System.out.println("Enter type of vehicle \n1. for light motor vehicle \n2. for heavy motor vehicle  ");
                                int ch = Integer.parseInt(br.readLine());
                                int no;                  
                                switch(ch)
                                {
                                                case 1 :System.out.println("Enter no of light motor");
                                                                no = Integer.parseInt(br.readLine());
                                                                LightMotorVehicle lv[] = new LightMotorVehicle[no];

                                                                for(int i = 0 ; i < no; i++)
                                                                {
                                                                                lv[i] = new LightMotorVehicle();              
                                                                                lv[i].accept();    
                                                                }
                                                                System.out.println("Information of light motor are");
                                                                System.out.println("=======================");
                                                                for(int i = 0 ; i < no; i++)
                                                                {
                                                                                //lv[i] = new LightMotorVehicle();          
                                                                                lv[i].display();   
                                                                }
                                                                break;
                                                case 2 :System.out.println("Enter no of heavy motor");
                                                                no = Integer.parseInt(br.readLine());
                                                                HeavyMotorVehicle hv[] = new HeavyMotorVehicle[no];

                                                                for(int i = 0 ; i < no; i++)
                                                                {
                                                                                hv[i] = new HeavyMotorVehicle();          
                                                                                hv[i].accept();  
                                                                }
                                                                System.out.println("Information of heavy motor are");
                                                                System.out.println("=======================");
                                                                for(int i = 0 ; i < no; i++)
                                                                {
                                                                                //lv[i] = new LightMotorVehicle();          
                                                                                hv[i].display();  
                                                                }
                                                                break;
                                                                //calculate_salary(mn,no);
                                }
                }             
}