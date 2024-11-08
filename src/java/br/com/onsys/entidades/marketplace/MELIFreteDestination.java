/*
 * MercadoLibre API
 * MercadoLibre API Documentation.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * ItemJson
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-14T10:44:34.055-03:00")
@JsonRootName(value = "destination")
public class MELIFreteDestination {
    
    @JsonProperty("destination")
    private String destination = null;

    @JsonProperty("items")
    private List<MELIFreteItem> items = null;

    @ApiModelProperty(value = "")    
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @ApiModelProperty(value = "")    
    public List<MELIFreteItem> getItems() {
        return items;
    }

    public void setItems(List<MELIFreteItem> items) {
        this.items = items;
    }
    

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}
