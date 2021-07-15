package exercicio1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Pessoa {
	
	private String nome;
	private int altura;
	private Date dataNascimento = new Date();
	private Date tempoAtual = new Date();
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	public Pessoa(String nome, String dataNascimento, int altura) {
		
		this.nome = nome;
		try {
			this.dataNascimento = formato.parse(dataNascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calculaIdade() {
		return tempoAtual.getYear() - dataNascimento.getYear();
	}
	
	public void imprimeDados() {
		
		System.out.println(this.nome + " tem " + this.altura + " centímetros de altura e tem " + calculaIdade() + " anos");
	}
}
