package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import exercicio4.Controle;
import exercicio4.Televisao;

class TesteTelevisao {

	Televisao tv;
	
	@BeforeEach
	public void inicializa() {
		tv = new Televisao();
	}
	
	@Test
	void quandoAumentaOVolumeUmaUnidadeRetornaSucesso() {
		try {
			tv.volumeMais(Controle.MAIS);
			assertEquals(21, tv.getVolume());
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void quandoDiminuiOVolumeUmaUnidadeRetornaSucesso() {
		try {
			tv.volumeMais(Controle.MENOS);
			assertEquals(19, tv.getVolume());
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void quandoAumentaOCanalUmaUnidadeRetornaSucesso() {
		try {
			tv.canalMais(Controle.MAIS);
			assertEquals(13, tv.getCanalAtual());
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void quandoDiminuiOCanalUmaUnidadeRetornaSucesso() {
		try {
			tv.canalMenos(Controle.MENOS);
			assertEquals(11, tv.getCanalAtual());
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void quandoDigitarOCanalIndicadoVaiParaCanalERetornaSucesso() {
		try {
			tv.irPara(59);
			assertEquals(59, tv.getCanalAtual());
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void seOVolumePassarDeCemRetornaUmaExcecao() {
		try {
			for(int i = tv.getVolume(); i <=101; i++) {
				tv.volumeMais(Controle.MAIS);
			}
			fail();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void seOVolumePassarDeZeroRetornaUmaExcecao() {
		try {
			for(int i = tv.getVolume(); i >= -1; i--) {
				tv.volumeMenos(Controle.MENOS);
			}
			fail();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
