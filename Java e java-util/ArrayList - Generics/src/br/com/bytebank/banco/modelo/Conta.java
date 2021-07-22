package br.com.bytebank.banco.modelo;

public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private static int total;
	
	public Conta(int agencia, int numero) {
		
		total++;
		this.agencia = agencia;
		this.numero = numero;
		
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		
		if(saldo >= valor) {
			
			saldo -= valor;
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public boolean transfere(double valor, Conta conta) {
		
		if(saldo >= valor) {
			
			this.saca(valor);
			conta.deposita(valor);
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public String getSaldo() {
		
		return "O saldo é igual a R$" + saldo;
		
	}
	
	public int getNumber() {
		
		return numero;
		
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
		
	}
	
	public int getAgencia() {
		
		return agencia;
		
	}
	
	public void setAgencia(int agencia) {
		
		this.agencia = agencia;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta c = (Conta)obj;
		
		if(c.agencia == this.agencia && c.numero == this.numero) {
			return true;
		} else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero + ", Saldo: " + this.saldo;
	}

	
}
