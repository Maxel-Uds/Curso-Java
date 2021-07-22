package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class OrdenandoListas {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaCorrente(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaCorrente(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        for(Conta c : lista) {
        	System.out.println(c);
        }

        NumeroDaContaComparator comparator = new NumeroDaContaComparator();  
        lista.sort(comparator);
        
        System.out.println("---------------");
        
        for(Conta c : lista) {
        	System.out.println(c);
        }

	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		if(c1.getNumber() < c2.getNumber()) {
			return -1;
		} else if(c1.getNumber() > c2.getNumber()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
	
}