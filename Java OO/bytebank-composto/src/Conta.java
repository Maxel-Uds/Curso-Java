public class Conta {
	
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
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
	
	public String pegaSaldo() {
		
		return "O saldo é igual a R$" + saldo;
		
	}
	
}
