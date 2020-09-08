package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class aulaDate {

	public static void main(String[] args) throws ParseException {
	System.out.println("AulaDate!");
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	sdf2.setTimeZone(TimeZone.getTimeZone("GMT-3")); // CONVERTE DO UTC PARA O PADRÃO BRASIL GMT -3
	
	Date x1 = new Date(); // vai criar uma variavel data com a data e horário atual
	Date x2 = new Date(System.currentTimeMillis());
	
	Date y1 = sdf1.parse("25/06/2018");
	Date y2 = sdf2.parse("25/06/2018 15:15:15");
	Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //ESTA DATA ESTÁ EM PADRÃO UTC
	
	System.out.println(y1);
	System.out.println(y2);
	System.out.println();
	System.out.println("Y1: " + sdf2.format(y1));
	System.out.println("Y2: " + sdf2.format(y2));
	System.out.println();
	System.out.println("Data Atual: " + sdf1.format(x1));
	System.out.println("Data Atual: " + sdf2.format(x1));
	System.out.println();
	System.out.println("Milesegundos: " + sdf2.format(x2));
	System.out.println();
	System.out.println("Y3: " + sdf3.format(y3));
	
	}
	
	

}
