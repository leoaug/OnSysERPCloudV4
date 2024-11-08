/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
/**
 *
 * @author Assis
 */
@ManagedBean
@Named
@SessionScoped
public class PostProcessXLS implements java.io.Serializable{
    
    public void postProcessXLS(Object document) {
        
        //System.out.println("***postProcessXLS***");
        //System.out.println("document===>"+document);
        HSSFWorkbook    wb      = (HSSFWorkbook) document;
        HSSFSheet       sheet   = wb.getSheetAt(0);
        HSSFRow         header  = sheet.getRow(0);
         
        HSSFCellStyle cellStyle = wb.createCellStyle();  
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);            
        cellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
        cellStyle.setWrapText(true);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());            
        Font        font    = wb.createFont();
        font.setFontName("Liberation Sans");
        font.setColor(IndexedColors.BLACK.getIndex());
        font.setBold(true);
        font.setFontHeightInPoints((short) 12);
        cellStyle.setFont(font);
         
        try {
            for(int i=0; i < header.getPhysicalNumberOfCells();i++) {
                HSSFCell cell = header.getCell(i);             
                cell.setCellStyle(cellStyle);
            }
        } catch (Exception e) {
        }
        
        try {
            for(int i=0; i < header.getPhysicalNumberOfCells(); i++ ) {
                 sheet.autoSizeColumn((short)i);
            }
        } catch (Exception e) {
        }

        try {
            sheet.setAutoFilter(new CellRangeAddress(0 , 0, 0, header.getPhysicalNumberOfCells() - 1));    
        } catch (Exception e) {
        }
        
        try {
            sheet.createFreezePane(0,1);            
        } catch (Exception e) {
        }
        
    }        
    
}