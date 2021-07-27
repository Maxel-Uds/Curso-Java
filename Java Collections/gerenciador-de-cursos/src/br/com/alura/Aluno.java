package br.com.alura;

public class Aluno {

	private String nome;
	private int matricula;
	
	public Aluno(String nome, int numeroMatricula) {
	    if (nome == null) {
	        throw new NullPointerException("Nome não pode ser nulo");
	    }
	    this.nome = nome;
	    this.matricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno)obj;
		return this.matricula == aluno.getMatricula();
	}
	
	@Override
	public int hashCode() {
		return this.matricula;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
}
