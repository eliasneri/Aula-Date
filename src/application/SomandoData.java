package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SomandoData {

	public static void main(String[] args) {
		// MANIPULANDO DATAS
		
		System.out.println("Manipulando Datas");
		
		//Formatação da Data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Atribuição de Data
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		// Instanciando Lista
		List<String> lista = new ArrayList<>();
		lista.add("Hora Iniciada: " + d);
		
		System.out.println(sdf.format(d));
		
		//Instaciando um objeto com Calendario
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		System.out.println();
		
		for (int i=0; i<10; i++) {
			cal.add(Calendar.HOUR_OF_DAY, i+1);
			d = cal.getTime();
			lista.add("Hora Atualizada em: " + (i+1) + " Hora(s) = "+ sdf.format(d));
		}
		
		System.out.println(d);
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1+ cal.get(Calendar.MONTH);
		
		System.out.println(sdf.format(d));
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
		
		
	}

}
