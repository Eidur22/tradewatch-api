package constants;

public enum Param {
    //Enum for Query String builder + short descriptions
    //Standard Parameters for String builder

    //Always required: DATE_FROM, DATE_TO and one of these: CATEGORY_ID,SELLER_ID,PHRASE_INCLUDE

    DATE_FROM("date-from"), //YYYY-MM-DD
    DATE_TO("date-to"), //YYYY-MM-DD
    CATEGORY_ID("category-id"),//Integer
    SELLER_ID("seller-id"),//integer
    ITEM_OPTIONS("item-options"),//integer pole it-options @Allegro WebAPI
    ITEM_OPTIONS_MASK("item-options-mask"),//integer
    PHRASE_INCLUDE("phrase-include"),//String
    PHRASE_EXCLUDE("phrase-exclude"),//String
    TYPE_AUCTION("type-acution"),//bool true-only auctions, false-onlybuy now, default(empty)-all
    STATE_NEW("state-new"),//true - new, false-used, default(empty)-all
    PRICE_MIN("price-min"),//double
    PRICE_MAX("price-max"),//double
    SPECIAL_TIMESTAMP("timestamp"),
    SPECIAL_ITEM_GROUP_QUALIFY("item-group-qualify");//ID,NAME,NAME_AND_PROMOTION - how to group offers

    private final String param;

    Param(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }
}
