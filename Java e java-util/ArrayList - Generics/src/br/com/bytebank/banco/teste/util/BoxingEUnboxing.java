package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class BoxingEUnboxing {

	public static void main(String[] args) {
		
		int idade = 29;
		Integer idadeRef = Integer.valueOf(idade);//Autoboxing
		System.out.println(idadeRef.intValue());//Unboxing
		System.out.println(idadeRef.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		
		String s = args[0];
//		Integer num = Integer.valueOf(s);
		int num = Integer.parseInt(s);
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(29); //Autoboxing

	}

}
