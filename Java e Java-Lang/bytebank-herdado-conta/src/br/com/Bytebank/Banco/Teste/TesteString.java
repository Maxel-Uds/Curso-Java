package br.com.Bytebank.Banco.Teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; //Object literal
		//String outro = new String("Alura");
		
		String outro = nome.replace("A", "a");
		//nome.toLowerCase();
		System.out.println(outro);
	}

}
