/**
 * 
 */
//package clienteServidor;
/*
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
*/

import java.net.*;
import java.io.*;

public class Cliente
{
	//criando uma constante
	public static final int PORTA = 5000;
	//----------------------------------------------------------------------------//	
	public static void main(String[] args) throws IOException
	{
		Socket       sl    = new Socket("127.0.0.1",PORTA);
		//Socket       sl    = new Socket("10.21.42.130",PORTA);//ip do um outro computador
		OutputStream out   = sl.getOutputStream();
		PrintStream  saida = new PrintStream(out);
		
		boolean done = false;
		
		while(!done)
		{
			String str = Console.read(": ");
			saida.println(str);
			
			if(str.equals("BYE"))
			{
				done = true;
				System.out.println("Cliente quiz sair!");				
			}
		}
		sl.close();		
	}
	//----------------------------------------------------------------------------//
}
