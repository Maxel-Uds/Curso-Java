package br.com.Bytebank.Banco.Teste;

public class TesteString {

	public static void main(String[] args) {
		
		
		//A String é um objeto imutável
		String nome = "Alura"; //Object literal
		
		//String outro = new String("Alura");
		
		//String outro = nome.replace("A", "a");
		
		//String outro = nome.toUpperCase();
		
		//char c = nome.charAt(2);
		
		//int pos = nome.indexOf("ur");
		
		int tamanho = nome.length();
		System.out.println(tamanho); 
	}

}
