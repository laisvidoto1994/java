/**
 * 
 */
//package prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class TesteConecction 
{

	public static void main(String[] args) throws SQLException
	{
	
		String driverName = "oracle.jdbc.driver.OracleDriver";//nome do drive da oracle
		
		try
		{
			Class.forName(driverName);
		
/** 
 * getConnection( url, usuario, senha);
 * jdbc URL-> "jdbc:oracle:thin:@localhost:1521:xe" 
 
	"jdbc':'+ TipoBanco':'+ 
	 thin':' + '@' + 
	 server + ':' + 
	 porta + ':' + 
	 sid  " +
 
 * USUARIO-> "Treinamento"
	     ',' +
	 "NomeDoUsuarioDeAcessoaoBanco" + 
 	 
 *SENHA-> "Treinamento"
 	     ',' +
	 "SenhaDoUsuarioDeAcessoaoBanco" 
 */
			
			Connection conexao = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","Treinamento","Treinamento" ); 
			
			System.out.println("Acesso Permitido ao Banco!");
		
			//criação para o PreparedStatement
			//PreparedStatement preparStatm = conexao.prepareStatement( "Select * from CLIENTE Where NM_CLIENTE = ?" );
			//preparStatm.setString(1, "Edna Soares"); 
			//ResultSet rs = preparStatm.executeQuery();
			
			
			//criação para o Statement
			Statement Statm = conexao.createStatement();
			ResultSet rs = Statm.executeQuery("Select * from CLIENTE " );
			
			
			//executeQuery-> é apenas para consulta de dados criada no statement
			while ( rs.next() ) 
	    	{
				System.out.println( rs.getString("NM_CLIENTE") );//nome do campo que esta na clausula where
	    	}
		
			conexao.close();
		
		}catch(ClassNotFoundException e){ 
		
		                                }
		
	}

}
