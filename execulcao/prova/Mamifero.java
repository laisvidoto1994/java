/**
 * 
 */
//package prova;

/**
 * @author lais.de.souza.vidoto
 *
 */
public class Mamifero extends Animal
{
	/* Atributos da Classe de Mamifero*/
	private int velocidade;

	/*Metodos da Classe Mamifero*/
	public void correr(){ System.out.println("Mamifero Correndo!"); }

	
	/* Metodos da Classe Animal */
	@Override
	public void imprime(){ System.out.println("isso é uma animal!"); }
	@Override
	public void falar()
	{
		this.getNome();
		System.out.println("Animal Falando!"); 
	}
	
	
	/* Gets e Sets da Classe de Mamifero */
	/**
	 * @return the velocidade
	 */
	public int getVelocidade() 
	{
		return velocidade;
	}

	/**
	 * @param velocidade the velocidade to set
	 */
	public void setVelocidade(int velocidade)
	{
		this.velocidade = velocidade;
	}
	
	/*Metodo Construtor da Classe de Mamifero*/
	public Mamifero() { }
	
}
