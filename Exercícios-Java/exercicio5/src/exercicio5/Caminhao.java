package exercicio5;

import java.util.ArrayList;
import java.util.Collection;

public class Caminhao implements Comparable<Caminhao>{

	private String tipo;
	private int capacidade;
	Collection<String> tipoPluviometros = new ArrayList<String>();
	
	public Caminhao(String tipo, int capacidade, Collection<String> tipoPluviometros) {
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.tipoPluviometros = tipoPluviometros;
	}

	@Override
	public int compareTo(Caminhao caminhao) {
		return this.capacidade - caminhao.capacidade;
	}
	
	@Override
	public String toString() {
		StringBuilder text = new StringBuilder();
		text.append("-----------------------\n");
		text.append("Tipo do caminhão selecionado: " + this.tipo + "\n");
		text.append("Tipos de pluviômetros que ele carregará: \n");
		tipoPluviometros.forEach(plu -> text.append(plu + "\n"));
		
		return text.toString();
	}
}
