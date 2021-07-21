package br.com.bytebank.banco.teste;

public class Array {

	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; //Inicializa o array com os valores zerados
		
//		idades[0] = 29;
//		idades[1] = 41;
//		idades[2] = 18;
//		idades[3] = 16;
//		idades[4] = 25;
//
//		System.out.println(idades[3]);
//		System.out.println(idades.length);
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * 2;	
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);	
		}
		
	}

}
