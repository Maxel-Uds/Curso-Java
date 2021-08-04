package br.com.alura.tdd.service;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario func;
	
	@BeforeEach
	public void inicializar() {
		this.service = new ReajusteService();
		this.func = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
	}

	@Test
	void reajusteDeveriaSerDe3PorCento() {
		service.concederReajuste(func, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), func.getSalario());
	}
	
	@Test
	void reajusteDeveriaSerDe15PorCento() {
		service.concederReajuste(func, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), func.getSalario());
	}
	
	@Test
	void reajusteDeveriaSerDe20PorCento() {	
		service.concederReajuste(func, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), func.getSalario());
	}

}
