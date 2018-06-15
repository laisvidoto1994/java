package javaTreinamento;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultServer 
{

	public static void main(String[] args) 
	{
		Socket cliente;
		ServerSocket servidor;
		
		try
		{
			servidor = new ServerSocket();
			while(true)
			{
				System.out.println("esperando conecao de cliente");
				cliente = servidor.accept();
				//new ClienteThread(cliente)args.start();
			
			}
		} catch (IOException e) { }
	}
}
