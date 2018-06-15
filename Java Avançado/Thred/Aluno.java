//package teste;
/*
 * 	Desenvolva um programa que contenha uma classe aluno, 
 * que contém os atributos nome, curso e nota. Crie os respectivos 
 * assessores (gets e sets) para cada atributo. Crie também uma
 * instância de uma lista, onde você deverá instanciar e 
 * adicionar 4 alunos. Ao final, imprima no console os alunos 
 * existentes na lista, ordenados pela sua nota (maiores primeiro).
 * */
public class Aluno
{

	private String nome;
	private String curso;
	private double nota;
	
	
	
	
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
	 * @return the curso
	 */
	public String getCurso()
	{
		return curso;
	}




	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) 
	{
		this.curso = curso;
	}

	/**
	 * @return the nota
	 */
	public double getNota()
	{
		return nota;
	}




	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota)
	{
		this.nota = nota;
	}




	// construtor
	public Aluno() 
	{
		// TODO Auto-generated constructor stub
	}

}
