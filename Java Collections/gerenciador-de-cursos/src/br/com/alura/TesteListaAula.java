package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListaAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisitando os ArraysList", 21);
		Aula a2 = new Aula("Listas de objetos", 15);
		Aula a3 = new Aula("Relacionamentos entre listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);

	}

}
