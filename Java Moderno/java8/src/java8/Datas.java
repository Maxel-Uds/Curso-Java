package java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate niver = LocalDate.of(2022, Month.APRIL, 10);
		Period periodo = Period.between(hoje, niver);
		//System.out.println(periodo.getMonths());

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = hoje.format(formatador);
		System.out.println(valorFormatado);
		
	}

}
