import java.net.*;
import java.io.*;

class server2
  {
    public static void main(String[] args) throws IOException 
     {
       Socket s = null;
       PrintWriter out = null;
       ServerSocket ss = null;
       String fname;
       try 
        {
          ss = new ServerSocket(1234);
          System.out.println("Server Started.......");
          s= ss.accept();
          System.out.println("Server Connected.......");
          BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
          out = new PrintWriter(s.getOutputStream(), true);
          fname=in.readLine();
          System.out.println("The file name is: "+fname);
          FileInputStream fis=new FileInputStream(fname);
          DataInputStream dis=new DataInputStream(fis);
          out.println(fis.available());
          while(fis.available() > 0)
            {
              out.println(dis.readLine());
              out.println(fis.available());
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