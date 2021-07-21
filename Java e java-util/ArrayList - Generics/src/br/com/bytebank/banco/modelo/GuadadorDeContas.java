package br.com.bytebank.banco.modelo;

public class GuadadorDeContas {

	private Conta[] referecias;
	private int posicao; 
	
	public GuadadorDeContas() {
		this.referecias = new Conta[10];
		this.posicao = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referecias[this.posicao] = ref;
		this.posicao++;
	}
	
	public int getQtdElementos() {
		return this.posicao;
	}
	
}
