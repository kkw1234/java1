//                 -------server----------


import java.net.*;
import java.io.*;
import java.util.*;
public class EchoServer
{
	public static void main(String args[]) throws UnknownHostException,IOException
	{
		ServerSocket ss=new ServerSocket(4444);
		System.out.println("Server started");
		Socket s=ss.accept();
		System.out.println("Connected to client");
		InputStream is=s.getInputStream();
		DataInputStream ds=new DataInputStream(is);
		OutputStream o=s.getOutputStream();
		DataOutputStream ds1=new DataOutputStream(o);
		boolean done=false;
		while(!done)
		{
			String message=ds.readUTF();
			ds1.writeUTF(message.toUpperCase());
			if((message.toUpperCase()).equals("END"))
			    done=true;
		}
	 	s.close();
	}
}