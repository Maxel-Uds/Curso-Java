package teste;

import java.text.ParseException;

import exercicio1.Pessoa;

public class TestaPessoa {
	public static void main(String[] args) throws ParseException {
		
		Pessoa p = new Pessoa("Jõao da Silva", "10/04/2000", 170);
		
		p.imprimeDados();

	}

}
