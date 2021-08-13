package exercicio2;

import java.util.ArrayList;
import java.util.Collection;


public class Agenda {
	
	private Collection<Pessoa> agenda = new ArrayList<Pessoa>();
	
	public void armazenarPessoa(String nome, String data, int altura) {
		agenda.add(new Pessoa(nome, data, altura));
	}
	
	public void removerPessoa(String nome) {
		agenda.removeIf(pessoa -> pessoa.getNome() == nome);
	}
	
	public void buscarPeloNome(String nome) {
		agenda.stream().filter(p -> p.getNome() == nome).forEach(Pessoa::imprimeDados);
	}

	public void imprimirAgenda() {
		agenda.stream().forEach(Pessoa::imprimeDados);
	}
	
	public void buscarPeloIndex(int i) {
		 ((ArrayList<Pessoa>) agenda).get(i - 1).imprimeDados();
	}
}