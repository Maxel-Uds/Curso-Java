package exercicio2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Agenda {
	
	private Collection<Pessoa> agenda = new ArrayList<Pessoa>();
	
	public void armazenaPessoa(String nome, String data, int altura) {
		agenda.add(new Pessoa(nome, data, altura));
	}
	
	public void removePessoa(String nome) {
		agenda.removeIf(pessoa -> pessoa.getNome() == nome);
	}
	
	public void buscaPeloNome(String nome) {
		agenda.stream().filter(p -> p.getNome() == nome).forEach(Pessoa::imprimeDados);
	}

	public void imprimirAgenda() {
		agenda.stream().forEach(Pessoa::imprimeDados);
	}
	
	public void buscaPeloIndex(int i) {
		 ((ArrayList<Pessoa>) agenda).get(i - 1).imprimeDados();
	}
}