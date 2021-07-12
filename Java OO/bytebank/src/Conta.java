public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
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
	
}
