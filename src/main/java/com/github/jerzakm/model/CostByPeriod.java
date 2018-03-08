package com.github.jerzakm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CostByPeriod {

    @SerializedName("day")
    @Expose
    private Integer day;
    @SerializedName("countPublish")
    @Expose
    private Integer countPublish;
    @SerializedName("costPublish")
    @Expose
    private Double costPublish;
    @SerializedName("countPhoto")
    @Expose
    private Integer countPhoto;
    @SerializedName("costPhoto")
    @Expose
    private Double costPhoto;
    @SerializedName("countMinPrice")
    @Expose
    private Integer countMinPrice;
    @SerializedName("costMinPrice")
    @Expose
    private Double costMinPrice;
    @SerializedName("countPlanned")
    @Expose
    private Integer countPlanned;
    @SerializedName("costPlanned")
    @Expose
    private Double costPlanned;
    @SerializedName("countDuration14Days")
    @Expose
    private Integer countDuration14Days;
    @SerializedName("costDuration14Days")
    @Expose
    private Double costDuration14Days;
    @SerializedName("countBold")
    @Expose
    private Integer countBold;
    @SerializedName("costBold")
    @Expose
    private Double costBold;
    @SerializedName("countHighlight")
    @Expose
    private Integer countHighlight;
    @SerializedName("costHighlight")
    @Expose
    private Double costHighlight;
    @SerializedName("countAward")
    @Expose
    private Integer countAward;
    @SerializedName("costAward")
    @Expose
    private Double costAward;
    @SerializedName("countDivPage")
    @Expose
    private Integer countDivPage;
    @SerializedName("costDivPage")
    @Expose
    private Double costDivPage;
    @SerializedName("soldQuantity")
    @Expose
    private Integer soldQuantity;
    @SerializedName("bidCount")
    @Expose
    private Integer bidCount;
    @SerializedName("soldValue")
    @Expose
    private Double soldValue;
    @SerializedName("costSale")
    @Expose
    private Double costSale;
    @SerializedName("totalPublishCost")
    @Expose
    private Double totalPublishCost;
    @SerializedName("totalCost")
    @Expose
    private Double totalCost;

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getCountPublish() {
        return countPublish;
    }

    public void setCountPublish(Integer countPublish) {
        this.countPublish = countPublish;
    }

    public Double getCostPublish() {
        return costPublish;
    }

    public void setCostPublish(Double costPublish) {
        this.costPublish = costPublish;
    }

    public Integer getCountPhoto() {
        return countPhoto;
    }

    public void setCountPhoto(Integer countPhoto) {
        this.countPhoto = countPhoto;
    }

    public Double getCostPhoto() {
        return costPhoto;
    }

    public void setCostPhoto(Double costPhoto) {
        this.costPhoto = costPhoto;
    }

    public Integer getCountMinPrice() {
        return countMinPrice;
    }

    public void setCountMinPrice(Integer countMinPrice) {
        this.countMinPrice = countMinPrice;
    }

    public Double getCostMinPrice() {
        return costMinPrice;
    }

    public void setCostMinPrice(Double costMinPrice) {
        this.costMinPrice = costMinPrice;
    }

    public Integer getCountPlanned() {
        return countPlanned;
    }

    public void setCountPlanned(Integer countPlanned) {
        this.countPlanned = countPlanned;
    }

    public Double getCostPlanned() {
        return costPlanned;
    }

    public void setCostPlanned(Double costPlanned) {
        this.costPlanned = costPlanned;
    }

    public Integer getCountDuration14Days() {
        return countDuration14Days;
    }

    public void setCountDuration14Days(Integer countDuration14Days) {
        this.countDuration14Days = countDuration14Days;
    }

    public Double getCostDuration14Days() {
        return costDuration14Days;
    }

    public void setCostDuration14Days(Double costDuration14Days) {
        this.costDuration14Days = costDuration14Days;
    }

    public Integer getCountBold() {
        return countBold;
    }

    public void setCountBold(Integer countBold) {
        this.countBold = countBold;
    }

    public Double getCostBold() {
        return costBold;
    }

    public void setCostBold(Double costBold) {
        this.costBold = costBold;
    }

    public Integer getCountHighlight() {
        return countHighlight;
    }

    public void setCountHighlight(Integer countHighlight) {
        this.countHighlight = countHighlight;
    }

    public Double getCostHighlight() {
        return costHighlight;
    }

    public void setCostHighlight(Double costHighlight) {
        this.costHighlight = costHighlight;
    }

    public Integer getCountAward() {
        return countAward;
    }

    public void setCountAward(Integer countAward) {
        this.countAward = countAward;
    }

    public Double getCostAward() {
        return costAward;
    }

    public void setCostAward(Double costAward) {
        this.costAward = costAward;
    }

    public Integer getCountDivPage() {
        return countDivPage;
    }

    public void setCountDivPage(Integer countDivPage) {
        this.countDivPage = countDivPage;
    }

    public Double getCostDivPage() {
        return costDivPage;
    }

    public void setCostDivPage(Double costDivPage) {
        this.costDivPage = costDivPage;
    }

    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public Integer getBidCount() {
        return bidCount;
    }

    public void setBidCount(Integer bidCount) {
        this.bidCount = bidCount;
    }

    public Double getSoldValue() {
        return soldValue;
    }

    public void setSoldValue(Double soldValue) {
        this.soldValue = soldValue;
    }

    public Double getCostSale() {
        return costSale;
    }

    public void setCostSale(Double costSale) {
        this.costSale = costSale;
    }

    public Double getTotalPublishCost() {
        return totalPublishCost;
    }

    public void setTotalPublishCost(Double totalPublishCost) {
        this.totalPublishCost = totalPublishCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("day", day).append("countPublish", countPublish).append("costPublish", costPublish).append("countPhoto", countPhoto).append("costPhoto", costPhoto).append("countMinPrice", countMinPrice).append("costMinPrice", costMinPrice).append("countPlanned", countPlanned).append("costPlanned", costPlanned).append("countDuration14Days", countDuration14Days).append("costDuration14Days", costDuration14Days).append("countBold", countBold).append("costBold", costBold).append("countHighlight", countHighlight).append("costHighlight", costHighlight).append("countAward", countAward).append("costAward", costAward).append("countDivPage", countDivPage).append("costDivPage", costDivPage).append("soldQuantity", soldQuantity).append("bidCount", bidCount).append("soldValue", soldValue).append("costSale", costSale).append("totalPublishCost", totalPublishCost).append("totalCost", totalCost).toString();
    }

}
