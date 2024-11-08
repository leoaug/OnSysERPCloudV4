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
//@Entity
@JsonRootName(value = "message")
public class MELIMessage implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty(value = "from")
    private MELIMessageFrom  from;       
    
    @JsonProperty(value = "to")
    private MELIMessageTo  to;       
    
    @JsonProperty(value = "text")
    private String text;
    
    @JsonProperty(value = "attachments")
    private String attachments[];

    public MELIMessageFrom getFrom() {
        return from;
    }

    public void setFrom(MELIMessageFrom from) {
        this.from = from;
    }

    public MELIMessageTo getTo() {
        return to;
    }

    public void setTo(MELIMessageTo to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getAttachments() {
        return attachments;
    }

    public void setAttachments(String[] attachments) {
        this.attachments = attachments;
    }
    
}