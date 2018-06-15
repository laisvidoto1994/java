/**
 * 
 */
//package prova;

public class Teste2 
{

	public static void main(String[] args) 
	{
		//MyConnection conect = new MyConnection("localhost","Treinamento","Treinamento");
		MyConnection conect = new MyConnection("localhost","root","root");
		
		
		conect.connect();
		//conect.executar("select NM_CLIENTE from CLIENTE");
		conect.executar("select nomeAluno from Aluno");
		conect.desconnect();
	}
}
