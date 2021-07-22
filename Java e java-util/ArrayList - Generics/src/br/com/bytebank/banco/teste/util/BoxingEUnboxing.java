package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class BoxingEUnboxing {

	public static void main(String[] args) {
		
		int idade = 29;
		Integer idadeRef = new Integer(idade);
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(idadeRef);

	}

}
