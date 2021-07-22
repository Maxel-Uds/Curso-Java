package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(42, 61);
		Conta cc3 = new ContaCorrente(42, 61);
		
		lista.add(cc1);
		lista.add(cc2);
		
		System.out.println(lista.contains(cc3));
		
	}

}
