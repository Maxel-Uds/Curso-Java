public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		
		total++;
		this.agencia = agencia;
		this.numero = numero;
		
	}
	
	public void deposita(double valor) {
		
		saldo += valor;
		
	}
	
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

	public Cliente getTitular() {
		
		return titular;
		
	}

	public void setTitular(Cliente titular) {
		
		this.titular = titular;
		
	}
	
}
