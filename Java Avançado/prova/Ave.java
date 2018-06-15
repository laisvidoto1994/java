//package prova;

/**
 * Classe Ave
 */
public class Ave extends Animal
{
	
	/* Metodos da Classe Ave*/
	public void voar(int x)
	{
		/*
		 * 7ª questão
		 */
		for (int i = 0; i < x; i++) 
		{
			System.out.println("Ave esta voando!");
		}
		
		System.out.println("Ave parou de voar!");
	}
	

	/* Metodos da Classe Animal */
	@Override
	public void imprime(){ System.out.println("isso é uma Ave!");}
	
	@Override
	public void falar()	
	{
		System.out.println(this.getNome() +"Ave Falando!");
	}
	
	/*Metodo Construtor da Classe de Ave*/
	public Ave() {}

}
