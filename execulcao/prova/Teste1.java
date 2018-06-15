public class Teste1 {

	public static void main(String[] args) {

		/*
		 * Animal a = new Animal();
		 * 
		 * BemTeVi bem = new BemTeVi(); BemTeVi bem1 = new BemTeVi(); Papagaio p
		 * = new Papagaio(); Papagaio p2 = new Papagaio(); Cachorro c = new
		 * Cachorro(); Vaca v = new Vaca();
		 * 
		 * bem.setNome("BemTeVi"); bem1.setNome("BemTeVi");
		 * 
		 * p.setNome("Papagaio"); p2.setNome("Papagaio");
		 * 
		 * c.setNome("Cachorro"); v.setNome("Vaca"); //
		 * System.out.println(a.getNome( ) );
		 * 
		 * // ---------------------------------------------------//
		 * 
		 * List<BemTeVi> listaBemTeVi = new ArrayList<BemTeVi>();
		 * listaBemTeVi.add(bem); listaBemTeVi.add(bem1);
		 * System.out.println(listaBemTeVi );
		 * 
		 * List<Papagaio> listaPapagaio = new ArrayList<Papagaio>();
		 * listaPapagaio.add(p); listaPapagaio.add(p2);
		 * System.out.println(listaPapagaio );
		 * 
		 * List<Cachorro> listaCachorro = new ArrayList<Cachorro>();
		 * listaCachorro.add(c);
		 * 
		 * List<Vaca> listaVaca = new ArrayList<Vaca>(); listaVaca.add(v);
		 */

		/*
		 * String nome = null;
		 * 
		 * if ("cachorro".equals(nome)) {
		 * 
		 * }
		 * 
		 * if (a.getNome().equals("Cachorro")) { c.setNome("Cachorro");
		 * System.out.println("Animal->" + c.getNome()); } else if
		 * (a.getNome().equals("Vaca")) { v.setNome("Cachorro");
		 * System.out.println("Animal->" + v.getNome()); } else if
		 * (a.getNome().equals("BemTeVi")) { bem.setNome("BemTeVi");
		 * System.out.println("Animal->" + bem.getNome()); } else if
		 * (a.getNome().equals("Papagaio")) { p.setNome("Papagaio");
		 * System.out.println("Animal->" + p.getNome()); }
		 * 
		 * // ----------------------------------------------------------//
		 */
		/*
		 * 9ª e 10ª questão
		 */
		BemTeVi vi = new BemTeVi();
		vi.imprime();

		Cachorro c = new Cachorro();
		c.imprime();

		Papagaio p = new Papagaio();
		p.imprime();

		Vaca v = new Vaca();
		v.imprime();

		/*
		 * 7ª questão
		 */
		Ave av = new Ave();
		av.voar(2);

	}

}
