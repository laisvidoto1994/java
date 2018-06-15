/**
 * @author lais.de.souza.vidoto
 */
//package prova;

/**
 * Classe Animal
 */
public abstract class Animal implements InterAnimal 
{
	
	/* Atributos da Classe Animal */
	private   String nome;  //nome do Animal
	protected String classe;// classe no qual o animal pertence
	
	
	/* Metodos da Classe Animal */
	  public void imprime(){ System.out.println("isso é um animal!");}
	  public void falar(){ System.out.println("Animal Falando!) )");}
	  //deve imprimir nome e o som do animal
	
	
	/* Get's e Set's da Classe Animal */
	/**
	 * @return the nome
	 */
	public String getNome() 
	{
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	/**
	 * @return the classe
	 */
	public String getClasse() 
	{
		return classe;
	}

	/**
	 * @param classe the classe to set
	 */
	public void setClasse(String classe) 
	{
		this.classe = classe;
	}

	/*Metodo Construtor da Classe de Animal*/
	public Animal() {}

}
