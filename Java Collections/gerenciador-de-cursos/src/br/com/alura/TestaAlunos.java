package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<String>();
		
		alunos.add("Rodrigo Turini");
		alunos.add("Roberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Lourenço");
		alunos.add("Rodrigo Jonas");
		
		System.out.println(alunos);

	}

}
