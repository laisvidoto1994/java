//package clienteServidor;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
*/
import java.net.*;
import java.io.*;

public class Servidor // fica escultando os clientes
{
//--------------------------------------------------------------------------//
	public static void main(String[] args) 
	{
		Socket       cliente;
		ServerSocket servidor;
		
		boolean done = false;
		
		try 
		{
			servidor = new ServerSocket(5000);//crie porta para conecção do socket
			
			while (true)
			{
				System.out.println("esperando coneção de cliente ");

				cliente = servidor.accept();
				
				System.out.println("cliente se conectando!");
				
				InputStream    in      = cliente.getInputStream();
				BufferedReader entrada = new BufferedReader( new InputStreamReader(in) );

				while (!done) 
				{
					String str = entrada.readLine();
					if ( str == null ||  str.equals("BYE") )
					{
						done = true;
						System.out.println("conecção finalizada!");
					} 
					else 
					{
						System.out.println("recebeu:" + str);
					}					
				}
				cliente.close();
			}
		} catch (IOException e) 
		{
			System.out.println("Erro ao aceitar conexao com o cliente.Erro: " + e);
		}

	}
	//--------------------------------------------------------------------------//
}
