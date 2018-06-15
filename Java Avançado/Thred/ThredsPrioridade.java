/**
 * 
 */
//package teste;

public class ThredsPrioridade extends Thread
{

	
	public ThredsPrioridade(String nome)
	{
		super (nome);
	}
	
	public ThredsPrioridade(String nome, int prioridade )
	{
		super (nome);
		setPriority(prioridade);
	}

	public void run ()
	{
		for (int i = 0; i < 4; i++) 
		{
			System.out.println(getName() + " " + i );
			yield();
		}
	}
	
	public static void main(String[] args) 
	{
		ThredsPrioridade t1 = new ThredsPrioridade( "menor",3 );
		ThredsPrioridade t2 = new ThredsPrioridade( "Maior",7 );
		ThredsPrioridade t3 = new ThredsPrioridade( "Default1" );
		ThredsPrioridade t4 = new ThredsPrioridade( "Default2" );
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
	}

}
