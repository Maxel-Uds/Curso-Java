package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamEWrite {

	public static void main(String[] args) throws IOException {

//		PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem.txt");
		
		ps.println("Suspendisse eleifend, erat et tincidunt rutrum, metus velit accumsan magna, vel semper ex mauris ac felis.");
		ps.println();
		ps.println("Aenean tortor justo, faucibus non nunc sed, molestie tempus nunc.");
		
		ps.close();

	}

}
