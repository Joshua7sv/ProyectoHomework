package com.creativa.dummy.data.generator;
//cambio numero 2
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
//cambio numero 4
public class DateDummyGenerator {
	public static Date generate(int anioInicio, int anioFin) {
		Date d = null;
		int anio;
		int mes;
		int dia;
		GregorianCalendar g = null;
		Random rand = new Random(System.currentTimeMillis());
		anio = rand.nextInt(anioFin) + anioInicio + 1;
		mes = rand.nextInt(12)+1;
		dia = rand.nextInt(28);
		g = new GregorianCalendar(anio, mes, dia);
		d = g.getTime();
		return d;
	}
}
