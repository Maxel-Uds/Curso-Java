package br.com.alura.tdd;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class CalculadoraTestesJUnit {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int sum = calc.somar(3, 7);		
		
		Assert.assertEquals(10, sum);
	}

}
