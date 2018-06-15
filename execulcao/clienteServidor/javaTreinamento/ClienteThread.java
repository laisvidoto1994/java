package javaTreinamento;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.Socket;
import java.io.*;
import java.net.*;

import org.omg.CORBA.portable.InputStream;

public class ClienteThread extends Thread
{
	
	Socket cliente;
	
	
	public ClienteThread(Socket sock)
	{
		cliente = sock;
	}

	
	public void run() 
	{
		try 
		{
			System.out.println("cliente se conectando.");
			
			InputStream    in       = cliente.getInputStream();
			BufferedReader entrada  = new BufferedReader(new InputStreamReader(in));
			
			String str = null;
			
			while(true)
			{
				str = entrada.readLine();
				if( str == null || str.equals("BYE"))
				{
					System.out.println("recebeu " + str);
					break;
				}
				else
				{
					System.out.println("recebeu " + str);
				}
			}
			if(str != null)
			{
				cliente.close();
			}
			
		} catch (IOException e) { }	
	}
}
