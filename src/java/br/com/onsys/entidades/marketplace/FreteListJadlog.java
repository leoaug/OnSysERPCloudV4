/* RECEBE A REQUISICAO DO FRETE MAGALU
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class FreteListJadlog implements Serializable {

    @JsonProperty(value = "frete")
    private List<FreteJadlog> frete;

    public List<FreteJadlog> getFrete() {
        return frete;
    }

    public void setFrete(List<FreteJadlog> frete) {
        this.frete = frete;
    }

}