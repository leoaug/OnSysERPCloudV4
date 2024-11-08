package br.com.onsys.util;



import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;




public class DataUtil {
	
	
	public static Date converteDateGSTI(Object valueDate) throws Exception{
		Date data = null;
		try {
			
			if(valueDate != null){
			
				DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
				
				return formatter.parse(valueDate.toString());
			}
		} catch (Exception e) {
			throw e;
		}
		return data;
		
	}
	
	public static Date getRandomDate(Date base) {
        Calendar date = Calendar.getInstance();
        date.setTime(base);
        date.add(Calendar.DATE, ((int) (Math.random()*30)) + 1);    //set random day of month
         
        return date.getTime();
    }
	
	public static String converteData(java.util.Date dtData) {
		SimpleDateFormat formatBra = new SimpleDateFormat("dd/MM/yyyy");
		try {
			String aux = formatBra.format(dtData);
			java.util.Date newData = formatBra.parse(aux);
			return formatBra.format(newData);
		} catch (Exception Ex) {
			return "Erro na convers�o da data";
		}
	}

	public static String converteHora(java.util.Date dtData) {
		SimpleDateFormat formatBra = new SimpleDateFormat("HH:mm");
		try {
			String aux = formatBra.format(dtData);
			java.util.Date newData = formatBra.parse(aux);
			return formatBra.format(newData);
		} catch (Exception Ex) {
			return "Erro na conversao da data";
		}
	}
	
	public static Date stringToDate(String dataString, String formato)
			throws Exception {
		Date dataR = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(formato);
			dataR = sdf.parse(dataString);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return dataR;
	}

	public static boolean comparaDatasInicialMaiorFinal(Date dataInicial,
			Date dataFinal) {
		if (dataFinal.after(dataInicial) == true) {
			return false;
		} else if (dataFinal.equals(dataInicial)) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean isHora(String hora) {

		// String regex = "/(0[0-9]|1[0-9]|2[0123]):[0-5][0-9]/";
		String regex2 = "^([0-1][0-9]|[2][0-3]):([0-5][0-9])$";

		if (hora.matches(regex2)) {
			return true;
		} else {
			return false;
		}

	}

	public static String getDiasDaSemanaDescritivo(Date data) {

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(data);

		return new DateFormatSymbols().getWeekdays()[calendar
				.get(Calendar.DAY_OF_WEEK)];
	}

	/**
	 * Retorna a data passada como argumento com a ultima hora do dia.
	 * 
	 * @param dataInicial
	 * @return Date
	 */
	public static Date getUltimaHoraDia(Date dataInicial) {
		Calendar dataFim = Calendar.getInstance();
		dataFim.setTime(dataInicial);
		dataFim.set(Calendar.HOUR, 23);
		dataFim.set(Calendar.MINUTE, 59);
		dataFim.set(Calendar.SECOND, 59);
		return dataFim.getTime();
	}

	/**
	 * Retorna a data passada como argumento com a primeira hora do dia.
	 * 
	 * @param dataInicial
	 * @return Date
	 */
	public static Date getPrimeiraHoraDia(Date dataInicial) {
		Calendar dataInicio = Calendar.getInstance();
		dataInicio.setTime(dataInicial);
		dataInicio.set(Calendar.HOUR, 0);
		dataInicio.set(Calendar.MINUTE, 0);
		dataInicio.set(Calendar.SECOND, 0);
		dataInicio.set(Calendar.AM_PM, Calendar.AM);
		return dataInicio.getTime();
	}

	public static int getDataNumeracaoAlternada(Date dataInicio, Date dataFim) {

		long dt = (dataFim.getTime() - dataInicio.getTime()) + 3600000; // 1
																		// hora
																		// para
																		// compensar
																		// hor�rio
																		// de
																		// ver�o

		long dtFormatado = dt / 86400000L;

		return (int) (dtFormatado % 2);

	}

	public static List<String> getDiasDaSemanaDoMes(Date data) throws Exception {
		List<String> diasDaSemanaList = new ArrayList<String>();
		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = cal.get(Calendar.DAY_OF_WEEK); //
			// Calendar.SUNDAY ... Calendar.SATURDAY
			// Qual � o �ltimo dia deste m�s?
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// int pos = diaPrimeiro - Calendar.SUNDAY;
			// -- Pondo os dias de 1 a ultimoDia

			String mes = getMesPorDate(data);
			String ano = getAnoPorDateString(data);

			for (int diaDoMes = 1; diaDoMes <= ultimoDia; ++diaDoMes /* ,++pos */) {
				String dataString = Integer.toString(diaDoMes) + "/" + mes
						+ "/" + ano;

				if (dataString.length() == 9) {
					dataString = "0" + dataString;
				}

				diasDaSemanaList.add(getDiasDaSemanaDescritivo(stringToDate(
						dataString, "dd/MM/yyyy")) + " - " + dataString);
			}

		} catch (Exception e) {
			throw e;
		}

		return diasDaSemanaList;
	}

	public static List<String> getDiasDaSemanaDoMes2(Date data)
			throws Exception {
		List<String> diasDaSemanaList = new ArrayList<String>();
		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = cal.get(Calendar.DAY_OF_WEEK); //
			// Calendar.SUNDAY ... Calendar.SATURDAY
			// Qual � o �ltimo dia deste m�s?
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// int pos = diaPrimeiro - Calendar.SUNDAY;
			// -- Pondo os dias de 1 a ultimoDia

			String mes = getMesPorDate(data);
			String ano = getAnoPorDateString(data);

			for (int diaDoMes = 1; diaDoMes <= ultimoDia; ++diaDoMes /* , ++pos */) {
				String dataString = Integer.toString(diaDoMes) + "/" + mes
						+ "/" + ano;

				if (dataString.length() == 9) {
					dataString = "0" + dataString;
				}

				diasDaSemanaList.add(dataString);
			}

		} catch (Exception e) {
			throw e;
		}

