/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;

/**
 *
 * @author Administrador2
 */
@JsonRootName(value = "JamefPostRastreamento")
public class JamefPostRastreamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "documentoResponsavelPagamento")    
    private String documentoResponsavelPagamento = "18257524000128";    
    
    @JsonProperty(value = "numeroNotaFiscal")    
    private String numeroNotaFiscal = "67";    

    @JsonProperty(value = "numeroSerieNotaFiscal")    
    private String numeroSerieNotaFiscal = "1";    

    public String getDocumentoResponsavelPagamento() {
        return documentoResponsavelPagamento;
    }

    public void setDocumentoResponsavelPagamento(String documentoResponsavelPagamento) {
        this.documentoResponsavelPagamento = documentoResponsavelPagamento;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public String getNumeroSerieNotaFiscal() {
        return numeroSerieNotaFiscal;
    }

    public void setNumeroSerieNotaFiscal(String numeroSerieNotaFiscal) {
        this.numeroSerieNotaFiscal = numeroSerieNotaFiscal;
    }
    
}
