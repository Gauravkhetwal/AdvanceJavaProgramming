import java.io.*;
import java.net.*;
public class Client {
	public static void main(String[] args){
		try{
			Socket s=new Socket("192.168.43.145",8081);

			DataOutputStream dout= new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			}
		catch(Exception e)
		{System.out.println(e);}
	}
}
