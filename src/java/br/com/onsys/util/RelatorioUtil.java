/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;


//import com.sun.xml.internal.ws.util.UtilException;
//import com.sun.xml.ws.util.UtilException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import javax.faces.context.FacesContext;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.oasis.JROdtExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

public class RelatorioUtil {
  
    public static final int RELATORIO_PDF         = 1;
    public static final int RELATORIO_EXCEL       = 2;
    public static final int RELATORIO_HTML        = 3;
    public static final int RELATORIO_OPEN_OFFICE = 4;
    public static final int RELATORIO_TXT         = 5;
    /*
    public StreamedContent gerarRelatorioOLD(HashMap parametrosRelatorio, String nomeRelatorioJasper, String nomeRelatorioSaida, int tipoRelatorio) throws ExcRepositorio, FileNotFoundException, Exception {
        StreamedContent arquivoRetorno = null;
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            Connection conexao = null;
            conexao = Conexao.getConexao();
            String caminhoRelatorio = context.getExternalContext().getRealPath("relatorios"); 
            String caminhoArquivoJasper = caminhoRelatorio + File.separator + nomeRelatorioJasper + ".jasper";
            String caminhoArquivoRelatorio = null;
            //JasperReport relatorioJasper = (JasperReport) JRLoader.loadObject(caminhoArquivoJasper);

            System.out.println("gerarRelatorio-001");
            //System.out.println(relatorioJasper);
            System.out.println(parametrosRelatorio);
            System.out.println(conexao);            
            System.out.println("gerarRelatorio-002");          
            
            //JasperPrint impressoraJasper = JasperFillManager.fillReport(relatorioJasper, parametrosRelatorio, conexao);

            JRExporter tipoArquivoExportado = null;
            String extensaoArquivoExportado = "";
            File arquivoGerado = null;
            
            switch (tipoRelatorio) {
                case RelatorioUtil.RELATORIO_PDF :
                    tipoArquivoExportado = new JRPdfExporter();
                    extensaoArquivoExportado = "pdf";
                    break;
                case RelatorioUtil.RELATORIO_EXCEL :
                    //tipoArquivoExportado = new JExcelApiExporter();
                    tipoArquivoExportado = new JRXlsExporter();
                    extensaoArquivoExportado = "xls";
                    break;
                case RelatorioUtil.RELATORIO_HTML :
                    tipoArquivoExportado = new JRHtmlExporter();
                    extensaoArquivoExportado = "html";
                    break;
                case RelatorioUtil.RELATORIO_OPEN_OFFICE :
                    tipoArquivoExportado = new JROdtExporter();
                    extensaoArquivoExportado = "odf";
                    break;
                case RelatorioUtil.RELATORIO_TXT :
                    tipoArquivoExportado = new JRTxtExporter();
                    extensaoArquivoExportado = "txt";
                    break;
                default :
                    tipoArquivoExportado = new JRPdfExporter();
                    extensaoArquivoExportado = "pdf";
                    break;
            }
        
            caminhoArquivoRelatorio = caminhoRelatorio + File.separator + nomeRelatorioSaida + "." + extensaoArquivoExportado;
            arquivoGerado = new java.io.File(caminhoArquivoRelatorio);
            tipoArquivoExportado.setParameter(JRExporterParameter.JASPER_PRINT, impressoraJasper);
            tipoArquivoExportado.setParameter(JRExporterParameter.OUTPUT_FILE, arquivoGerado);
            tipoArquivoExportado.exportReport();
            arquivoGerado.deleteOnExit();
            InputStream conteudoRelatorio = new FileInputStream(arquivoGerado);
            arquivoRetorno = new DefaultStreamedContent(conteudoRelatorio, "application/" 
                    + extensaoArquivoExportado, nomeRelatorioSaida + "." + extensaoArquivoExportado);
        } catch (JRException e) {
            throw new Exception("Não foi possível gerar o relatório.", e);
        } catch (FileNotFoundException e) {
            throw new Exception("Arquivo do relatório não encontrato.", e);            
        }
        return arquivoRetorno;
    }
    */
    
