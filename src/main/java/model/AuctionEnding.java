package model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AuctionEnding {

    @SerializedName("id")
    @Expose
    public long id;
    @SerializedName("itemName")
    @Expose
    public String itemName;
    @SerializedName("sellerId")
    @Expose
    public Integer sellerId;
    @SerializedName("sellerName")
    @Expose
    public String sellerName;
    @SerializedName("categoryId")
    @Expose
    public Integer categoryId;
    @SerializedName("categoryPath")
    @Expose
    public List<CategoryPath> categoryPath = null;
    @SerializedName("soldValue")
    @Expose
    public Double soldValue;
    @SerializedName("soldQuantity")
    @Expose
    public Integer soldQuantity;
    @SerializedName("startQuantity")
    @Expose
    public Integer startQuantity;
    @SerializedName("soldQuantity30Days")
    @Expose
    public Integer soldQuantity30Days;
    @SerializedName("soldValue30Days")
    @Expose
    public Double soldValue30Days;
    @SerializedName("bids")
    @Expose
    public Integer bids;
    @SerializedName("buyNowPrice")
    @Expose
    public Double buyNowPrice;
    @SerializedName("costPublish30Days")
    @Expose
    public Double costPublish30Days;
    @SerializedName("costPublishSingle")
    @Expose
    public Double costPublishSingle;
    @SerializedName("costSale")
    @Expose
    public Double costSale;
    @SerializedName("costSalePerItem")
    @Expose
    public Double costSalePerItem;
    @SerializedName("endDate")
    @Expose
    public long endDate;
    @SerializedName("startDate")
    @Expose
    public long startDate;
    @SerializedName("lastTxDate")
    @Expose
    public Object lastTxDate;
    @SerializedName("durationDays")
    @Expose
    public Integer durationDays;
    @SerializedName("hitCount")
    @Expose
    public Integer hitCount;
    @SerializedName("options")
    @Expose
    public Integer options;
    @SerializedName("itemStateNew")
    @Expose
    public Boolean itemStateNew;
    @SerializedName("auction")
    @Expose
    public Boolean auction;
    @SerializedName("itemDwz")
    @Expose
    public Boolean itemDwz;
    @SerializedName("shipLetterEco")
    @Expose
    public Object shipLetterEco;
    @SerializedName("shipLetterFast")
    @Expose
    public Object shipLetterFast;
    @SerializedName("shipPackEco")
    @Expose
    public Object shipPackEco;
    @SerializedName("shipPackFast")
    @Expose
    public Object shipPackFast;
    @SerializedName("shipPackPostpay")
    @Expose
    public Object shipPackPostpay;
    @SerializedName("shipPackPostpayFast")
    @Expose
    public Object shipPackPostpayFast;
    @SerializedName("shipCourier")
    @Expose
    public Object shipCourier;
    @SerializedName("shipCourierPostpay")
    @Expose
    public Object shipCourierPostpay;
    @SerializedName("shipInpost")
    @Expose
    public Object shipInpost;
    @SerializedName("shipInpostPostpay")
    @Expose
    public Object shipInpostPostpay;
    @SerializedName("shipInpostAllegro")
    @Expose
    public Object shipInpostAllegro;
    @SerializedName("shipInpostAllegroPostpay")
    @Expose
    public Object shipInpostAllegroPostpay;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("itemName", itemName).append("sellerId", sellerId).append("sellerName", sellerName).append("categoryId", categoryId).append("categoryPath", categoryPath).append("soldValue", soldValue).append("soldQuantity", soldQuantity).append("startQuantity", startQuantity).append("soldQuantity30Days", soldQuantity30Days).append("soldValue30Days", soldValue30Days).append("bids", bids).append("buyNowPrice", buyNowPrice).append("costPublish30Days", costPublish30Days).append("costPublishSingle", costPublishSingle).append("costSale", costSale).append("costSalePerItem", costSalePerItem).append("endDate", endDate).append("startDate", startDate).append("lastTxDate", lastTxDate).append("durationDays", durationDays).append("hitCount", hitCount).append("options", options).append("itemStateNew", itemStateNew).append("auction", auction).append("itemDwz", itemDwz).append("shipLetterEco", shipLetterEco).append("shipLetterFast", shipLetterFast).append("shipPackEco", shipPackEco).append("shipPackFast", shipPackFast).append("shipPackPostpay", shipPackPostpay).append("shipPackPostpayFast", shipPackPostpayFast).append("shipCourier", shipCourier).append("shipCourierPostpay", shipCourierPostpay).append("shipInpost", shipInpost).append("shipInpostPostpay", shipInpostPostpay).append("shipInpostAllegro", shipInpostAllegro).append("shipInpostAllegroPostpay", shipInpostAllegroPostpay).toString();
    }
}
