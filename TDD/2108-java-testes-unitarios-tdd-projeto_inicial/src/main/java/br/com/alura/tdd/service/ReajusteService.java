package br.com.alura.tdd.service;

import java.math.BigDecimal;
import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario func, Desempenho desempenho) {
			BigDecimal reajuste = func.getSalario().multiply(desempenho.percentualReajuste());
			func.reajustarSalario(reajuste);
	}

}
