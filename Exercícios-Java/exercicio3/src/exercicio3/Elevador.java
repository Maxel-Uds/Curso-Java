package exercicio3;

public class Elevador {
	
	private int andarAtual;
	private int totalDeAndares;
	private int capacidade;
	private int lotacaoAtual;
	
	public Elevador(int totalDeAndares, int capacidade) {
		this.totalDeAndares = totalDeAndares;
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getLotacaoAtual() {
		return lotacaoAtual;
	}
	
	public void entrarPessoa(int pessoa) throws Exception {
		if((lotacaoAtual + pessoa) <= capacidade) {
			lotacaoAtual += pessoa;
		} else {		
			throw new Exception("Elevador com sobrecarga");
		}
	}
	
	public void tirarPessoa(int pessoa) throws Exception {
		if((lotacaoAtual - pessoa) >= 0) {
			lotacaoAtual -= pessoa;
		} else {
			throw new Exception("O elevador está vazio");
		}
	}
	
	public void subir(int andar) throws Exception {
		if(andarAtual < totalDeAndares) {
			andarAtual += andar;
		} else {
			throw new Exception("Não é possível subir mais, este é o último andar!!");
		}
	}
	
	public void descer(int andar) throws Exception {
		if((andarAtual - andar) >= 0) {
			andarAtual -= andar;
		} else {
			throw new Exception("Não é possível descer, você está no térreo!!");
		}
	}
	
	@Override
	public String toString() {
		return "Andar atual: " + this.andarAtual + "/" + this.totalDeAndares + ", lotação: " + this.lotacaoAtual + "/" + this.capacidade;
	}
	
}
