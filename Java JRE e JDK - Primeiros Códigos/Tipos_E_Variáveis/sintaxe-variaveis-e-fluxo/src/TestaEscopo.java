public class TestaEscopo {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			
			acompanhado = true;
			
		} else {
			
			acompanhado = false;
			
		}

		if (idade >= 18 || acompanhado) {

			System.out.println("Bem vindo!!");
			
		} else {
							
				System.out.println("Voc� � menor de idade");
			
		}

	}

}
