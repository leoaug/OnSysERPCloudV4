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


package br.com.onsys.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PredictionPathFromRoot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class PredictionPathFromRoot {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("prediction_probability")
  private Double predictionProbability = null;

  public PredictionPathFromRoot id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PredictionPathFromRoot name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PredictionPathFromRoot predictionProbability(Double predictionProbability) {
    this.predictionProbability = predictionProbability;
    return this;
  }

   /**
   * Get predictionProbability
   * @return predictionProbability
  **/
  @ApiModelProperty(value = "")
  public Double getPredictionProbability() {
    return predictionProbability;
  }

  public void setPredictionProbability(Double predictionProbability) {
    this.predictionProbability = predictionProbability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictionPathFromRoot predictionPathFromRoot = (PredictionPathFromRoot) o;
    return Objects.equals(this.id, predictionPathFromRoot.id) &&
        Objects.equals(this.name, predictionPathFromRoot.name) &&
        Objects.equals(this.predictionProbability, predictionPathFromRoot.predictionProbability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, predictionProbability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictionPathFromRoot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    predictionProbability: ").append(toIndentedString(predictionProbability)).append("\n");
    sb.append("}");
    return sb.toString();
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

