package exercicio4;

public class Televisao {
	
	private int volume;
	private int canalAtual;
	
	//Valores que geralmente começam por padrão quando se liga a TV
	public Televisao() {
		this.volume = 20;
		this.canalAtual = 12;
	}
	
	public void volumeMais(int aumentar) throws Exception {
		if((volume + (aumentar/aumentar)) <= 100) {
			volume += (aumentar/aumentar);
		} else {
			throw new Exception("A TV já está no volume máximo!!");
		}
	}
	
	public void volumeMenos(int diminuir) throws Exception {
		if((volume - (diminuir/diminuir)) >= 0) {
			volume -= (diminuir/diminuir);
		} else {
			throw new Exception("A TV já está mutada!!");
		}
	}
	
	//Assumindo que a TV possui 59 canais
	public void canalMais(int sobeCanal) {
		if((canalAtual + (sobeCanal/sobeCanal)) <= 59) {
			canalAtual += (sobeCanal/sobeCanal);
		} else {
			canalAtual = 1;
		}
	}
	
	public void canalMenos(int desceCanal) {
		if(canalAtual - (desceCanal/desceCanal) >= 1) {
			canalAtual -= (desceCanal/desceCanal);
		} else {
			canalAtual = 59;
		}
	}
	
	public void irPara(int canal) {
		if(canal >= 1 && canal <= 59) {
			canalAtual = canal;
		}
	}
	
	@Override
	public String toString() {
		return "Canal atual: " + this.canalAtual + ", Volume: " + this.volume;
	}
	
}
