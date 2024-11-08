package br.com.onsys.util;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class SendMail {  
    static String smtp              = new String();
    static String porta             = new String();    
    static String emailSmtp         = new String();
    static String senhaSmtp         = new String();
    static String emailDestino      = new String();
    static String assunto           = new String();
    static String texto             = new String();
    static String arquivoOrigem     = new String();
    static String arquivoDestino    = new String();    
    
    public static void enviarEmail(String smtpParam, 
                                   String PortaParam,
                                   String emailSmtpParam, 
                                   String senhaSmtpParam, 
                                   String emailDestinoParam, 
                                   String assuntoParam,
                                   String textoParam,
                                   String arquivoOrigeParam, // caminho e arquivo 
                                   String arquivoDestinoParam) {   // somente o arquivo para download
        smtp         = smtpParam;
        porta        = PortaParam;
        emailSmtp    = emailSmtpParam;
        senhaSmtp    = senhaSmtpParam;
        emailDestino = emailDestinoParam;
        assunto      = assuntoParam;
        texto        = textoParam;
        arquivoOrigem = arquivoOrigeParam;
        arquivoDestino = arquivoDestinoParam;        
        
        try {   
            ConfiguraEmail();   
            System.out.println("Enviado com sucesso");
        } catch (Exception e) {   
            System.out.println("Erro ao enviar, verifique, senha, sua conexão e tente novamente");
            System.out.println("e--->"+e);
        }   
    }   

    public static void ConfiguraEmail() throws MessagingException {
        System.out.println("SendMail.ConfiguraEmail");
        // seta o servidor de emailTeste   
        Properties props = new Properties();   
        props.put ("mail.smtp.host", smtp);
        props.put ("mail.smtp.port", porta);
        System.out.println("smtp--->"+smtp);
        props.put("mail.smtp.auth", "true");
        // cria uma sessao com o servidor de emailTeste   
        Session mailSession = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(emailSmtp, senhaSmtp);
        }});   
        System.out.println("emailSmtp--->"+emailSmtp);
        System.out.println("senhaSmtp--->"+senhaSmtp);
        //Mostra detalhes do envio da mensagem, quando (true)   
        mailSession.setDebug(false);    
        MimeMessage msg = new MimeMessage(mailSession);   
        //Subject = ASSUNTO   
        msg.setSubject(assunto);   
        System.out.println("assunto--->"+assunto);
        // FROM = de esta enviando //   
        InternetAddress from = new InternetAddress(emailSmtp); 
        System.out.println("emailSmtp--->"+emailSmtp);
        msg.setFrom(from);   
        //PARA QUEM recebe //   
        InternetAddress[] address = {new InternetAddress(emailDestino)};   
        System.out.println("emailDestino--->"+emailDestino);
        msg.setRecipients(Message.RecipientType.TO, address);
        // conteudo   
        msg.setContent(texto, "text/plain");           
        
        //Parte 2, anexos   
        MimeBodyPart mbp2 = new MimeBodyPart();  
        Multipart mp = new MimeMultipart();

        //arquivo e uma string com a localizacao do anexo.   
        DataSource source = new FileDataSource(arquivoOrigem);   
        System.out.println("arquivoOrigem--->"+arquivoOrigem);

        mbp2.setDataHandler(new DataHandler(source));   

        //Nome do arquivo de destino, ao ser baixado no email   
        mbp2.setFileName(arquivoDestino);   
        System.out.println("arquivoDestino--->"+arquivoDestino);

        //Adiciona a MimeBodyPart a messagem MultiPart (mp)   
        mp.addBodyPart(mbp2);  
        msg.setContent(mp);
        
        
        //Executa finalmente o envio!    
        Transport.send(msg);   
    }
    
    public static void enviarEmailSemAnexo(String smtpParam, 
                                   String PortaParam,
                                   String emailSmtpParam, 
                                   String senhaSmtpParam, 
                                   String emailDestinoParam, 
                                   String assuntoParam,
                                   String textoParam) {   // somente o arquivo para download
        smtp         = smtpParam;
        porta        = PortaParam;
        emailSmtp    = emailSmtpParam;
        senhaSmtp    = senhaSmtpParam;
        emailDestino = emailDestinoParam;
        assunto      = assuntoParam;
        texto        = textoParam;    
        
        try {   
            ConfiguraEmailSemAnexo();   
            System.out.println("Enviado com sucesso");
        } catch (Exception e) {   
            System.out.println("Erro ao enviar, verifique, senha, sua conexão e tente novamente");
        }   
    }   
    
    public static void ConfiguraEmailSemAnexo() throws MessagingException {
        System.out.println("SendMail.ConfiguraEmail");
        // seta o servidor de emailTeste   
        Properties props = new Properties();   
        props.put ("mail.smtp.host", smtp);
        props.put ("mail.smtp.port", porta);
        System.out.println("smtp--->"+smtp);
        props.put("mail.smtp.auth", "true");
        // cria uma sessao com o servidor de emailTeste   
        Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(emailSmtp, senhaSmtp);
        }});   
        System.out.println("emailSmtp--->"+emailSmtp);
        System.out.println("senhaSmtp--->"+senhaSmtp);
        //Mostra detalhes do envio da mensagem, quando (true)   
        mailSession.setDebug(false);    
        MimeMessage msg = new MimeMessage(mailSession);   
        //Subject = ASSUNTO   
        msg.setSubject(assunto);   
        System.out.println("assunto--->"+assunto);
        // FROM = de esta enviando //   
        InternetAddress from = new InternetAddress(emailSmtp); 
        System.out.println("emailSmtp--->"+emailSmtp);
        msg.setFrom(from);   
        //PARA QUEM recebe //   
        InternetAddress[] address = {new InternetAddress(emailDestino)};   
        System.out.println("emailDestino--->"+emailDestino);
        msg.setRecipients(Message.RecipientType.TO, address);
        // conteudo   
        msg.setContent("<html><head></head><body>" +texto+ "</body></html>", "text/html; charset=utf-8");           
        
        //Executa finalmente o envio!    
        Transport.send(msg);   
    }

}  