package java8;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		// Comparator<String> comparador = new ComparadorPorTamanho();

		// Collections.sort(palavras, comparador);

//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length()) {
//				return -1;
//			} else if (s1.length() > s2.length()) {
//				return 1;
//			} else {
//				return 0;
//			}
//		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(p -> System.out.println(p));

	}

}