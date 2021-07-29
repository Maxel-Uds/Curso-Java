package exercicio5;

import java.util.ArrayList;

public class ControleHerdado extends Controle {

	private ArrayList<Caminhao> caminhao = new ArrayList<Caminhao>();
	private String tipo = "";
	private int qtdPluviometros;
	private ArrayList<String> pluviometros = new ArrayList<String>();
	
	public void cadastraCaminhao() {
		do {
			System.out.println("Tipo do caminhão (Beta/Alfa), ou digite Fim para terminar: ");
			tipo = leString();
			
			if(tipo.equals("Fim") || tipo.equals("fim")) {
				break;
			} else if(!tipo.equals("Alfa") && !tipo.equals("Beta")) {
				System.out.println("Erro: Tipo inválido! Tente Novamente.");
			}
			
		} while(!tipo.equals("Alfa") && !tipo.equals("Beta"));
		
		do {
			System.out.println("Quantidade de pluviometros a serem transportados: ");
			qtdPluviometros = leInt();
			
			if(qtdPluviometros <= 0) {
				System.out.println("Erro: A quantidade não pode ser 0 nem negativa!");
			}
		
		} while(qtdPluviometros <= 0);
		
		System.out.println("Tipos de pluviometros a serem transportados (digite os tipos separando com espaços): ");
		String[] tipos = leString().split(" ");
		for (String t : tipos) {
			pluviometros.add(t);
		}
		
		caminhao.add(new Caminhao(tipo, qtdPluviometros, pluviometros));
	}
}
