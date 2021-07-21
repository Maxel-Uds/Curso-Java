package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardador {

	public static void main(String[] args) {
		
		GuadadorDeContas guardador = new GuadadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(44, 16);
		guardador.adiciona(cc2);
		
		System.out.println(guardador.getQtdElementos());

	}

}
