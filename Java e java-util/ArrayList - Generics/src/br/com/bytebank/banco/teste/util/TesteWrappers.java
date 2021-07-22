package br.com.bytebank.banco.teste.util;

public class TesteWrappers {

	public static void main(String[] args) {

		int idade = 29;
		Integer idadeRef = Integer.valueOf(idade);//Autoboxing
		System.out.println(idadeRef.intValue());//Unboxing
		
		Double dRef = Double.valueOf(3.2);//Autoboxing
		System.out.println(dRef.doubleValue());//Unboxing
		
		Boolean bRef = Boolean.TRUE;//Autoboxing
		System.out.println(bRef.booleanValue());//Unboxing
		
		Number numero = Integer.valueOf(idade);

	}

}
