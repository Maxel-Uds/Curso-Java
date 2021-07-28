package exercicio3;

public class Elevador {
	
	private int andarAtual;
	private int totalDeAndares;
	private int capacidade;
	private int lotacaoAtual;
	
	public Elevador(int totalDeAndares, int capacidade) {
		andarAtual = 0;
		lotacaoAtual = 0;
		this.totalDeAndares = totalDeAndares;
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getLotacaoAtual() {
		return lotacaoAtual;
	}

	public void setLotacaoAtual(int lotacaoAtual) {
		this.lotacaoAtual = lotacaoAtual;
	}
	
	public void Entra(int pessoa) throws Exception {
		if((lotacaoAtual + pessoa) <= capacidade) {
			lotacaoAtual += pessoa;
		} else {		
			throw new Exception("Elevador com sobrecarga");
		}
	}
	
	public void Sai(int pessoa) throws Exception {
		if((lotacaoAtual - pessoa) >= 0) {
			lotacaoAtual -= pessoa;
		} else {
			throw new Exception("O elevador está vazio");
		}
	}
	
	public void Sobe(int andar) throws Exception {
		if(andarAtual < totalDeAndares) {
			andarAtual += andar;
		} else {
			throw new Exception("Não é possível subir mais, este é o último andar!!");
		}
	}
	
	public void Desce(int andar) throws Exception {
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
