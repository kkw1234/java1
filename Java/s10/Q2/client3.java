import java.io.*;
import java.net.*;

class client3
  {
    public static void main(String[] args) throws IOException 
      {
    	Socket s = null;
    	PrintWriter out = null;
    	int i,n;
        try 
         {
           s = new Socket("127.0.0.1", 1234);
           out = new PrintWriter(s.getOutputStream(), true);
           BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           System.out.print("Enter the how many files you want: ");
           n=Integer.parseInt(br.readLine());
           out.println(n);
           String fname[]=new String[n];
           System.out.println("Enter the "+n+" file names: ");
           for(i=0;i<n;i++)
             {
             	fname[i]=br.readLine();
                out.println(fname[i]);
                System.out.println(in.readLine());
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
