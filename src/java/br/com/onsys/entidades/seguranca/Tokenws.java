
package br.com.onsys.entidades.seguranca;

import java.io.Serializable;
import javax.persistence.*;

public class Tokenws implements Serializable {
    private static final long serialVersionUID = 167L;
    @Id
    @Column(name="id",nullable=false,length=200)
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
}