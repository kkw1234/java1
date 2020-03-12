class slip11
{
   public static void main(String args[])
    {
           new demothread("I am In FY",10);
 new demothread("I am In SY",20);
 new demothread("I am In TY",30);
     }

}
class demothread implements Runnable
{
    int n;
String msg;
    demothread(String m,int i)
    {
      msg=m;
   n=i;
Thread t=new Thread(this,msg);
t.start();
   }
public void run()
{
   try
    {
    for(int i=1;i<=n;i++)
     {
   System.out.println(msg);
Thread.sleep(100);
     }
   }catch(InterruptedException e){}
}
    
}