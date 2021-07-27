package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turin", 34672);
		Aluno a2 = new Aluno("João Silva", 34673);
		Aluno a3 = new Aluno("Jonas Augusto", 34674);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		
		Aluno silva = new Aluno("João Silva", 34673);
		System.out.println(javaColecoes.estaMatriculado(silva));

	}

}
