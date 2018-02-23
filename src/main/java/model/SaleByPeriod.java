package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SaleByPeriod {

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
    @SerializedName("date")
    @Expose
    public Integer date;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).append("quantity", quantity).append("bids", bids).append("avgPrice", avgPrice).append("date", date).toString();
    }

}