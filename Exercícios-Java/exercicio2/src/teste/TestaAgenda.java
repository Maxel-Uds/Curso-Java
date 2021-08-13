package teste;

import exercicio2.Agenda;

public class TestaAgenda {

	public static void main(String[] args) {
		
		Agenda a = new Agenda();
		
		a.armazenarPessoa("João", "10/04/2000", 170);
		a.armazenarPessoa("Ana", "10/04/1990", 155);
		a.armazenarPessoa("Luiza", "10/04/1998", 180);
		a.armazenarPessoa("Caetano", "10/04/1989", 150);
		a.armazenarPessoa("Luiz", "10/04/1985", 170);
		a.armazenarPessoa("Jonas", "10/04/1999", 176);
		a.armazenarPessoa("Yasmin", "10/04/1997", 169);
		a.armazenarPessoa("Carlos", "10/04/1996", 176);
		a.armazenarPessoa("Joana", "10/04/1995", 179);
		a.armazenarPessoa("Raphael", "10/04/1997", 170);
		
//		a.buscaPeloNome("Raphael");
//		a.removePessoa("Luiza");
//		a.imprimirAgenda();
		a.buscarPeloIndex(1);
//		a.buscaPeloNome("Raphael");
	}

}
