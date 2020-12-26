package com.example.controller;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Formatacao {
	
	
	public Date converter(String data) {
		
	    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//LocalDate localDate = LocalDate.parse(data, format);
		
		Date d = (Date) format.parse(data);
		/*PROBLEMA: O DATE DO HTML LANCA UM ARQUIVO LIDO PELO JAVA EM STRING
		 * POR ISSO CHOCA COM MEU TIPO DATE EM JAJA*/
		/*01 - pegar o meu coisa recebido;
		 * estabeleceber um format
		 * transforar um um date*/
		
		return d;
	}
	
	
	
}
