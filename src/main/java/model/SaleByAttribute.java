package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SaleByAttribute {

    @SerializedName("value")
    @Expose
    public Double value;
    @SerializedName("quantity")
    @Expose
    public Integer quantity;
    @SerializedName("bids")
    @Expose
    public Integer bids;
    @SerializedName("avgPrice")
    @Expose
    public Double avgPrice;
    @SerializedName("attId")
    @Expose
    public Integer attId;
    @SerializedName("attName")
    @Expose
    public String attName;
    @SerializedName("attValue")
    @Expose
    public String attValue;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).append("quantity", quantity).append("bids", bids).append("avgPrice", avgPrice).append("attId", attId).append("attName", attName).append("attValue", attValue).toString();
    }

}