    public StreamedContent gerarRelatorioEmail(HashMap parametrosRelatorio, String nomeRelatorioJasper, String nomeRelatorioSaida, int tipoRelatorio) throws FileNotFoundException, Exception {
        FacesContext context = FacesContext.getCurrentInstance();
        Connection conexao = null;
        conexao = Conexao.getConexao();
        String caminhoRelatorio = context.getExternalContext().getRealPath("relatorios"); 
        String caminhoArquivoJasper = caminhoRelatorio + File.separator + nomeRelatorioJasper + ".jasper";
        JasperReport relatorioJasper = (JasperReport) JRLoader.loadObject(new File(caminhoArquivoJasper));
        JasperPrint impressoraJasper = JasperFillManager.fillReport(relatorioJasper, parametrosRelatorio, conexao);

        String extensaoArquivoExportado;
        switch (tipoRelatorio) {
            case RelatorioUtil.RELATORIO_PDF :
                extensaoArquivoExportado = "pdf";
                break;
            case RelatorioUtil.RELATORIO_EXCEL :
                extensaoArquivoExportado = "xls";
                break;
            case RelatorioUtil.RELATORIO_OPEN_OFFICE :
                extensaoArquivoExportado = "odf";
                break;
            default :
                extensaoArquivoExportado = "pdf";
                break;
        }
        String caminhoArquivoRelatorio = caminhoRelatorio + File.separator + nomeRelatorioSaida + "." + extensaoArquivoExportado;
        File arquivoGerado = new java.io.File(caminhoArquivoRelatorio);
        switch(extensaoArquivoExportado){
            case "pdf":
                JRPdfExporter jrPdfExporter = new JRPdfExporter();
                jrPdfExporter.setExporterInput(new SimpleExporterInput(impressoraJasper));
                jrPdfExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(arquivoGerado));
                jrPdfExporter.exportReport();
                break;
            case "xls":
                JRXlsxExporter jrXlsExporter = new JRXlsxExporter();
                jrXlsExporter.setExporterInput(new SimpleExporterInput(impressoraJasper));
                jrXlsExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(arquivoGerado));
                jrXlsExporter.exportReport();
                break;
            case "odt":
                JROdtExporter jrOdtExporter = new JROdtExporter();
                jrOdtExporter.setExporterInput(new SimpleExporterInput(impressoraJasper));
                jrOdtExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(arquivoGerado));
                jrOdtExporter.exportReport();
                break;
            default:
                JRPdfExporter jrPdfExporter2 = new JRPdfExporter();
                jrPdfExporter2.setExporterInput(new SimpleExporterInput(impressoraJasper));
                jrPdfExporter2.setExporterOutput(new SimpleOutputStreamExporterOutput(arquivoGerado));
                jrPdfExporter2.exportReport();
                break;
        }

        arquivoGerado.deleteOnExit();
        InputStream conteudoRelatorio = new FileInputStream(arquivoGerado);
      //  StreamedContent arquivoRetorno = new DefaultStreamedContent(conteudoRelatorio, "application/" 
      //          + extensaoArquivoExportado, nomeRelatorioSaida + "." + extensaoArquivoExportado);

    //    return arquivoRetorno;
        return null;
    }
  
        
    public StreamedContent gerarRelatorio(HashMap parametrosRelatorio, String nomeRelatorioJasper, String nomeRelatorioSaida, int tipoRelatorio) throws FileNotFoundException, Exception {
        
        //System.out.println("***RelatorioUtil.gerarRelatorio***");
        
        FacesContext context = FacesContext.getCurrentInstance();
        
        //System.out.println("***gerarRelatorio-1***");        
        
        Connection conexao = Conexao.getConexao();
        
        //System.out.println("***gerarRelatorio-2***");                
        
        String caminhoRelatorio = context.getExternalContext().getRealPath("relatorios"); 
        
        //System.out.println("***CAMINHO DOS RELATORIOS===>"+caminhoRelatorio);
        
        String caminhoArquivoJasper = caminhoRelatorio + File.separator + nomeRelatorioJasper + ".jasper";
        
        //System.out.println("***CAMINHO DO ARQUIVO JASPER===>"+caminhoArquivoJasper);
        
        JasperReport relatorioJasper = (JasperReport) JRLoader.loadObject(new File(caminhoArquivoJasper));
        JasperPrint impressoraJasper = JasperFillManager.fillReport(relatorioJasper, parametrosRelatorio, conexao);
        String extensaoArquivoExportado;
        switch (tipoRelatorio) {
            case RelatorioUtil.RELATORIO_PDF :
                extensaoArquivoExportado = "pdf";
                break;
            case RelatorioUtil.RELATORIO_EXCEL :
                extensaoArquivoExportado = "xls";
                break;
            case RelatorioUtil.RELATORIO_OPEN_OFFICE :
                extensaoArquivoExportado = "odf";
                break;
            default :
                extensaoArquivoExportado = "pdf";
                break;
        
        }
        
        //System.out.println("***3-RelatorioUtil.gerarRelatorio***");
        
        String caminhoArquivoRelatorio = caminhoRelatorio + File.separator + nomeRelatorioSaida + "." + extensaoArquivoExportado;
        File arquivoGerado = new java.io.File(caminhoArquivoRelatorio);
        switch(extensaoArquivoExportado){
            case "pdf":
                JRPdfExporter jrPdfExporter = new JRPdfExporter();
                jrPdfExporter.setExporterInput(new SimpleExporterInput(impressoraJasper));
                jrPdfExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(arquivoGerado));
                jrPdfExporter.exportReport();
                break;
            case "xls":
                JRXlsxExporter jrXlsExporter = new JRXlsxExporter();
                jrXlsExporter.setExporterInput(new SimpleExporterInput(impressoraJasper));
                jrXlsExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(arquivoGerado));
                jrXlsExporter.exportReport();
                break;
            case "odt":
                JROdtExporter jrOdtExporter = new JROdtExporter();
                jrOdtExporter.setExporterInput(new SimpleExporterInput(impressoraJasper));
                jrOdtExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(arquivoGerado));
                jrOdtExporter.exportReport();
                break;
            default:
                JRPdfExporter jrPdfExporter2 = new JRPdfExporter();
                jrPdfExporter2.setExporterInput(new SimpleExporterInput(impressoraJasper));
                jrPdfExporter2.setExporterOutput(new SimpleOutputStreamExporterOutput(arquivoGerado));
                jrPdfExporter2.exportReport();
                break;
        }

        //System.out.println("***4-RelatorioUtil.gerarRelatorio***");
        
        arquivoGerado.deleteOnExit();
        InputStream conteudoRelatorio = new FileInputStream(arquivoGerado);
        //StreamedContent arquivoRetorno = new DefaultStreamedContent(conteudoRelatorio, "application/" 
        //        + extensaoArquivoExportado, nomeRelatorioSaida + "." + extensaoArquivoExportado);
        
        //System.out.println("***5-RelatorioUtil.gerarRelatorio***");
        
        //return arquivoRetorno;
        return null;
        
    }
    
}