/**
 * 
 */
//package prova;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;   
import java.sql.Statement;
import java.sql.PreparedStatement ;

public class MyConnection 
{
	/*-------------------------------------------------------------------*/
	private String host;
	private String usuario;
	private String senha;
	/*-------------------------------------------------------------------*/
	public Connection connect; //connect é do tipo Connection e publico
	public Statement st;
    public ResultSet rs;
    public int rs1;
	/*-------------------------------------------------------------------*/
	public MyConnection (String host,String usuario,String senha)
    {
		this.host    = host;    
		this.usuario = usuario;
		this.senha   = senha;
    }
	/*-------------------------------------------------------------------*/
	public String parametros()
	{
		
		String portNumber = "3306";
		String servico    = "jdbc";
		String url        = "jdbc:mysql:thin:@"+ this.host + ":" + portNumber + ":" + servico;
		
		//String portNumber = "1521";
		//String servico    = "xe";
		//String url        = "jdbc:oracle:thin:@"+ this.host + ":" + portNumber + ":" + servico; 
		
        return url;
	}
	/*-------------------------------------------------------------------*/
	 public boolean connect()
	 {
		 boolean coneccao = false;
	      
		   String url = parametros();
	       
		    try 
	        {
	            //Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
	            Class.forName("mysql.jdbc.driver").newInstance();
	            
	            this.connect = DriverManager.getConnection( url , this.usuario , this.senha );
	            coneccao = true;
	            
	        } catch( SQLException e ) {
	            System.out.println( e.getMessage() );
	            coneccao = false;
	            
	        } catch ( ClassNotFoundException e ) {
	            System.out.println( e.getMessage() );
	            coneccao = false;
	            
	        } catch ( InstantiationException e ) {
	            System.out.println( e.getMessage() );
	            coneccao = false;
	            
	        } catch ( IllegalAccessException e ) {
	            System.out.println( e.getMessage() );
	            coneccao = false;
	        }
	        
	        System.out.println("Acesso Permitido ao Banco!");
	        return coneccao;
	 }
	/*-------------------------------------------------------------------*/
	 public boolean desconnect()
	 {
		 boolean desconeccao = false;
	        
		 String url = parametros();
		 
	        try 
	        {
	            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
	            this.connect = DriverManager.getConnection( url , this.usuario , this.senha );
	            this.connect.close();
	            desconeccao = true;
	            
	        } catch( SQLException e ) {
	            System.out.println( e.getMessage() );
	            desconeccao = false;
	            
	        } catch ( ClassNotFoundException e ) {
	            System.out.println( e.getMessage() );
	            desconeccao = false;
	            
	        } catch ( InstantiationException e ) {
	            System.out.println( e.getMessage() );
	            desconeccao = false;
	            
	        } catch ( IllegalAccessException e ) {
	            System.out.println( e.getMessage() );
	            desconeccao = false;
	        }
	        
	        System.out.println("Acesso Não Permitido ao Banco!");
	        return desconeccao;
	 }
		/*-------------------------------------------------------------------*/
	 public ResultSet executar( String query )
	 {
	       //connect();
	        try 
	        {
	            st = this.connect.createStatement();
                rs = st.executeQuery(query);
                
                
                while ( rs.next() ) 
                {
                	System.out.println( rs.getString("NM_CLIENTE") );
				}
                
                connect.close();
	            
	        } catch ( SQLException e ) {
	            e.printStackTrace();
	        }
	 	
	        //return null;
	        System.out.println(rs);
			return rs;
 	 }
	  /*-------------------------------------------------------------------*/
	 public String getNomeAluno( String campos,String nameTabela )
	 {
	       //connect();
		 String campo      = campos;
		 String nomeTabela = nameTabela;
		 
	        try 
	        {
	            
	        	//String sql = ("insert " +campo+ "from" +nomeTabela+ ";");
	        	String sql = ("insert idAluno,nomeAluno,idadeAluno from Aluno values(?,?,?)");
	        	PreparedStatement ps = connect.prepareStatement(sql);
	        	ps.setString(1,"lais",9 );
	        	
	            
/*
    String consultaSQL = “select cli_nome from cliente where cli_telefone = ?”;
 	PreparedStatement ps = conexao.prepareStatement(consultaSQL);
 	ps.setString(1, telefone); 
 	ResultSet rs = ps.executeQuery();
 	if (rs.next()) then return rs.getString(“cli_nome”);
 	else return “Cliente não existe”;
}
*/
	            
	            
	            
	            rs1 = st.executeUpdate(sql);
                
	            
                
                while ( rs.next() ) 
                {
                	System.out.println( rs.getString("nomeAluno") );
				}
                
                connect.close();
	            
	        } catch ( SQLException e ) {
	            e.printStackTrace();
	        }
	 	
	        //return null;
	        System.out.println(rs);
			return rs1;
 	 }
	 	
	 /*-------------------------------------------------------------------*/
	 
}