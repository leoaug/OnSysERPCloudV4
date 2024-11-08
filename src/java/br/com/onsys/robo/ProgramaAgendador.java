package br.com.onsys.robo;

import java.util.Date;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.session.seguranca.ProgramaSession;

public class ProgramaAgendador implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		ProgramaSession programaSession = (ProgramaSession) arg0.getJobDetail().getJobDataMap().get("programaSession");

		List<Programa> listaProgramas = programaSession.getAll(1);
		
		System.out.println(listaProgramas);
		// fazer as tarefas do 
		
		
	  	System.out.println("===============================================================================");
	  	System.out.println("====== Robô ProgramaAgendador executado, data de verificação: " + new Date(System.currentTimeMillis()) + " =====");
	  	System.out.println("===============================================================================");
		
	}

}
