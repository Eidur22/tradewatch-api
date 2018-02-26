package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SaleByAttribute {

    @SerializedName("value")
    @Expose
    private Double value;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("bids")
    @Expose
    private Integer bids;
    @SerializedName("avgPrice")
    @Expose
    private Double avgPrice;
    @SerializedName("attId")
    @Expose
    private Integer attId;
    @SerializedName("attName")
    @Expose
    private String attName;
    @SerializedName("attValue")
    @Expose
    private String attValue;

    private Double getValue() {
        return value;
    }

    private void setValue(Double value) {
        this.value = value;
    }

    private Integer getQuantity() {
        return quantity;
    }

    private void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    private Integer getBids() {
        return bids;
    }

    private void setBids(Integer bids) {
        this.bids = bids;
    }

    private Double getAvgPrice() {
        return avgPrice;
    }

    private void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    private Integer getAttId() {
        return attId;
    }

    private void setAttId(Integer attId) {
        this.attId = attId;
    }

    private String getAttName() {
        return attName;
    }

    private void setAttName(String attName) {
        this.attName = attName;
    }

    private String getAttValue() {
        return attValue;
    }

    private void setAttValue(String attValue) {
        this.attValue = attValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).append("quantity", quantity).append("bids", bids).append("avgPrice", avgPrice).append("attId", attId).append("attName", attName).append("attValue", attValue).toString();
    }

}