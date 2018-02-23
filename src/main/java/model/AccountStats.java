package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AccountStats {
    @SerializedName("requestCount")
    @Expose
    private Integer requestCount;
    @SerializedName("requestTimeMillis")
    @Expose
    private Integer requestTimeMillis;
    @SerializedName("requestCountLimit")
    @Expose
    private Integer requestCountLimit;
    @SerializedName("requestTimeLimitSeconds")
    @Expose
    private Integer requestTimeLimitSeconds;

    public Integer getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    public Integer getRequestTimeMillis() {
        return requestTimeMillis;
    }

    public void setRequestTimeMillis(Integer requestTimeMillis) {
        this.requestTimeMillis = requestTimeMillis;
    }

    public Integer getRequestCountLimit() {
        return requestCountLimit;
    }

    public void setRequestCountLimit(Integer requestCountLimit) {
        this.requestCountLimit = requestCountLimit;
    }

    public Integer getRequestTimeLimitSeconds() {
        return requestTimeLimitSeconds;
    }

    public void setRequestTimeLimitSeconds(Integer requestTimeLimitSeconds) {
        this.requestTimeLimitSeconds = requestTimeLimitSeconds;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("requestCount", requestCount).append("requestTimeMillis", requestTimeMillis).append("requestCountLimit", requestCountLimit).append("requestTimeLimitSeconds", requestTimeLimitSeconds).toString();
    }

}
