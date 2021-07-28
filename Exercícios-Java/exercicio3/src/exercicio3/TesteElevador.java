package exercicio3;

public class TesteElevador {

	public static void main(String[] args) throws Exception {

		Elevador elevador = new Elevador(10, 6);

		//elevador.Sai(1);
		//elevador.Desce(1);
		//elevador.Entra(7);
		elevador.Entra(5);
		elevador.Sobe(5);
		
		elevador.Sai(3);
		elevador.Sobe(5);
		
		elevador.Entra(4);
		elevador.Desce(10);
		
		elevador.Sai(6);
		System.out.println(elevador);
	}

}
