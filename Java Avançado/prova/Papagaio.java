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
public class Papagaio extends Ave 
{

	/* Atributos da Classe Papagaio */
	private String vocabulario;

	/* Metodos da Classe Ave */
	@Override
	public void voar(int x) 
	{
		System.out.println("Papagaio voando!");
	}

	/* Metodos da Classe Animal */
	@Override
	public void falar() 
	{
		this.getNome();
		System.out.println( this.getNome() + "Papagaio Falando!");
	}
	@Override
	public void imprime()
	{ 
		Papagaio  p = new Papagaio();
		Papagaio  p2 = new Papagaio();
		
		p.setNome("Papagaio1");
		p2.setNome("Papagaio2");
		
		List<Papagaio> listaPapagaio = new ArrayList<Papagaio>();
		
		listaPapagaio.add(p);
		listaPapagaio.add(p2);
		
		System.out.println( listaPapagaio);
	}

	/* Get's e Set's da Classe Papagaio */
	/**
	 * @return the vocabulario
	 */
	public String getVocabulario()
	{
		return vocabulario;
	}

	/**
	 * @param vocabulario the vocabulario to set
	 */
	public void setVocabulario(String vocabulario)
	{
		try 
		{

			if ( this.vocabulario.equals(null) || this.vocabulario.equals(""))
			{
				System.out.println("campo não pode ser nullo ou em branco!");
			}else {
				this.vocabulario = vocabulario;
			}
		} catch (NullPointerException e) {
			System.out.println("Erro!");
		}
	}

	/* Metodo Construtor da Classe Vaca*/
	public Papagaio() { }
	
	public Papagaio( String classe, String vocabulario) 
	{
		this.classe = classe;
		this.vocabulario = vocabulario;
	}

}
