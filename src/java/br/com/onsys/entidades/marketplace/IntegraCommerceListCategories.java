/* RECEBE A REQUISICAO DO FRETE MAGALU
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class IntegraCommerceListCategories implements Serializable {

    @JsonProperty()
    private List<IntegraCommerceCategories> categories;

    public List<IntegraCommerceCategories> getCategories() {
        return categories;
    }

    public void setCategories(List<IntegraCommerceCategories> categories) {
        this.categories = categories;
    }

}