package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada com Arquivo	
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw = new FileWriter("lorem2.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Suspendisse eleifend, erat et tincidunt rutrum, metus velit accumsan magna, vel semper ex mauris ac felis.");
//		bw.write("\n");
//		bw.write(System.lineSeparator());
		bw.newLine();
		bw.write("Aenean tortor justo, faucibus non nunc sed, molestie tempus nunc.");
		
		bw.close();
		
	}

}
