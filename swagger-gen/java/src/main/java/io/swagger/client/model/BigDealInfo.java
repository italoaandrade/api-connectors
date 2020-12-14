/*
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BigDealInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T14:39:31.513+08:00")
public class BigDealInfo {
  @SerializedName("side")
  private String side = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("value")
  private Integer value = null;

  public BigDealInfo side(String side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public BigDealInfo timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public BigDealInfo symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public BigDealInfo value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigDealInfo bigDealInfo = (BigDealInfo) o;
    return Objects.equals(this.side, bigDealInfo.side) &&
        Objects.equals(this.timestamp, bigDealInfo.timestamp) &&
        Objects.equals(this.symbol, bigDealInfo.symbol) &&
        Objects.equals(this.value, bigDealInfo.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(side, timestamp, symbol, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigDealInfo {\n");
    
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
