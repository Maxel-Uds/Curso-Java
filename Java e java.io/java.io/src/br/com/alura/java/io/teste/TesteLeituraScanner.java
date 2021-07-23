package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws IOException {
		
		Scanner sr = new Scanner(new File("contas.csv"));
		
		while(sr.hasNext()) {
			System.out.println(sr.nextLine());
		}
		
		sr.close();
		
	}

}
