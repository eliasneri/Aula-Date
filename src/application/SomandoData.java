package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class SomandoData {

	public static void main(String[] args) {
		// MANIPULANDO DATAS
		
		System.out.println("Manipulando Datas");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
	}

}
