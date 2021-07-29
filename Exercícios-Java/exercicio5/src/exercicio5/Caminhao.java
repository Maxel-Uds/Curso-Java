package exercicio5;

import java.util.ArrayList;

public class Caminhao {

	private String tipo;
	private int capacidade;
	ArrayList<String> tipoPluviometros = new ArrayList<String>();
	
	public Caminhao(String tipo, int capacidade, ArrayList<String> tipoPluviometros) {
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.tipoPluviometros = tipoPluviometros;
	}
	
}
