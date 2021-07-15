package exercicio2;
import java.util.ArrayList;
//import java.util.List;

public class Agenda {
	
	private ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
	
	public void armazenaPessoa(String nome, String data, int altura) {
		Pessoa p = new Pessoa(nome, data, altura);
		agenda.add(p);
	}
	
	public void removePessoa(String nome) {
		for(int i = 0; i < agenda.size(); i++) {
			if(agenda.get(i).getNome() == nome) {
				agenda.remove(i);
			}
		}
	}
	
	public void buscaPeloNome(String nome) {
		for(int i = 0; i < agenda.size(); i++) {
			if(agenda.get(i).getNome() == nome) {
				System.out.println(nome + " está na posição " + (i + 1));
			}
		}
	}
	
	public void imprimirAgenda() {
		for(Pessoa p : agenda) {
			p.imprimeDados();
		}
	}
	
	public void buscaPeloIndex(int i) {
		agenda.get(i - 1).imprimeDados();
	}
}
