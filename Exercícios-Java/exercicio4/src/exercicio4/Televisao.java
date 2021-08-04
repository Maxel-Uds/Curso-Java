package exercicio4;

public class Televisao {
	
	private int volume;
	private int canalAtual;
	
	//Valores que geralmente começam por padrão quando se liga a TV
	public Televisao() {
		this.volume = 20;
		this.canalAtual = 12;
	}
	
	public void volumeMais(Controle c) throws Exception {
		if((volume + c.controlaTV()) <= 100) {
			volume += c.controlaTV();
		} else {
			throw new Exception("A TV já está no volume máximo!!");
		}
	}
	
	public void volumeMenos(Controle c) throws Exception {
		if((volume + c.controlaTV()) >= 0) {
			volume += c.controlaTV();
		} else {
			throw new Exception("A TV já está mutada!!");
		}
	}
	
	//Assumindo que a TV possui 59 canais
	public void canalMais(Controle c) {
		if((canalAtual + c.controlaTV()) <= 59) {
			canalAtual += c.controlaTV();
		} else {
			canalAtual = 1;
		}
	}
	
	public void canalMenos(Controle c) {
		if(canalAtual + c.controlaTV() >= 1) {
			canalAtual += c.controlaTV();
		} else {
			canalAtual = 59;
		}
	}
	
	public void irPara(int canal) {
		if(canal >= 1 && canal <= 59) {
			canalAtual = canal;
		}
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public int getCanalAtual() {
		return this.canalAtual;
	}
	
	@Override
	public String toString() {
		return "Canal atual: " + this.canalAtual + ", Volume: " + this.volume;
	}
	
}
