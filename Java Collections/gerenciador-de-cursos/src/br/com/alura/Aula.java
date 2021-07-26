package br.com.alura;

public class Aula implements Comparable {

	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
		
	}

	@Override
	public int compareTo(Object a) {
		
		Aula aula = (Aula) a;
		return this.titulo.compareTo(aula.getTitulo());
		
	}
	
}
