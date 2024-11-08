/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;
import java.util.Calendar;  
import java.util.Date;  
import java.util.GregorianCalendar;  
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
/**
 *
 * @author cristiano
 */
@ManagedBean
@Named
@SessionScoped
public class DateUtil implements java.io.Serializable{
    
    public static Date achaPrimeiroDiaUltimoDia(Date data, boolean isPrimeiro)  
    {  
        GregorianCalendar calendar = new GregorianCalendar();  
        calendar.setTime(data);  
          
        if(isPrimeiro)  
            calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);  
        else  
            calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);  
          
        return calendar.getTime();  
    }      
    
    public static Integer achaUltimoDiaMes(Date data) {  
        Date dataRecebida = data;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataRecebida);
        System.out.println("DIA --->"+calendar.getActualMaximum(Calendar.DAY_OF_MONTH));                  
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  
    }      
    
}