package com.parameta.rest.utilities;

import java.util.Calendar;
import java.util.Date;

public class Utilities {

	public String calcularTiempo(Date fecha1) {
		Calendar fecha2 = toCalendar(fecha1);
		Calendar today = Calendar.getInstance();
		int diffYear = today.get(Calendar.YEAR) - fecha2.get(Calendar.YEAR);
		int diffMonth = today.get(Calendar.MONTH) - fecha2.get(Calendar.MONTH);
		int diffDay = today.get(Calendar.DAY_OF_MONTH) - fecha2.get(Calendar.DAY_OF_MONTH);

		if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
			diffYear = diffYear - 1;
		}
		return diffYear + " Años " + diffMonth + " Meses " + diffDay + " Dias";
	}

	public int calcularEdad(Date fechNac) {
		Calendar fecha2 = toCalendar(fechNac);
		Calendar today = Calendar.getInstance();
		int diffYear = today.get(Calendar.YEAR) - fecha2.get(Calendar.YEAR);
		int diffMonth = today.get(Calendar.MONTH) - fecha2.get(Calendar.MONTH);
		int diffDay = today.get(Calendar.DAY_OF_MONTH) - fecha2.get(Calendar.DAY_OF_MONTH);

		if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
			diffYear = diffYear - 1;
		}
		return diffYear;
	}

	public Calendar toCalendar(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}
}
