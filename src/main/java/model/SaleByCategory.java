package model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SaleByCategory {

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
    @SerializedName("path")
    @Expose
    public List<Path> path = null;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).append("quantity", quantity).append("bids", bids).append("avgPrice", avgPrice).append("path", path).toString();
    }

}