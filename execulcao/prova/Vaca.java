/**
 * 
 */
//package prova;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lais.de.souza.vidoto
 *
 */
public class Vaca extends Mamifero
{

	private boolean permiteOrdenhar;
	
	
	/*Metodos da Classe Vaca*/
	public void ordenhar()
	{
		try 
		{
			if (permiteOrdenhar = true) 
			{
				
				System.out.println("Vaca Ordenhada!");
			}else
			{
				System.out.println("Vaca não Ordenhada!");
			}
			
		} catch (Exception e) {
			System.out.println("erro!");
		}
	}
	
	

	/*Metodos da Classe Mamifero*/
	@Override
	public void correr(){ System.out.println("Vaca Correndo!"); }

	
	/* Metodos da Classe Animal */
	@Override
	public void imprime()
	{ 
		Vaca  v  = new Vaca();
		Vaca  v2 = new Vaca();
		
		v.setNome("Vaca1");
		v2.setNome("Vaca2");
		/*
		 * 8ª questão
		 */
		v.setPermiteOrdenhar(true);
		v.setPermiteOrdenhar(false);
		
		List<Vaca> listaVaca = new ArrayList<Vaca>();
		
		listaVaca.add(v);
		listaVaca.add(v2);
		
		System.out.println( listaVaca);
	}
	@Override
	public void falar()
	{
		System.out.println( this.getNome() + "Vaca Falando!"); 
	}
	
	
	
    /* Gets e Sets da Classe da Vaca */
	/**
	 * @return the permiteOrdenhar
	 */
	public boolean isPermiteOrdenhar()
	{
		return permiteOrdenhar;
	}

	/**
	 * @param permiteOrdenhar the permiteOrdenhar to set
	 */
	public void setPermiteOrdenhar(boolean permiteOrdenhar) 
	{

		try 
		{
			 
			if (permiteOrdenhar = true) 
			{
				ordenhar();
				
			}else
			{
				System.out.println("Vaca não Ordenhada!");
			}
			
		} catch (Exception e) {
			System.out.println("erro!");
		}

	}

	/* Metodo Construtor da Classe Vaca*/
	public Vaca() { }
	
	public Vaca( String classe, Boolean permiteOrdenhar) 
	{
		this.classe = classe;
		this.permiteOrdenhar = permiteOrdenhar;
	}

}
