package exercicio5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ControleHerdado extends Controle {

	private String tipo = "";
	private int qtdPluviometros;
	private static ArrayList<Caminhao> caminhao = new ArrayList<Caminhao>();
	
	public void cadastraCaminhao() {
		while(!tipo.equals("Fim") && !tipo.equals("fim")) {
			do {
				System.out.println("Tipo do caminhão (Beta/Alfa), ou digite Fim para terminar: ");
				tipo = leString();
				
				if(tipo.equals("Fim") || tipo.equals("fim")) {
					break;
				} else if(!tipo.equals("Alfa") && !tipo.equals("Beta")) {
					System.out.println("Erro: Tipo inválido! Tente Novamente.");
				}
				
			} while(!tipo.equals("Alfa") && !tipo.equals("Beta"));
			
			if(tipo.equals("Fim") || tipo.equals("fim")) {
				break;
			}
			
			do {
				System.out.println("Quantidade de pluviometros a serem transportados: ");
				qtdPluviometros = leInt();
				
				if(qtdPluviometros <= 0) {
					System.out.println("Erro: A quantidade não pode ser 0 nem negativa!");
				}
			
			} while(qtdPluviometros <= 0);
			
			System.out.println("Tipos de pluviometros a serem transportados (digite os tipos separando com espaços): ");
			String[] tipos = leString().split(" ");
			Collection<String> pluviometros = new ArrayList<String>();
			for (String t : tipos) {
				pluviometros.add(t);
			}
			
			caminhao.add(new Caminhao(tipo, qtdPluviometros, pluviometros));
		}
	}
		
	public static void melhorCaminhao() {
		Collections.sort((List<Caminhao>) caminhao);
		Collections.reverse(caminhao);
		System.out.println(caminhao.get(0));
	}
	
}
