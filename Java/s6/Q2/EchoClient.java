/*1.
                    ----client-------
*/
import java.net.*;
import java.io.*;
import java.util.*;
public class EchoClient
{
	public static void main(String args[]) throws UnknownHostException,IOException
	{
		Socket s=new Socket("localhost",4444);
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		InputStream i=s.getInputStream();
		DataInputStream ds=new DataInputStream(i);
		OutputStream o=s.getOutputStream();
		DataOutputStream ds1=new DataOutputStream(o);
		boolean done=false;
		while(!done)
		{
			System.out.println("Enter message,type END to	stop");
			String message=br.readLine();
			ds1.writeUTF(message);	
			System.out.println("Waiting for server...");
			String serverMessage=ds.readUTF();
			System.out.println("Serversays-"+serverMessage);
			if(message.equals("END")||message.equals("end"))
			done=true;
		}
		s.close();
	}
}

