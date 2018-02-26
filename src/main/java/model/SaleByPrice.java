package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SaleByPrice {

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
    @SerializedName("priceLo")
    @Expose
    private Double priceLo;
    @SerializedName("priceHi")
    @Expose
    private Double priceHi;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getBids() {
        return bids;
    }

    public void setBids(Integer bids) {
        this.bids = bids;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Double getPriceLo() {
        return priceLo;
    }

    public void setPriceLo(Double priceLo) {
        this.priceLo = priceLo;
    }

    public Double getPriceHi() {
        return priceHi;
    }

    public void setPriceHi(Double priceHi) {
        this.priceHi = priceHi;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).append("quantity", quantity).append("bids", bids).append("avgPrice", avgPrice).append("priceLo", priceLo).append("priceHi", priceHi).toString();
    }

}