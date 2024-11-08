
package br.com.onsys.entidades.comercial;

import java.io.Serializable;
import java.math.BigDecimal;

public class RankingVendas implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String venda;    
    private BigDecimal valor;

    public RankingVendas(String venda, BigDecimal valor) {
        this.venda = venda;
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getVenda() {
        return venda;
    }

    public void setVenda(String venda) {
        this.venda = venda;
    }    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RankingVendas other = (RankingVendas) obj;
        if ((this.venda == null) ? (other.venda != null) : !this.venda.equals(other.venda)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.venda != null ? this.venda.hashCode() : 0);
        return hash;
    }
    
}