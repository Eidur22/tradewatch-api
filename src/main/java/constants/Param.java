package constants;

public enum Param {
    //Enum for Query String builder + short descriptions
    //Standard Parameters for String builder

    //Always required: DATE_FROM, DATE_TO and one of these: CATEGORY_ID,SELLER_ID,PHRASE_INCLUDE

    DATE_FROM("date-from"),
    DATE_TO("date-to"),
    CATEGORY_ID("category-id"),
    SELLER_ID("seller-id"),
    ITEM_OPTIONS("item-options"),
    ITEM_OPTIONS_MASK("item-options-mask"),
    PHRASE_INCLUDE("phrase-include"),
    PHRASE_EXCLUDE("phrase-exclude"),
    TYPE_AUCTION("type-acution"),
    STATE_NEW("state-new"),
    PRICE_MIN("price-min"),
    PRICE_MAX("price-max");

    private final String param;

    Param(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }
}
