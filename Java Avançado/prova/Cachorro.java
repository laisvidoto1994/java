/**
 * 
 */
//package prova;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lais.de.souza.vidoto
 */
public class Cachorro extends Mamifero
{
	/* Atributos da Classe de Cachorro*/
	private boolean tipoLatido;
		
	/*Metodos da Classe Cachorro*/
	public void setLateAlto()
	{
		this.tipoLatido = true;
		System.out.println("Cachorro Latindo Alto!");
	}
	public void setLateBaixo()
	{
		this.tipoLatido = false;
		System.out.println("Cachorro Latindo Baixo!"); 
	}
	
	
	/*Metodos da Classe Mamifero*/
	@Override
	public void correr(){ System.out.println("Cachorro Correndo!"); }

	
	/* Metodos da Classe Animal */
	@Override
	public void imprime()
	{ 
		Cachorro c  = new Cachorro();
		Cachorro c2 = new Cachorro();
		
		c.setNome("Cachorro1");
		c2.setNome("Cachorro2");
		
		List<Cachorro> listaCachorro = new ArrayList<Cachorro>();
		
		listaCachorro.add(c);
		listaCachorro.add(c2);
		
		System.out.println( listaCachorro );
	}
	public void falar(){ System.out.println(this.getNome() + "Cachorro Falando!"); }
	
	
	/* Get's e Set's da Classe Cachorro  */
	/**
	 * @return the tipoLatido
	 */
	public boolean isTipoLatido()
	{
		return tipoLatido;
	}

	/**
	 * @param tipoLatido the tipoLatido to set
	 */
	public void setTipoLatido(boolean tipoLatido)
	{
		this.tipoLatido = tipoLatido;
	}

	/*Metodo Construtor da Classe de Cachorro*/
	public Cachorro() {}
	
	public Cachorro(String classe,boolean tipoLatido) 
	{
		this.classe = classe;
		this.tipoLatido = tipoLatido;
	}

}
