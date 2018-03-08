package com.github.jerzakm.constants;

public enum Method {

    //Enum for Query String builder + short descriptions
    //Methods
    SALE_BY_PERIOD("sale/by-period?"),
    SALE_BY_ITEM_GROUP("sale/by-item-group?"),
    SALE_BY_CATEGORY("sale/by-category?"),
    SALE_BY_SELLER("sale/by-seller?"),
    SALE_BY_PRICE("sale/by-price?"),
    SALE_BY_HOUR("sale/by-hour?"),
    SALE_BY_ATTRIBUTE("sale/by-att?"),
    SALE_BY_KEYWORD("sale/by-keyword?"),
    AUCTION_ENDING("auction/ending?"),
    AUCTION_LASTING("auction/lasting?"),
    COST_BY_PERIOD("cost/by-period?"),
    ACCOUNT_REQUEST_STATS("account/request-stats?");

    private final String method;

    Method(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
