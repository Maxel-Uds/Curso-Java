package exercicio2;

import java.time.LocalDate;
import services.PessoaService;

public class Pessoa {
	
	private String nome;
	private int altura;
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, String dataNascimento, int altura) {		
		this.nome = nome;
		this.dataNascimento = PessoaService.formatarData(dataNascimento);
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public int getAltura() {
		return altura;
	}
		
	public void imprimeDados() {
		
		System.out.println(this.nome + " tem " + this.altura + " centímetros de altura e tem " + PessoaService.calculaIdade(getDataNascimento()) + " anos");
	}
}
