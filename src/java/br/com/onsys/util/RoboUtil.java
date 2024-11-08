package br.com.onsys.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import br.com.onsys.robo.ProgramaAgendador;
import br.com.onsys.session.seguranca.ProgramaSession;

public class RoboUtil {

	public static void inicializarProgramaRobo(ProgramaSession programaSession) throws SchedulerException {

		SchedulerFactory schfa = new StdSchedulerFactory();
		Scheduler sch = schfa.getScheduler();

		JobDetail jobdetail = JobBuilder.newJob(ProgramaAgendador.class).withIdentity("jobPrograma", "groupPrograma")
				.build();

		if (sch.checkExists(jobdetail.getKey())) {
			sch.deleteJob(jobdetail.getKey());
		}

		jobdetail.getJobDataMap().put("programaSession", programaSession);

		// teste de 2 em dois minutos
		CronTrigger crontrigger = TriggerBuilder.newTrigger().withIdentity("jobTriggerPrograma", "groupPrograma")
				.withSchedule(CronScheduleBuilder.cronSchedule("0 0/2 * 1/1 * ? *")).build();
		sch.scheduleJob(jobdetail, crontrigger);
		sch.start();

		/*
		 * criar uma tabela depois pra parametrizar o robo
		 * 
		 * 
		 * List <String> params = new ArrayList<>(); params.add("COMERCIAL");
		 * params.add("Bukly - Enviar Restrições (Pacotes e Final de semana)");
		 * RoboRedeHotelEJB roboRedeHotel = checkinDelegate.consultarPorNamedQuery(
		 * "RoboRedeHotelEJB.findByRoboDescricaoRotinaEDescricao",params);
		 * if(roboRedeHotel != null) { CronTrigger crontrigger =
		 * TriggerBuilder.newTrigger().withIdentity("jobTriggerPrograma",
		 * "groupPrograma")
		 * .withSchedule(CronScheduleBuilder.cronSchedule(roboRedeHotel.getRobo().
		 * getCronometro().trim())).build(); sch.scheduleJob(jobdetail, crontrigger);
		 * sch.start(); }
		 */
	}

	public static String generateCron(String time, String frequency) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date date = dateFormat.parse(time);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);

		switch (frequency.toLowerCase()) {
		case "once":
			return String.format("%d %d %d %d ? %d", minute, hour, calendar.get(Calendar.DAY_OF_MONTH),
					calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
		case "daily":
			return String.format("%d %d * * ?", minute, hour);
		case "weekly":
			return String.format("%d %d ? * %d", minute, hour, calendar.get(Calendar.DAY_OF_WEEK));
		case "monthly":
			return String.format("%d %d %d * ?", minute, hour, calendar.get(Calendar.DAY_OF_MONTH));
		default:
			throw new IllegalArgumentException("Frequência não suportada: " + frequency);
		}

	}
	

	public static void main(String[] args) {
		try {
			String time = "14:30";
			System.out.println("Once: " + generateCron(time, "once"));
			System.out.println("Daily: " + generateCron(time, "daily"));
			System.out.println("Weekly: " + generateCron(time, "weekly"));
			System.out.println("Monthly: " + generateCron(time, "monthly"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
