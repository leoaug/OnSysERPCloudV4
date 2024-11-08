package br.com.onsys.listener;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.quartz.SchedulerException;

import br.com.onsys.session.seguranca.ProgramaSession;
import br.com.onsys.util.RoboUtil;

@WebListener
public class AgendadorTarefaListener  implements ServletContextListener {

	@Inject
    private ProgramaSession             programaSession;
	
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		/*
		try {
			this.inicializarProgramaRobo();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		*/
	}

	private void inicializarProgramaRobo() throws SchedulerException {
		RoboUtil.inicializarProgramaRobo(programaSession);
		
	}
}
