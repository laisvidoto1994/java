/**
 * 
 */
//package teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author lais.de.souza.vidoto
 *
 */
public class TesteArquivo 
{

	public static void main(String[] args) throws IOException
	{
		
		/**Leitura de bydes do arquivo*/
		/*
		  InputStream arquivo = new FileInputStream("C://Users/lais.de.souza.vidoto/Accenture/Desktop//Leitura_Aquivo_java.txt");
		  int b = arquivo.read();
		  System.out.println(b);
		*/
		
		/**Leitura de bydes do arquivo*/
		/*
		  String str = readString( "Digite Alguma Coisa: " );
		  System.out.println( "Você Digitou: " + str );
        */
		
		/**Leitura do Arquivo, e escrever dentro do arquivo o que esta abaixo*/
		/*
		  OutputStream       os  = new FileOutputStream("C://Users/lais.de.souza.vidoto/Accenture/Desktop//Leitura_Aquivo_java.txt");
		  OutputStreamWriter osw = new OutputStreamWriter(os);//chamada para criar á saida da iscrita
		
		  BufferedWriter     bw  = new BufferedWriter(osw);// o que vc quer que escreva dentro dele
		  bw.write("O que escrever aqui, modifica dentro do arquivo passado no OutputStream");
		  bw.close();		
		*/
		
		/**Mostra tudo que estiver escrito no arquivo passado */
		/*
		  InputStream       is  = new FileInputStream("C://Users/lais.de.souza.vidoto/Accenture/Desktop//Leitura_Aquivo_java.txt");
		 
		  InputStreamReader isr = new InputStreamReader(is);
		  BufferedReader    br  = new BufferedReader(isr);
		
		  String s = br.readLine(); //primeira linha
		
		  while (s != null) 
		  {
			System.out.println(s);
		 	s = br.readLine();
		  }
		  br.close();
		
		*/
		
		
		/** */
		
		File            f   = new File( "C://Users/lais.de.souza.vidoto/Accenture/Desktop//Leitura_Aquivo_java.txt" );
		FileInputStream fos = new FileInputStream(f);//lendo os dados e passando o enderreco do arquivo
		DataInputStream dos = new DataInputStream(fos);
		
		int   n   = dos.readInt();
		float flo = dos.readFloat();
		char  c   = dos.readChar();
		
		System.out.println( "foram lidos os valores:" );
		System.out.println( "(int)  = " + n );
		System.out.println( "(float)= " + flo );
		System.out.println( "(char) = " + c );
		
		dos.close();
		
	}
	//------------------------------------------------------------------------------------//
	public static String readString(String msg)
	{
		String str = "";
		char c = ' ';
		
		System.out.println(msg);
		
		for(;;)
		{
			try 
			{
				c = (char)System.in.read();
				
			} catch (IOException e) { }
			
			if ( c == -1 || c == '\n' ) 
			{
				break;
			}
			
			str +=c;
		}
		return str;
	}
	//------------------------------------------------------------------------------------//
	
}
