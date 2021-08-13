package exercicio5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ControleHerdado extends Controle {

	private String tipo = "";
	private int qtdPluviometros;
	private static ArrayList<Caminhao> caminhao = new ArrayList<Caminhao>();
	
	private void validarCaminhao(String text) throws Exception {
		if(!tipo.equals("Alfa") && !tipo.equals("Beta") && !tipo.equals("fim") && !tipo.equals("Fim")) {
			throw new Exception("Erro: Tipo de caminhão inválido! Tente Novamente.");
		}
	}
	
	private void validarPluviometros(int qtde) throws Exception {
		if(qtde <= 0) {
			throw new Exception("Erro: A quantidade não pode ser 0 nem negativa!");
		} else {
			qtdPluviometros = qtde;
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
	
	public void cadastraCaminhao() throws Exception {
		while(!tipo.equals("Fim") && !tipo.equals("fim")) {
			
			System.out.println("Tipo do caminhão (Beta/Alfa), ou digite Fim para terminar: ");
			tipo = leString();
			validarCaminhao(tipo);				
			
			if(tipo.equals("Fim") || tipo.equals("fim")) {
				break;
			}
			
			System.out.println("Quantidade de pluviometros a serem transportados: ");
			validarPluviometros(leInt());
							
			System.out.println("Tipos de pluviometros a serem transportados (digite os tipos separando com espaços): ");
			
			caminhao.add(new Caminhao(tipo, qtdPluviometros, adicionarTipoPluviometro()));
			
		}
	}
		
	public static void melhorCaminhao() {
		Collections.sort((List<Caminhao>) caminhao);
		Collections.reverse(caminhao);
		System.out.println(caminhao.get(0));
	}
	
}
