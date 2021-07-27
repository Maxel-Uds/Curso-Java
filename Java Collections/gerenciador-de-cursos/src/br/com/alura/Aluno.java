package br.com.alura;

public class Aluno {

	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
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
