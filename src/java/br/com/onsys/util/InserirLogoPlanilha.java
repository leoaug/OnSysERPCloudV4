package br.com.onsys.util;

import br.com.onsys.entidades.basico.Empresa;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.imageio.ImageIO;
import javax.inject.Named;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFPicture;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.util.IOUtils;

@ManagedBean
@Named
@SessionScoped
public class InserirLogoPlanilha  implements java.io.Serializable{
    
    public void inserirLogoPlanilha(Workbook workbook, Sheet sheet, Empresa empresa) throws IOException  {
        
        System.out.println("empresa para imprimir logo===>"+empresa.getCodigo());
        
        InputStream bin = null;        
        bin     =  new ByteArrayInputStream((byte[]) empresa.getLogoimg()) ;
        byte[] bytes = IOUtils.toByteArray(bin);
        int my_picture_id = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_JPEG);
        bin.close();  
        HSSFPatriarch drawing = (HSSFPatriarch) sheet.createDrawingPatriarch();
        ClientAnchor my_anchor = new HSSFClientAnchor();
        my_anchor.setRow1(0);
        my_anchor.setCol1(1);        
        HSSFPicture  my_picture = drawing.createPicture(my_anchor, my_picture_id);        
        Dimension size = my_picture.getImageDimension();
        double scaledWidth = size.getWidth();
        double procentage = (475.0d * 100d) / scaledWidth;
        double autosize = procentage / 100.0d;                
        my_picture.resize(autosize);  
        try {
            BufferedImage valida_logo = ImageIO.read(bin);
        } catch (Exception e) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Atenção : ","Logo não cadastrado.");
            FacesContext.getCurrentInstance().addMessage("Logo não cadastrado.", fm);  
        }         
        
    }
    
}