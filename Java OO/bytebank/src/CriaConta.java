public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(1000);
		
		Conta contaDoRapha = new Conta();
		contaDoRapha.deposita(500);
		
		contaDaAna.transfere(500, contaDoRapha);
		System.out.println("Saldo do Rapha: " + contaDoRapha.saldo);
		System.out.println("Saldo do Ana: " + contaDaAna.saldo);
		
	}
	
}
