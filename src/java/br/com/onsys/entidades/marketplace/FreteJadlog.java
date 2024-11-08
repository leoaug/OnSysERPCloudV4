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
@JsonRootName(value = "frete")
public class FreteJadlog implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "cepori")    
    private String cepori;    
    
    @JsonProperty(value = "cepdes")        
    private String cepdes;    

    @JsonProperty(value = "frap")
    private String frap;    

    @JsonProperty(value = "peso")
    private double peso;    

    @JsonProperty(value = "cnpj")
    private String cnpj;    
    
    @JsonProperty(value = "conta")
    private String conta;    

    @JsonProperty(value = "contrato")
    private String contrato;    
    
    @JsonProperty(value = "modalidade")
    private String modalidade; 
    
    @JsonProperty(value = "tpentrega")
    private String tpentrega; 
    
    @JsonProperty(value = "tpseguro")
    private String tpseguro; 
    
    @JsonProperty(value = "vldeclarado")
    private double vldeclarado;    
    
    @JsonProperty(value = "vlcoleta")
    private double vlcoleta;    

    public String getCepori() {
        return cepori;
    }

    public void setCepori(String cepori) {
        this.cepori = cepori;
    }

    public String getCepdes() {
        return cepdes;
    }

    public void setCepdes(String cepdes) {
        this.cepdes = cepdes;
    }

    public String getFrap() {
        return frap;
    }

    public void setFrap(String frap) {
        this.frap = frap;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getTpentrega() {
        return tpentrega;
    }

    public void setTpentrega(String tpentrega) {
        this.tpentrega = tpentrega;
    }

    public String getTpseguro() {
        return tpseguro;
    }

    public void setTpseguro(String tpseguro) {
        this.tpseguro = tpseguro;
    }

    public double getVldeclarado() {
        return vldeclarado;
    }

    public void setVldeclarado(double vldeclarado) {
        this.vldeclarado = vldeclarado;
    }

    public double getVlcoleta() {
        return vlcoleta;
    }

    public void setVlcoleta(double vlcoleta) {
        this.vlcoleta = vlcoleta;
    }
    
}