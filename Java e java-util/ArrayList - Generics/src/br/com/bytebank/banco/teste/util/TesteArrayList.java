package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		Conta cc1 = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(42, 61);
		
		lista.add(cc1);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		lista.remove(0);
		
		System.out.println(lista.size());

	}

}
