import java.io.*;

abstract class shape
{
	
	abstract void area();
	abstract void volume();
	
}

class  sphere extends shape{
double r;
public sphere(double t)
{
r=t;
}

void area()
{
System.out.println(""+4*3.14*r*r);

}

void volume()
{
System.out.println(""+4*3.14*r*r*r/3);
}
}
//------------------

class  cone extends shape{
double r,h,l;
public cone(double t1,double t2,double t3)
{
r=t1;
h=t2;
l=t3;
}

void area()
{
System.out.println(""+3.14*r*(r+l));

}

void volume()
{
System.out.println(""+3.14*r*r*h/3);
}
}
//================
class  cylinder extends shape{
double r,h;
public cylinder(double t1,double t2)
{
r=t1;
h=t2;

}

void volume()
{
System.out.println(""+3.14*r*r*h);

}

void area()
{
System.out.println(""+2*3.14*r*(r+h));
}
}

class demo
{
public static void main(String []args) throws IOException,NumberFormatException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
shape parent;
while(true){
System.out.println("1.SPhere");
System.out.println("2.Cone");
System.out.println("3.Cylinder");
System.out.println("4.Exit");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1: System.out.println("ENter Radius"); 
double f= Double.parseDouble(br.readLine());

 sphere s0= new sphere(f);
 parent=s0;
 parent.area();
 parent.volume();
 break;
case 2:System.out.println("ENter Radius,Height and slant Height"); 
double f1= Double.parseDouble(br.readLine()); System.out.println("ENter Radius,Height and slant Height");
double f2=Double.parseDouble(br.readLine());System.out.println("ENter Radius,Height and slant Height");
double f3=Double.parseDouble(br.readLine());
cone s1= new cone(f1,f2,f3);
 parent=s1;
 parent.area();
 parent.volume();
 break;
case 3:System.out.println("ENter Radius,Height"); 
double g1= Double.parseDouble(br.readLine()); System.out.println("");
double g2=Double.parseDouble(br.readLine());

cylinder s2= new cylinder(g1,g1);
 parent=s2;
 parent.area();
 parent.volume();;
 break;
case 4:
default:;

}
}
}
}