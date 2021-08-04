package exercicio2;

public class TestaAgenda {

	public static void main(String[] args) {
		
		Agenda a = new Agenda();
		
		a.armazenaPessoa("João", "10/04/2000", 170);
		a.armazenaPessoa("Ana", "10/04/1990", 155);
		a.armazenaPessoa("Luiza", "10/04/1998", 180);
		a.armazenaPessoa("Caetano", "10/04/1989", 150);
		a.armazenaPessoa("Luiz", "10/04/1985", 170);
		a.armazenaPessoa("Jonas", "10/04/1999", 176);
		a.armazenaPessoa("Yasmin", "10/04/1997", 169);
		a.armazenaPessoa("Carlos", "10/04/1996", 176);
		a.armazenaPessoa("Joana", "10/04/1995", 179);
		a.armazenaPessoa("Raphael", "10/04/1997", 170);
		
//		a.buscaPeloNome("Raphael");
//		a.removePessoa("Luiza");
//		a.imprimirAgenda();
		a.buscaPeloIndex(1);
//		a.buscaPeloNome("Raphael");
	}

}
