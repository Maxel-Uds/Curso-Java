
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {

			System.out.println("Voc� � maior de idade");
			
		} else {
			
			if(quantidadePessoas >= 2) {
				
				System.out.println("Voc� � menor de idade, mas pode entrar acompamhado");
				
			} else {
				
				System.out.println("Voc� � menor de idade");
				
			}
			
		}

	}

}
