package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do c�digo");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		//Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		System.out.println(palavras);

	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()) {
			return -1;
		} else if(s1.length() > s2.length()) {
			return 1;
		} else {
			return 0;
		}
	}
	
}