package services;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class PessoaService {
	
	public static LocalDate formatarData(CharSequence data) {
		return LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	
	public static int calculaIdade(LocalDate data) {
		return Period.between(data, LocalDate.now()).getYears();
	}
	
}