		return diasDaSemanaList;
	}

	public static String getDiaDaSemanaDoMes(Date data) throws Exception {
		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = cal.get(Calendar.DAY_OF_WEEK); //
			// Calendar.SUNDAY ... Calendar.SATURDAY
			// Qual � o �ltimo dia deste m�s?
			// int ultimoDia = cal.getActualMaximum (Calendar.DAY_OF_MONTH);
			// int pos = diaPrimeiro - Calendar.SUNDAY;
			// -- Pondo os dias de 1 a ultimoDia

			String mes = getMesPorDate(data);
			String ano = getAnoPorDateString(data);

			// for (int diaDoMes = 1; diaDoMes <= ultimoDia; ++diaDoMes, ++pos)
			// {
			String dataString = Integer.toString(1) + "/" + mes + "/" + ano;

			if (dataString.length() == 9) {
				dataString = "0" + dataString;
			}

			return getDiasDaSemanaDescritivo(stringToDate(dataString,
					"dd/MM/yyyy"));
			// }

		} catch (Exception e) {
			throw e;
		}

	}

	public static List<String> getDiasDaSemanaDoMes() throws Exception {

		List<String> diasDaSemanaList = new ArrayList<String>();
		try {

			Date dataHoje = new Date();

			Calendar cal = Calendar.getInstance();
			cal.setTime(dataHoje);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = cal.get(Calendar.DAY_OF_WEEK); //
			// Calendar.SUNDAY ... Calendar.SATURDAY
			// Qual � o �ltimo dia deste m�s?
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// int pos = diaPrimeiro - Calendar.SUNDAY;
			// -- Pondo os dias de 1 a ultimoDia

			String mes = getMesPorDate(dataHoje);
			String ano = getAnoPorDateString(dataHoje);

			for (int diaDoMes = 1; diaDoMes <= ultimoDia; ++diaDoMes /* , ++pos */) {
				String dataString = Integer.toString(diaDoMes) + "/" + mes
						+ "/" + ano;

				if (dataString.length() == 9) {
					dataString = "0" + dataString;
				}

				diasDaSemanaList.add(getDiasDaSemanaDescritivo(stringToDate(
						dataString, "dd/MM/yyyy")) + " - " + dataString);
			}

		} catch (Exception e) {
			throw e;
		}

		return diasDaSemanaList;
	}

	public static Integer getTotalDiasDaSemanaDoMes(Date data) throws Exception {

		int i = 0;

		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = cal.get(Calendar.DAY_OF_WEEK); //
			// Calendar.SUNDAY ... Calendar.SATURDAY
			// Qual � o �ltimo dia deste m�s?
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// int pos = diaPrimeiro - Calendar.SUNDAY;
			// -- Pondo os dias de 1 a ultimoDia

			// String mes = getMesPorDate(data);
			// String ano = getAnoPorDateString(data);

			for (int diaDoMes = 1; diaDoMes <= ultimoDia; ++diaDoMes /* , ++pos */) {
				i++;
			}

		} catch (Exception e) {
			throw e;
		}

		return i;
	}

	public static String getDiaDaSemanaDoMes() throws Exception {

		String dataString = "";
		try {

			Date dataHoje = new Date();

			Calendar cal = Calendar.getInstance();
			cal.setTime(dataHoje);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = cal.get(Calendar.DAY_OF_WEEK); //
			// Calendar.SUNDAY ... Calendar.SATURDAY
			// Qual � o �ltimo dia deste m�s?
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// int pos = diaPrimeiro - Calendar.SUNDAY;
			// -- Pondo os dias de 1 a ultimoDia

			String mes = getMesPorDate(dataHoje);
			String ano = getAnoPorDateString(dataHoje);

			diasDoMesLoop: for (int diaDoMes = 1; diaDoMes <= ultimoDia; ++diaDoMes /*
																					 * ,
																					 * ++
																					 * pos
																					 */) {
				dataString = Integer.toString(diaDoMes) + "/" + mes + "/" + ano;

				if (dataString.length() == 9) {
					dataString = "0" + dataString;
				}

				if (dataString.equals(dateToString(dataHoje, "dd/MM/yyyy"))) {
					break diasDoMesLoop;
				}
			}

		} catch (Exception e) {
			throw e;
		}

		return getDiasDaSemanaDescritivo(stringToDate(dataString, "dd/MM/yyyy"))
				+ " - " + dataString;
	}

	public static List<String> getDiasPorMes(Date data) throws Exception {

		List<String> diasDaSemanaList = new ArrayList<String>();
		try {

			// Date dataHoje = new Date();

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = cal.get(Calendar.DAY_OF_WEEK); //
			// Calendar.SUNDAY ... Calendar.SATURDAY
			// Qual � o �ltimo dia deste m�s?
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// int pos = diaPrimeiro - Calendar.SUNDAY; // a partir de que
			// JLabel lblDatas vamos contar de 1 a ultimoDia
			// -- Pondo os dias de 1 a ultimoDia

			// String mes = getMesPorDate(data);

			for (int diaDoMes = 1; diaDoMes <= ultimoDia; ++diaDoMes) {
				diasDaSemanaList.add(Integer.toString(diaDoMes));
			}

		} catch (Exception e) {
			throw e;
		}

		return diasDaSemanaList;
	}
	
	
	public static int getNumberofSundays(Date dataInicio, Date dataFim, int diaDaSemana) throws Exception { // object
		

		Calendar c1 = Calendar.getInstance();
		c1.setTime(dataInicio);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(dataFim);
		int sundays = 0;
		while (c2.after(c1)) {
			// System.out.println(" came here ");
			//checks to see if the day1 ....so on next days are sundays if sunday goes inside to increment the counter
			if (c1.get(Calendar.DAY_OF_WEEK) == diaDaSemana) {
				System.out.println(c1.getTime().toString() + " is a sunday ");
				sundays++;

			}
			c1.add(Calendar.DATE, 1);
		}

		System.out.println("number of sundays between 2 dates is " + sundays);

		return sundays;
	}
	

	public static List<String> getDiasMesesAnoDoMes() throws Exception {

		List<String> diasDaSemanaList = new ArrayList<String>();
		try {

			Date dataHoje = new Date();

			Calendar cal = Calendar.getInstance();
			cal.setTime(dataHoje);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = cal.get(Calendar.DAY_OF_WEEK); //
			// Calendar.SUNDAY ... Calendar.SATURDAY
			// Qual � o �ltimo dia deste m�s?
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// int pos = diaPrimeiro - Calendar.SUNDAY; // a partir de que
			// JLabel lblDatas vamos contar de 1 a ultimoDia
			// -- Pondo os dias de 1 a ultimoDia

			String mes = getMesPorDate(dataHoje);
			String ano = getAnoPorDateString(dataHoje);

			for (int diaDoMes = 1; diaDoMes <= ultimoDia; ++diaDoMes /* , ++pos */) {
				String dataString = Integer.toString(diaDoMes) + "/" + mes
						+ "/" + ano;

				diasDaSemanaList.add(dataString);
			}

		} catch (Exception e) {
			throw e;
		}

		return diasDaSemanaList;
	}

	public static Date getDataInicioDodia() throws Exception {
		try {
			String dataInicioDoDIaString = DataUtil.dateToString(new Date(),
					"dd/MM/yyyy HH:mm:ss").substring(0, 10)
					+ " 00:00:00";
			return DataUtil.stringToDate(dataInicioDoDIaString,
					"dd/MM/yyyy HH:mm:ss");
		} catch (Exception e) {
			throw e;
		}
	}

	public static Date getDataInicioDoMes(Date data) throws Exception {

		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = 1;
			String mes = getMesPorDate(data);
			String ano = getAnoPorDateString(data);

			return DataUtil.stringToDate("01" + "/" + mes + "/" + ano,
					"dd/MM/yyyy");

		} catch (Exception e) {
			throw e;
		}
	}

	public static Date getDataFimDoMes(Date data) throws Exception {

		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			String mes = getMesPorDate(data);
			String ano = getAnoPorDateString(data);

			return DataUtil.stringToDate(Integer.toString(ultimoDia) + "/"
					+ mes + "/" + ano, "dd/MM/yyyy");

		} catch (Exception e) {
			throw e;
		}
	}

	public static Date getDataInicioDoMesHora(Date data) throws Exception {

		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH - 1, 1);
			// int diaPrimeiro = 1;
			String mes = getMesPorDate(data);
			String ano = getAnoPorDateString(data);

			return DataUtil.stringToDate("01" + "/" + mes + "/" + ano + " "
					+ "00:00:00", "dd/MM/yyyy HH:mm:ss");

		} catch (Exception e) {
			throw e;
		}
	}

	public static Date getDataFimDoMesHora(Date data) throws Exception {

		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH - 1, 1);
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			String mes = getMesPorDate(data);
			String ano = getAnoPorDateString(data);

			return DataUtil
					.stringToDate(Integer.toString(ultimoDia) + "/" + mes + "/"
							+ ano + " " + "23:59:59", "dd/MM/yyyy HH:mm:ss");

		} catch (Exception e) {
			throw e;
		}
	}

	public static Date getDataInicioDodia(Date data) throws Exception {
		try {
			String dataInicioDoDIaString = DataUtil.dateToString(data,
					"dd/MM/yyyy HH:mm:ss").substring(0, 10)
					+ " 00:00:00";
			return DataUtil.stringToDate(dataInicioDoDIaString,
					"dd/MM/yyyy HH:mm:ss");
		} catch (Exception e) {
			throw e;
		}
	}

	public static Date getDataInicioDoAno(Date data) throws Exception {
		try {

			return DataUtil.stringToDate("01/01/"
					+ DataUtil.getAnoPorDate(data).toString() + " 00:00:00",
					"dd/MM/yyyy HH:mm:ss");

		} catch (Exception e) {
			throw e;
		}
	}

	public static Date getDataFimDoAno(Date data) throws Exception {
		try {

			return DataUtil.stringToDate("31/12/"
					+ DataUtil.getAnoPorDate(data).toString() + " 23:59:59",
					"dd/MM/yyyy HH:mm:ss");

		} catch (Exception e) {
			throw e;
		}
	}

	public static Date getDataFimDodia() throws Exception {
		try {
			String dataInicioDoDIaString = DataUtil.dateToString(new Date(),
					"dd/MM/yyyy HH:mm:ss").substring(0, 10)
					+ " 23:59:59";
			return DataUtil.stringToDate(dataInicioDoDIaString,
					"dd/MM/yyyy HH:mm:ss");
		} catch (Exception e) {
			throw e;
		}
	}

	public static Date getDataFimDodia(Date data) throws Exception {
		try {
			String dataInicioDoDIaString = DataUtil.dateToString(data,
					"dd/MM/yyyy HH:mm:ss").substring(0, 10)
					+ " 23:59:59";
			return DataUtil.stringToDate(dataInicioDoDIaString,
					"dd/MM/yyyy HH:mm:ss");
		} catch (Exception e) {
			throw e;
		}
	}

	public static Date stringToDate(String dataString, String formatoOrigem,
			String formatoDestino) throws Exception {
		Date dataR = null;
		try {
			SimpleDateFormat sdfOrigem = new SimpleDateFormat(formatoOrigem);
			dataR = sdfOrigem.parse(dataString);

			SimpleDateFormat sdfDestino = new SimpleDateFormat(formatoDestino);
			dataString = sdfDestino.format(dataR);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataR;
	}

	public static Date acrescendarDataEmDias(Date dataInserida, int numeroDeDias) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.DAY_OF_MONTH, numeroDeDias);

		return calendar.getTime();
	}

	public static Date acrescendarDataEmHoras(Date dataInserida,
			int numeroDeHoras) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.HOUR_OF_DAY, numeroDeHoras);

		return calendar.getTime();
	}

	public static Date acrescendarDataEmMinutos(Date dataInserida,
			int numeroDeMinutos) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.MINUTE, numeroDeMinutos);

		return calendar.getTime();
	}
	
	public static Date acrescendarDataEmSegundos(Date dataInserida,
			int numeroDeSegundos) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.SECOND, numeroDeSegundos);

		return calendar.getTime();
	}
	
	public static Date retirarDataEmMinutos(Date dataInserida,
			int numeroDeHoras) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.MINUTE, -numeroDeHoras);

		return calendar.getTime();
	}
	
	public static Date acrescendarDataEmMeses(Date dataInserida,
			int numeroDeAnos) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.MONTH, numeroDeAnos);

		return calendar.getTime();
	}

	public static Date retirarDataEmMeses(Date dataInserida, int numeroDeDias) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.MONTH, -numeroDeDias);

		return calendar.getTime();
	}

	public static Date acrescendarDataEmAno(Date dataInserida, int numeroDeAnos) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.YEAR, numeroDeAnos);

		return calendar.getTime();
	}

	public static Date retirarDataEmAnos(Date dataInserida, int numeroDeDias) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.YEAR, -numeroDeDias);

		return calendar.getTime();
	}

	public static Date retirarDataEmDias(Date dataInserida, int numeroDeDias) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.DAY_OF_MONTH, -numeroDeDias);

		return calendar.getTime();
	}

	public static Date retirarDataEmHoras(Date dataInserida, int numeroDeDias) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.HOUR_OF_DAY, -numeroDeDias);

		return calendar.getTime();
	}

	public static Date subtrairHoras(Date dataInicial, Date dataFinal) {
		GregorianCalendar gc = new GregorianCalendar();

		// HORA INFORMADA Pelo usu�rio 02:10:01
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		int anoDaData = getAnoPorDate(dataInicial);
		int dia = getDiaPorDate(dataInicial);
		int mesDaData = Integer.parseInt(getMesPorDate(dataInicial));

		switch (mesDaData) {
		case 1:
			mesDaData = Calendar.JANUARY;
			break;
		case 2:
			mesDaData = Calendar.FEBRUARY;
			break;
		case 3:
			mesDaData = Calendar.MARCH;
			break;
		case 4:
			mesDaData = Calendar.APRIL;
			break;
		case 5:
			mesDaData = Calendar.MAY;
			break;
		case 6:
			mesDaData = Calendar.JUNE;
			break;
		case 7:
			mesDaData = Calendar.JULY;
			break;
		case 8:
			mesDaData = Calendar.AUGUST;
			break;
		case 9:
			mesDaData = Calendar.SEPTEMBER;
			break;
		case 10:
			mesDaData = Calendar.OCTOBER;
			break;
		case 11:
			mesDaData = Calendar.NOVEMBER;
			break;
		case 12:
			mesDaData = Calendar.DECEMBER;
			break;
		default:
			break;
		}

		String horaMinSeg = getHoraMinSegPorDate(dataInicial);

		int hora = Integer.parseInt(horaMinSeg.substring(0,
				horaMinSeg.indexOf(":")));
		int min = Integer.parseInt(horaMinSeg.substring(
				horaMinSeg.indexOf(":") + 1, horaMinSeg.lastIndexOf(":")));
		int seg = Integer.parseInt(horaMinSeg.substring(
				horaMinSeg.lastIndexOf(":") + 1, horaMinSeg.length()));

		// int ano, mes, dia, hora, minutos e segundos
		gc.set(anoDaData, mesDaData, dia, hora, min, seg);

		String horaMinSegFinal = getHoraMinSegPorDate(dataFinal);
		int horaFinal = Integer.parseInt(horaMinSegFinal.substring(0,
				horaMinSegFinal.indexOf(":")));
		int minFinal = Integer.parseInt(horaMinSegFinal.substring(
				horaMinSegFinal.indexOf(":") + 1,
				horaMinSegFinal.lastIndexOf(":")));
		int segFinal = Integer
				.parseInt(horaMinSegFinal.substring(
						horaMinSegFinal.lastIndexOf(":") + 1,
						horaMinSegFinal.length()));
		// HORA PARA SOMAR 00:10:10
		gc.add(Calendar.HOUR, -horaFinal);
		gc.add(Calendar.MINUTE, -minFinal);
		gc.add(Calendar.SECOND, -segFinal);

		System.out.println("HORA SOMADA: " + sdf.format(gc.getTime()));
		return dataFinal;
	}

	public static int getTotalDataEmSegundos(Date dataInicial, Date dataFinal) {

		// HORA INFORMADA Pelo usu�rio 02:10:01
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//DateTime initialTime = new DateTime(dataInicial.getTime());

		/*
		 * int anoDaData = getAnoPorDate(dataInicial); int dia =
		 * getDiaPorDate(dataInicial);
		 */
		int mesDaData = Integer.parseInt(getMesPorDate(dataInicial));

		switch (mesDaData) {
		case 1:
			mesDaData = Calendar.JANUARY;
			break;
		case 2:
			mesDaData = Calendar.FEBRUARY;
			break;
		case 3:
			mesDaData = Calendar.MARCH;
			break;
		case 4:
			mesDaData = Calendar.APRIL;
			break;
		case 5:
			mesDaData = Calendar.MAY;
			break;
		case 6:
			mesDaData = Calendar.JUNE;
			break;
		case 7:
			mesDaData = Calendar.JULY;
			break;
		case 8:
			mesDaData = Calendar.AUGUST;
			break;
		case 9:
			mesDaData = Calendar.SEPTEMBER;
			break;
		case 10:
			mesDaData = Calendar.OCTOBER;
			break;
		case 11:
			mesDaData = Calendar.NOVEMBER;
			break;
		case 12:
			mesDaData = Calendar.DECEMBER;
			break;
		default:
			break;
		}

		String horaMinSeg = getHoraMinSegPorDate(dataInicial);

		int hora = Integer.parseInt(horaMinSeg.substring(0,
				horaMinSeg.indexOf(":")));
		int min = Integer.parseInt(horaMinSeg.substring(
				horaMinSeg.indexOf(":") + 1, horaMinSeg.lastIndexOf(":")));
		int seg = Integer.parseInt(horaMinSeg.substring(
				horaMinSeg.lastIndexOf(":") + 1, horaMinSeg.length()));

		Calendar c = Calendar.getInstance();
		c.add(Calendar.HOUR, hora);
		c.add(Calendar.MINUTE, min);
		c.add(Calendar.SECOND, seg);

		//DateTime finalTime = new DateTime(dataFinal);
		// TODO murillo.marinho
		// Hours horaFinal = Hours.hoursBetween(initialTime, finalTime);
		// Minutes minFinal = Minutes.minutesBetween(initialTime, finalTime);
		// Seconds segFinal = Seconds.secondsBetween(initialTime, finalTime);
		//
		// System.out.println("Hours: " + horaFinal.getHours());
		// System.out.println("Minutos: " + minFinal.getMinutes());
		// System.out.println("Segundos: " + segFinal.getSeconds());
		//
		// Period period = new Period(initialTime, finalTime);
		// System.out.println("Periodo: " + period.getHours());

		// return segFinal.getSeconds();

		return 0;

	}

	public static int getTotalDataEmMinutos(Date dataInicial, Date dataFinal) {

		// HORA INFORMADA Pelo usu�rio 02:10:01
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//DateTime initialTime = new DateTime(dataInicial.getTime());

		/*
		 * int anoDaData = getAnoPorDate(dataInicial); int dia =
		 * getDiaPorDate(dataInicial);
		 */
		int mesDaData = Integer.parseInt(getMesPorDate(dataInicial));

		switch (mesDaData) {
		case 1:
			mesDaData = Calendar.JANUARY;
			break;
		case 2:
			mesDaData = Calendar.FEBRUARY;
			break;
		case 3:
			mesDaData = Calendar.MARCH;
			break;
		case 4:
			mesDaData = Calendar.APRIL;
			break;
		case 5:
			mesDaData = Calendar.MAY;
			break;
		case 6:
			mesDaData = Calendar.JUNE;
			break;
		case 7:
			mesDaData = Calendar.JULY;
			break;
		case 8:
			mesDaData = Calendar.AUGUST;
			break;
		case 9:
			mesDaData = Calendar.SEPTEMBER;
			break;
		case 10:
			mesDaData = Calendar.OCTOBER;
			break;
		case 11:
			mesDaData = Calendar.NOVEMBER;
			break;
		case 12:
			mesDaData = Calendar.DECEMBER;
			break;
		default:
			break;
		}

		String horaMinSeg = getHoraMinSegPorDate(dataInicial);

		int hora = Integer.parseInt(horaMinSeg.substring(0,
				horaMinSeg.indexOf(":")));
		int min = Integer.parseInt(horaMinSeg.substring(
				horaMinSeg.indexOf(":") + 1, horaMinSeg.lastIndexOf(":")));
		int seg = Integer.parseInt(horaMinSeg.substring(
				horaMinSeg.lastIndexOf(":") + 1, horaMinSeg.length()));

		Calendar c = Calendar.getInstance();
		c.add(Calendar.HOUR, hora);
		c.add(Calendar.MINUTE, min);
		c.add(Calendar.SECOND, seg);
		// TODO murillo.marinho
		// DateTime finalTime = new DateTime(dataFinal);
		// Hours horaFinal = Hours.hoursBetween(initialTime, finalTime);
		// Minutes minFinal = Minutes.minutesBetween(initialTime, finalTime);
		// Seconds segFinal = Seconds.secondsBetween(initialTime, finalTime);
		//
		// System.out.println("Hours: " + horaFinal.getHours());
		// System.out.println("Minutos: " + minFinal.getMinutes());
		// System.out.println("Segundos: " + segFinal.getSeconds());
		//
		// Period period = new Period(initialTime, finalTime);
		// System.out.println("Periodo: " + period.getHours());
		//
		// return minFinal.getMinutes();
		return 0;
	}

	public static int getTotalDataEmSegundos2(Date dataInicial, Date dataFinal) {

		// HORA INFORMADA Pelo usu�rio 02:10:01
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//DateTime initialTime = new DateTime(dataInicial.getTime());

		/*
		 * int anoDaData = getAnoPorDate(dataInicial); int dia =
		 * getDiaPorDate(dataInicial);
		 */
		int mesDaData = Integer.parseInt(getMesPorDate(dataInicial));

		switch (mesDaData) {
		case 1:
			mesDaData = Calendar.JANUARY;
			break;
		case 2:
			mesDaData = Calendar.FEBRUARY;
			break;
		case 3:
			mesDaData = Calendar.MARCH;
			break;
		case 4:
			mesDaData = Calendar.APRIL;
			break;
		case 5:
			mesDaData = Calendar.MAY;
			break;
		case 6:
			mesDaData = Calendar.JUNE;
			break;
		case 7:
			mesDaData = Calendar.JULY;
			break;
		case 8:
			mesDaData = Calendar.AUGUST;
			break;
		case 9:
			mesDaData = Calendar.SEPTEMBER;
			break;
		case 10:
			mesDaData = Calendar.OCTOBER;
			break;
		case 11:
			mesDaData = Calendar.NOVEMBER;
			break;
		case 12:
			mesDaData = Calendar.DECEMBER;
			break;
		default:
			break;
		}

		String horaMinSeg = getHoraMinSegPorDate(dataInicial);

		int hora = Integer.parseInt(horaMinSeg.substring(0,
				horaMinSeg.indexOf(":")));
		int min = Integer.parseInt(horaMinSeg.substring(
				horaMinSeg.indexOf(":") + 1, horaMinSeg.lastIndexOf(":")));
		int seg = Integer.parseInt(horaMinSeg.substring(
				horaMinSeg.lastIndexOf(":") + 1, horaMinSeg.length()));

		Calendar c = Calendar.getInstance();
		c.add(Calendar.HOUR, hora);
		c.add(Calendar.MINUTE, min);
		c.add(Calendar.SECOND, seg);

		// TODO murillo.marinho
		//DateTime finalTime = new DateTime(dataFinal);
		// Hours horaFinal = Hours.hoursBetween(initialTime, finalTime);
		// Minutes minFinal = Minutes.minutesBetween(initialTime, finalTime);
		// Seconds segFinal = Seconds.secondsBetween(initialTime, finalTime);
		//
		// System.out.println("Hours: " + horaFinal.getHours());
		// System.out.println("Minutos: " + minFinal.getMinutes());
		// System.out.println("Segundos: " + segFinal.getSeconds());
		//
		// Period period = new Period(initialTime, finalTime);
		// System.out.println("Periodo: " + period.getHours());
		// System.out.println("Segundos" + period.getSeconds());
		// return segFinal.getSeconds();

		return 0;

	}

	public static String milisegundosParaHora(long tempo) {
		String hora = "";
		int secs = (int) tempo / 1000;
		if (tempo == 0) {
			hora = "0";
		} else {
			int[] ret = new int[3];
			// calcula nmero de horas, minutos e segundos
			ret[0] = secs / 3600;
			secs = secs % 3600;
			ret[1] = secs / 60;
			secs = secs % 60;
			ret[2] = secs;
			if (ret[0] != 0) {
				hora += ret[0] + "h";
			}
			if (ret[1] != 0) {
				hora += ret[1] + "min";
			}
		} // fim do if (tempo == 0)
		return hora;
	}

	public static Date somarHoras(Date dataInicial, Date dataFinal) {

		GregorianCalendar gc = new GregorianCalendar();

		// HORA INFORMADA Pelo usu�rio 02:10:01
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		int anoDaData = getAnoPorDate(dataInicial);
		int dia = getDiaPorDate(dataInicial);
		int mesDaData = Integer.parseInt(getMesPorDate(dataInicial));

		switch (mesDaData) {
		case 1:
			mesDaData = Calendar.JANUARY;
			break;
		case 2:
			mesDaData = Calendar.FEBRUARY;
			break;
		case 3:
			mesDaData = Calendar.MARCH;
			break;
		case 4:
			mesDaData = Calendar.APRIL;
			break;
		case 5:
			mesDaData = Calendar.MAY;
			break;
		case 6:
			mesDaData = Calendar.JUNE;
			break;
		case 7:
			mesDaData = Calendar.JULY;
			break;
		case 8:
			mesDaData = Calendar.AUGUST;
			break;
		case 9:
			mesDaData = Calendar.SEPTEMBER;
			break;
		case 10:
			mesDaData = Calendar.OCTOBER;
			break;
		case 11:
			mesDaData = Calendar.NOVEMBER;
			break;
		case 12:
			mesDaData = Calendar.DECEMBER;
			break;
		default:
			break;
		}

		String horaMinSeg = getHoraMinSegPorDate(dataInicial);

		int hora = Integer.parseInt(horaMinSeg.substring(0,
				horaMinSeg.indexOf(":")));
		int min = Integer.parseInt(horaMinSeg.substring(
				horaMinSeg.indexOf(":") + 1, horaMinSeg.lastIndexOf(":")));
		int seg = Integer.parseInt(horaMinSeg.substring(
				horaMinSeg.lastIndexOf(":") + 1, horaMinSeg.length()));

		// int ano, mes, dia, hora, minutos e segundos
		gc.set(anoDaData, mesDaData, dia, hora, min, seg);

		String horaMinSegFinal = getHoraMinSegPorDate(dataFinal);

		int horaFinal = Integer.parseInt(horaMinSegFinal.substring(0,
				horaMinSegFinal.indexOf(":")));
		int minFinal = Integer.parseInt(horaMinSegFinal.substring(
				horaMinSegFinal.indexOf(":") + 1,
				horaMinSegFinal.lastIndexOf(":")));
		int segFinal = Integer
				.parseInt(horaMinSegFinal.substring(
						horaMinSegFinal.lastIndexOf(":") + 1,
						horaMinSegFinal.length()));
		// HORA PARA SOMAR 00:10:10
		gc.add(Calendar.HOUR, horaFinal);
		gc.add(Calendar.MINUTE, minFinal);
		gc.add(Calendar.SECOND, segFinal);

		System.out.println("HORA SOMADA: " + sdf.format(gc.getTime()));
		return gc.getTime();

	}

	public static Date formataData(Date data, String formato) throws Exception {

		try {

			SimpleDateFormat sdf = new SimpleDateFormat(formato);
			String dataString = sdf.format(data);
			return sdf.parse(dataString);
		} catch (ParseException e) {
			throw e;
		}

	}

	public static Date getDiferencaData(Date dtInicial, Date dtFinal) {
		// Convertendo as datas para milisegundos
		long milisecondBegin = dtInicial.getTime();
		long milisecondEnd = dtFinal.getTime();

		// Subtraindo os milisegundos, para obter a diferen�a
		long milisecondResult = milisecondEnd - milisecondBegin;

		return new Date(milisecondResult);
	}

	/**
	 * Calcula a diferen�a de duas datas em dias <br>
	 * <b>Importante:</b> Quando realiza a diferen�a em dias entre duas datas,
	 * este m�todo considera as horas restantes e as converte em fra��o de dias.
	 * 
	 * @param dataInicial
	 * @param dataFinal
	 * @return quantidade de dias existentes entre a dataInicial e dataFinal.
	 */
	public static double getDiferencaEmDias(Date dataInicial, Date dataFinal) {
		double result = 0;
		long diferenca = dataFinal.getTime() - dataInicial.getTime();
		double diferencaEmDias = (diferenca / 1000) / 60 / 60 / 24; // resultado
																	// �
																	// diferen�a
																	// entre as
																	// datas em
																	// dias
		long horasRestantes = (diferenca / 1000) / 60 / 60 % 24; // calcula as
																	// horas
																	// restantes
		result = diferencaEmDias + (horasRestantes / 24d); // transforma as
															// horas restantes
															// em fra��o de dias

		return result;
	}

	public static double getDiferencaEmMeses(Date dataInicial, Date dataFinal) {
		// SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		/*
		 * valor de um mes em milisegundos, sendo que os valores sao: 30 dias no
		 * mes, 24 horas no dia, 60 minutos por hora, 60 segundos por minuto e
		 * 1000 milisegundos
		 */
		final double MES_EM_MILISEGUNDOS = 30.0 * 24.0 * 60.0 * 60.0 * 1000.0;
		// final double MES_EM_MILISEGUNDOS = 2592000000.0;

		return (double) ((dataFinal.getTime() - dataInicial.getTime()) / MES_EM_MILISEGUNDOS);
	}

	public static int getDiferencaEmMesesJODATime(Date dataInicial,
			Date dataFinal) {
		// TODO murillo.marinho
		// LocalDate data1 = new LocalDate(dataInicial); // voc� pode passar um
		// // Date no construtor
		// LocalDate dataAtual = new LocalDate(dataFinal);
		//
		// Months meses = Months.monthsBetween(data1, dataAtual);
		//
		// return meses.getMonths();
		return 0;
	}

	/**
	 * Calcula a diferen�a de duas datas em horas <br>
	 * <b>Importante:</b> Quando realiza a diferen�a em horas entre duas datas,
	 * este m�todo considera os minutos restantes e os converte em fra��o de
	 * horas.
	 * 
	 * @param dataInicial
	 * @param dataFinal
	 * @return quantidade de horas existentes entre a dataInicial e dataFinal.
	 */
	public static double getDiferencaEmHoras(Date dataInicial, Date dataFinal) {
		double result = 0;
		long diferenca = dataFinal.getTime() - dataInicial.getTime();
		long diferencaEmHoras = (diferenca / 1000) / 60 / 60;
		long minutosRestantes = (diferenca / 1000) / 60 % 60;
		double horasRestantes = minutosRestantes / 60d;
		result = diferencaEmHoras + (horasRestantes);

		return result;
	}

	/**
	 * Calcula a diferen�a de duas datas em minutos <br>
	 * <b>Importante:</b> Quando realiza a diferen�a em minutos entre duas
	 * datas, este m�todo considera os segundos restantes e os converte em
	 * fra��o de minutos.
	 * 
	 * @param dataInicial
	 * @param dataFinal
	 * @return quantidade de minutos existentes entre a dataInicial e dataFinal.
	 */
	public static double getDiferencaEmMinutos(Date dataInicial, Date dataFinal) {
		double result = 0;
		long diferenca = dataFinal.getTime() - dataInicial.getTime();
		double diferencaEmMinutos = (diferenca / 1000) / 60; // resultado �
																// diferen�a
																// entre as
																// datas em
																// minutos
		long segundosRestantes = (diferenca / 1000) % 60; // calcula os segundos
															// restantes
		result = diferencaEmMinutos + (segundosRestantes / 60d); // transforma
																	// os
																	// segundos
																	// restantes
																	// em
																	// minutos

		return result;
	}

	/**
	 * Calcula a diferen�a de duas datas em segundos <br>
	 * <b>Importante:</b> Quando realiza a diferen�a em minutos entre duas
	 * datas, este m�todo considera os segundos restantes e os converte em
	 * fra��o de minutos.
	 * 
	 * @param dataInicial
	 * @param dataFinal
	 * @return quantidade de minutos existentes entre a dataInicial e dataFinal.
	 */
	public static double getDiferencaEmSegundos(Date dataInicial, Date dataFinal) {
		double result = 0;
		long diferenca = dataFinal.getTime() - dataInicial.getTime();
		double diferencaEmMinutos = (diferenca / 1000) / 60; // resultado �
																// diferen�a
																// entre as
																// datas em
																// minutos
		long segundosRestantes = (diferenca / 1000) % 60; // calcula os segundos
															// restantes
		result = diferencaEmMinutos + (segundosRestantes / 60d); // transforma
																	// os
																	// segundos
																	// restantes
																	// em
																	// minutos

		return result * 60;
	}

	/*
	 * public static double getDataEmSegundos(Date data){ double result = 0;
	 * double diferencaEmMinutos = (data.getTime() /1000) / 60; //resultado �
	 * diferen�a entre as datas em minutos long segundosRestantes =
	 * (data.getTime() / 1000)%60; //calcula os segundos restantes result =
	 * diferencaEmMinutos + (segundosRestantes /60d); //transforma os segundos
	 * restantes em minutos
	 * 
	 * return result * 60; }
	 */

	/**
	 * Calcula a diferen�a de duas datas retornando a HH:mm:ss <br>
	 * <b>Importante:</b> Quando realiza a diferen�a em minutos entre duas
	 * datas, este m�todo considera os segundos restantes e os converte em
	 * fra��o de minutos.
	 * 
	 * @param dataInicial
	 * @param dataFinal
	 * @return Data da diferena em HHmm:ss.
	 */
	public static Date getDiferencaDatasHoraMinutoSegundo(Date dataInicial,
			Date dataFinal) throws Exception {
		double result = 0;
		Date tempoDiferencaFinal = null;
		try {
			long diferenca = dataFinal.getTime() - dataInicial.getTime();
			double diferencaEmMinutos = (diferenca / 1000) / 60; // resultado �
																	// diferen�a
																	// entre as
																	// datas em
																	// minutos
			long segundosRestantes = (diferenca / 1000) % 60; // calcula os
																// segundos
																// restantes
			result = diferencaEmMinutos + (segundosRestantes / 60d); // transforma
																		// os
																		// segundos
																		// restantes
																		// em
																		// minutos

			Double diferencaEmSegundos = result * 60;

			Double segundo = diferencaEmSegundos % 60;
			Double minutos = diferencaEmSegundos / 60;
			Double minuto = minutos % 60;
			Double hora = minutos / 60;
			if (minutos < 1) {
				hora = (double) 0;
			}

			// System.out.println(hora+ " horas "+ minuto + "minuto(s) e" +
			// segundo + " segundos ");

			int indexHora = hora.toString().indexOf(".");
			int indexMinutos = minuto.toString().indexOf(".");
			int indexSegundos = segundo.toString().indexOf(".");

			String horaMinSegString = hora.toString().substring(0, indexHora)
					+ ":" + minuto.toString().subSequence(0, indexMinutos)
					+ ":" + segundo.toString().substring(0, indexSegundos);

			String diaMesAnoString = DataUtil.dateToString(dataFinal,
					"dd/MM/yyyy");
			if (diaMesAnoString.substring(0, diaMesAnoString.indexOf("/"))
					.length() == 1) {
				diaMesAnoString = "0" + diaMesAnoString;
			}

			tempoDiferencaFinal = DataUtil.stringToDate(diaMesAnoString + " "
					+ horaMinSegString, "dd/MM/yyyy HH:mm:ss");

			/*
			 * tempoDiferencaFinal =
			 * DataUtil.stringToDate(hora.toString().substring(0,indexHora) +
			 * ":" + minuto.toString().subSequence(0, indexMinutos) + ":" +
			 * segundo.toString().substring(0, indexSegundos), "HH:mm:ss") ;
			 */
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return tempoDiferencaFinal;
	}

	public static String dateToString(Date data, String formatoOrigem,
			String formatoDestino) throws Exception {

		String dataString = "";
		try {

			SimpleDateFormat sdfOrigem = new SimpleDateFormat(formatoOrigem);
			Date newData = sdfOrigem.parse(data.toString());

			SimpleDateFormat sdfDestino = new SimpleDateFormat(formatoDestino);
			dataString = sdfDestino.format(newData);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return dataString;
	}

	public static String dateToString(Date data, String formatoDestino)
			throws Exception {

		String dataString = "";
		try {
			if(data != null){
				SimpleDateFormat sdfDestino = new SimpleDateFormat(formatoDestino);
				dataString = sdfDestino.format(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return dataString;
	}

	public static String formataDataString(String dataString,
			String formatoOrigem, String formatoDestino) throws Exception {
		try {
			SimpleDateFormat sdfOrigem = new SimpleDateFormat(formatoOrigem);
			Date newData = sdfOrigem.parse(dataString);

			SimpleDateFormat sdfDestino = new SimpleDateFormat(formatoDestino);
			dataString = sdfDestino.format(newData);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return dataString;

	}

	public static String getHojePorExtenso() {

		DateFormat dfmt = new SimpleDateFormat("EEEE, d MMMM yyyy");
		Date hoje = Calendar.getInstance(Locale.getDefault()).getTime();
		return dfmt.format(hoje);

	}

	public static String getHoje() {

		DateFormat dfmt = new SimpleDateFormat("dd/MM/yyyy");
		Date hoje = Calendar.getInstance(Locale.getDefault()).getTime();
		return dfmt.format(hoje);

	}

	public static Integer getAnoPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("yyyy");
		return Integer.parseInt(dfmt.format(data));

	}

	public static Integer getDiaPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("dd");
		return Integer.parseInt(dfmt.format(data));

	}
	public static Integer getHoraPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("HH");
		return Integer.parseInt(dfmt.format(data));

	}
	
	public static Integer getMinutoPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("mm");
		return Integer.parseInt(dfmt.format(data));

	}

	public static String getAnoPorDateString(Date data) {

		DateFormat dfmt = new SimpleDateFormat("yyyy");
		return dfmt.format(data);

	}

	public static String getHoraMinSegPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("HH:mm:ss");
		return dfmt.format(data);

	}

	public static String getMesPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("MM");
		return dfmt.format(data);

	}

	public static String getMesPorDateExtenso(Date data) {

		DateFormat dfmt = new SimpleDateFormat("MM");
		if (dfmt.format(data).equals("01")) {
			return "Janeiro";
		} else if (dfmt.format(data).equals("02")) {
			return "Fevereiro";
		} else if (dfmt.format(data).equals("03")) {
			return "Mar�o";
		} else if (dfmt.format(data).equals("04")) {
			return "Abril";
		} else if (dfmt.format(data).equals("05")) {
			return "Maio";
		} else if (dfmt.format(data).equals("06")) {
			return "Junho";
		} else if (dfmt.format(data).equals("07")) {
			return "Julho";
		} else if (dfmt.format(data).equals("08")) {
			return "Agosto";
		} else if (dfmt.format(data).equals("09")) {
			return "Setembro";
		} else if (dfmt.format(data).equals("10")) {
			return "Outubro";
		} else if (dfmt.format(data).equals("11")) {
			return "Novembro";
		} else {
			return "Dezembro";
		}

	}

	public static String getDataHoraString(Date data, String formatoOrigem,
			String formatoDestino) throws Exception {
		String dataString = "";

		SimpleDateFormat sdfOrigem = new SimpleDateFormat(formatoOrigem);
		Date newData = sdfOrigem.parse(data.toString());

		SimpleDateFormat sdfDestino = new SimpleDateFormat(formatoDestino);
		dataString = sdfDestino.format(newData);

		int indexEspaco = dataString.indexOf(" ");
		int tamanhoTotal = dataString.length();

		String dataFinal = dataString.substring(0, indexEspaco) + " �s"
				+ dataString.substring(indexEspaco, tamanhoTotal);

		return dataFinal;

	}

	public static String getHorasExtrasFormatados(double totalFinalHorasExtras) {
		Double horaDouble = totalFinalHorasExtras / 3600;

		Double apenasHoras = Double.parseDouble(horaDouble.toString()
				.substring(0, horaDouble.toString().indexOf(".")));
		Double apenasMinutos = (totalFinalHorasExtras - (apenasHoras * 3600)) / 60;
		String apenasMinutosString = apenasMinutos.toString().substring(0,
				apenasMinutos.toString().indexOf("."));
		String apenasHorasString = apenasHoras.toString().substring(0,
				apenasHoras.toString().indexOf("."));

		if (apenasHorasString.length() == 1) {
			apenasHorasString = "0" + apenasHorasString;
		}

		if (apenasMinutosString.length() == 1) {
			apenasMinutosString = "0" + apenasMinutosString;
		}

		String TOTAL_HORAS_EXTRAS_FORMATADO = null;
		if (!apenasHorasString.equals("00")
				|| !apenasMinutosString.equals("00")) {
			TOTAL_HORAS_EXTRAS_FORMATADO = apenasHorasString + ":"
					+ apenasMinutosString;
		}
		return TOTAL_HORAS_EXTRAS_FORMATADO;
	}

	public static String getHorasMinSegFormatados(double segundos) {

		
		int segundo = (int) (segundos % 60); 
		int minutos = (int) (segundos / 60); 
		int minuto = minutos % 60; 
		int hora = minutos / 60; 
		String hms = String.format ("%02d:%02d:%02d", hora, minuto, segundo); 
		
		return hms;
	}
	public static String getHorasMinFormatados(double segundos) {

		
		//int segundo = (int) (segundos % 60); 
		int minutos = (int) (segundos / 60); 
		int minuto = minutos % 60; 
		int hora = minutos / 60; 
		String hms = String.format ("%02d:%02d", hora, minuto); 
		
		return hms;
	}
	public static String getHorasFormatados(double totalHoras) {
		Integer inteiroDivisaoAtraso = (int) (totalHoras / 60);

		Integer minutosParteInteira = (int) (totalHoras
				- (inteiroDivisaoAtraso * 60));

		String horaAtraso = "";
		if (inteiroDivisaoAtraso.toString().length() == 1) {
			horaAtraso = "0" + inteiroDivisaoAtraso.toString();
		} else {
			horaAtraso = inteiroDivisaoAtraso.toString();
		}

		String minutosAtraso = "";
		if (minutosParteInteira.toString().length() == 1) {
			minutosAtraso = "0" + minutosParteInteira.toString();
		} else {
			minutosAtraso = minutosParteInteira.toString();
		}

		String TOTAL_HORAS_ATRASO = null;
		if (!horaAtraso.equals("00") || !minutosAtraso.equals("00")) {
			TOTAL_HORAS_ATRASO = horaAtraso + ":" + minutosAtraso;
		}

		return TOTAL_HORAS_ATRASO;

	}
	public static Integer getDataEmSegundos(Date data) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		return cal.get(Calendar.SECOND);

	}

	public static Double getTotaSegundosPorDateEHoras(Date dataReferencia,
			String horasMinSeg) throws Exception {
		try {

			String dataString8Horas = DataUtil.dateToString(dataReferencia,
					"dd/MM/yyyy");
			String horasInicio = "00:00:00";

			Date data8HorasInicio = DataUtil.stringToDate(dataString8Horas
					+ " " + horasInicio, "dd/MM/yyyy HH:mm:ss");
			Date data8HorasFim = DataUtil.stringToDate(dataString8Horas + " "
					+ horasMinSeg, "dd/MM/yyyy HH:mm:ss");

			return DataUtil.getDiferencaEmSegundos(data8HorasInicio,
					data8HorasFim);
		} catch (Exception e) {
			throw e;
		}
	}
	 public static Date getDataInicializandoHoras(Date data,String hora) throws Exception {
		 try {
			 int ano = getAnoPorDate(data);
			 String mes =   getMesPorDate(data);
			 int dia = getDiaPorDate(data);
			 //DataUtil.getHoraPorDate(dataHoje);
			 return stringToDate(dia + "/" + mes + "/" + ano + " " + hora, "dd/MM/yyyy HH:mm");
		 } catch (Exception e) {
			 e.printStackTrace();
			 throw e;
		 }
	 }	

}
