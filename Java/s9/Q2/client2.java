import java.io.*;
import java.net.*;

class client2
  {
    public static void main(String[] args) throws IOException 
      {
    	Socket s = null;
    	PrintWriter out = null;
        String fname;
        try 
         {
           s = new Socket("127.0.0.1", 1234);
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           out = new PrintWriter(s.getOutputStream(), true);
           System.out.print("Enter the file name: ");
           fname=br.readLine();
           out.println(fname);
           BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
	       int size=Integer.parseInt(in.readLine());
	       while(size>0)
	        { 
	           System.out.println(in.readLine());
	           size=Integer.parseInt(in.readLine());
            }
           s.close();
           in.close();
         } 
        catch (UnknownHostException e) 
         {
            System.out.println("Error :"+e);
         } 
     }
  }
