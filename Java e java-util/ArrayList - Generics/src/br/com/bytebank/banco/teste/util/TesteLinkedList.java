package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(42, 61);
		Conta cc3 = new ContaCorrente(42, 61);
		
		lista.add(cc1);
		lista.add(cc2);
		
		System.out.println(lista.contains(cc3));

	}

}
