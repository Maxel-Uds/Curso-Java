package exercicio5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ControleHerdado extends Controle {

	private String tipo = "";
	private int qtdPluviometros;
	private static ArrayList<Caminhao> caminhao = new ArrayList<Caminhao>();
	
	private void validarCaminhao() {
		while(!tipo.equals("Alfa") && !tipo.equals("Beta") && !tipo.equals("fim") && !tipo.equals("Fim")) {
			System.out.println("Erro: Tipo de caminhão inválido! Tente Novamente.");
			System.out.println("Tipo do caminhão (Beta/Alfa), ou digite Fim para terminar:");
			tipo = leString();
		}
	}
	
	private void validarPluviometros(){
		while(qtdPluviometros <= 0) {
			System.out.println("Erro: A quantidade não pode ser 0 nem negativa!");
			System.out.println("Quantidade de pluviometros a serem transportados: ");
			qtdPluviometros = leInt();
		}
	}
	
	private Collection<String> adicionarTipoPluviometro() {
		String[] tipos = leString().split(" ");
		Collection<String> pluviometros = new ArrayList<String>();
		for (String t : tipos) {
			pluviometros.add(t);
		}
		return pluviometros;		
	}
	
	private static void melhorCaminhao() {
		Collections.sort((List<Caminhao>) caminhao);
		Collections.reverse(caminhao);
		System.out.println(caminhao.get(0));
	}
	
	public void cadastraCaminhao() {
		while(!tipo.equals("Fim") && !tipo.equals("fim")) {
			
			System.out.println("Tipo do caminhão (Beta/Alfa), ou digite Fim para terminar: ");
			tipo = leString();
			validarCaminhao();				
			
			if(tipo.equals("Fim") || tipo.equals("fim")) {
				break;
			}
			
			System.out.println("Quantidade de pluviometros a serem transportados: ");
			qtdPluviometros = leInt();
			validarPluviometros();
							
			System.out.println("Tipos de pluviometros a serem transportados (digite os tipos separando com espaços): ");
			
			caminhao.add(new Caminhao(tipo, qtdPluviometros, adicionarTipoPluviometro()));
			
		}
		
		if(caminhao.size() > 0) {
			melhorCaminhao();
		}
	}				
}
