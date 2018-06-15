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
public class BemTeVi extends Ave
{


	/* Metodos da Classe Ave*/
	@Override
	public void voar(int x){System.out.println("BemTeVi voando!");}
	

	/* Metodos da Classe Animal */
	@Override
	public void falar()	{ System.out.println( this.getNome() + "BemTeVi Falando!");}
	@Override
	public void imprime()
	{ 
		BemTeVi  bem  = new BemTeVi();
		BemTeVi  bem1 = new BemTeVi();
		
		bem.setNome("BemTeVi1");
		bem1.setNome("BemTeVi2");
		
		List<BemTeVi> listaBemTeVi = new ArrayList<BemTeVi>();
		
		listaBemTeVi.add(bem);
		listaBemTeVi.add(bem1);
		
		System.out.println( listaBemTeVi );
	}
	
	/* Metodo Construtor da Classe BemTeVi*/
	public BemTeVi() {}
	
	public BemTeVi(String classe) 
	{
		this.classe = classe;
	}

}
