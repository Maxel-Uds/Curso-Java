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
	void aumentaOVolumeUmaUnidade() {
		try {
			tv.volumeMais(Controle.MAIS);
			assertEquals(21, tv.getVolume());
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void diminuiOVolumeUmaUnidade() {
		try {
			tv.volumeMais(Controle.MENOS);
			assertEquals(19, tv.getVolume());
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void aumentaOCanalUmaUnidade() {
		try {
			tv.canalMais(Controle.MAIS);
			assertEquals(13, tv.getCanalAtual());
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void diminuiOCanalUmaUnidade() {
		try {
			tv.canalMenos(Controle.MENOS);
			assertEquals(11, tv.getCanalAtual());
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void irParaCanal() {
		try {
			tv.irPara(59);
			assertEquals(59, tv.getCanalAtual());
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void naoPodePassarDeCem() {
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
	void naoPodePassarDeZero() {
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
