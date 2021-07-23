package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws IOException {
		
		Scanner sr = new Scanner(new File("contas.csv"));
		
		while(sr.hasNext()) {
			String linha = sr.nextLine();
			System.out.println(linha);
			
			Scanner lsr = new Scanner(linha);
			lsr.useLocale(Locale.US);
			lsr.useDelimiter(",");
			
			System.out.println(lsr.next() + lsr.nextInt());
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
		
		sr.close();
		
	}

}
