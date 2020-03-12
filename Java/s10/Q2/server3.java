import java.net.*;
import java.io.*;

class server3
  {
    public static void main(String[] args) throws IOException 
     {
       Socket s = null;
       PrintWriter out = null;
       ServerSocket ss = null;
       String fname[]=new String[20];
       int i,n;
       try 
        {
          ss = new ServerSocket(1234);
          System.out.println("Server Started.......");
          s= ss.accept();
          System.out.println("Server Connected.......");
          BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));          
          out = new PrintWriter(s.getOutputStream(), true);
          n=Integer.parseInt(in.readLine());
          System.out.println("The files are: ");
          for(i=0;i<n;i++)
            {
              fname[i]=in.readLine();
               System.out.println(fname[i]);
              File f=new File(fname[i]);
              if(f.exists())
                out.println("File present ");
              else   
                out.println("The file "+fname[i]+" does not exists");
            }   
          out.close();
          s.close();
        } 
      catch (Exception e) 
        {
          System.out.println("Error: "+e);
        }
    } 
 }