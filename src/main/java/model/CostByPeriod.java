package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CostByPeriod {

    @SerializedName("day")
    @Expose
    public Integer day;
    @SerializedName("countPublish")
    @Expose
    public Integer countPublish;
    @SerializedName("costPublish")
    @Expose
    public Double costPublish;
    @SerializedName("countPhoto")
    @Expose
    public Integer countPhoto;
    @SerializedName("costPhoto")
    @Expose
    public Double costPhoto;
    @SerializedName("countMinPrice")
    @Expose
    public Integer countMinPrice;
    @SerializedName("costMinPrice")
    @Expose
    public Double costMinPrice;
    @SerializedName("countPlanned")
    @Expose
    public Integer countPlanned;
    @SerializedName("costPlanned")
    @Expose
    public Double costPlanned;
    @SerializedName("countDuration14Days")
    @Expose
    public Integer countDuration14Days;
    @SerializedName("costDuration14Days")
    @Expose
    public Double costDuration14Days;
    @SerializedName("countBold")
    @Expose
    public Integer countBold;
    @SerializedName("costBold")
    @Expose
    public Double costBold;
    @SerializedName("countHighlight")
    @Expose
    public Integer countHighlight;
    @SerializedName("costHighlight")
    @Expose
    public Double costHighlight;
    @SerializedName("countAward")
    @Expose
    public Integer countAward;
    @SerializedName("costAward")
    @Expose
    public Double costAward;
    @SerializedName("countDivPage")
    @Expose
    public Integer countDivPage;
    @SerializedName("costDivPage")
    @Expose
    public Double costDivPage;
    @SerializedName("soldQuantity")
    @Expose
    public Integer soldQuantity;
    @SerializedName("bidCount")
    @Expose
    public Integer bidCount;
    @SerializedName("soldValue")
    @Expose
    public Double soldValue;
    @SerializedName("costSale")
    @Expose
    public Double costSale;
    @SerializedName("totalPublishCost")
    @Expose
    public Double totalPublishCost;
    @SerializedName("totalCost")
    @Expose
    public Double totalCost;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("day", day).append("countPublish", countPublish).append("costPublish", costPublish).append("countPhoto", countPhoto).append("costPhoto", costPhoto).append("countMinPrice", countMinPrice).append("costMinPrice", costMinPrice).append("countPlanned", countPlanned).append("costPlanned", costPlanned).append("countDuration14Days", countDuration14Days).append("costDuration14Days", costDuration14Days).append("countBold", countBold).append("costBold", costBold).append("countHighlight", countHighlight).append("costHighlight", costHighlight).append("countAward", countAward).append("costAward", costAward).append("countDivPage", countDivPage).append("costDivPage", costDivPage).append("soldQuantity", soldQuantity).append("bidCount", bidCount).append("soldValue", soldValue).append("costSale", costSale).append("totalPublishCost", totalPublishCost).append("totalCost", totalCost).toString();
    }

}
