package testes;

import exercicio3.Elevador;

public class TesteElevador {

	public static void main(String[] args) throws Exception {

		Elevador elevador = new Elevador(10, 6);

		//elevador.Sai(1);
		//elevador.Desce(1);
		//elevador.Entra(7);
		elevador.entrarPessoa(5);
		elevador.subir(5);
		
		elevador.tirarPessoa(3);
		elevador.subir(5);
		
//		elevador.entrarPessoa(4);
//		elevador.descer(10);
		
//		elevador.tirarPessoa(6);
		System.out.println(elevador);
	}

}
