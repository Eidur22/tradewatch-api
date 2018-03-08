package com.github.jerzakm;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.github.jerzakm.constants.Method;
import com.github.jerzakm.model.*;
import com.github.jerzakm.util.HashGen;
import com.github.jerzakm.util.Query;

import java.util.List;

public class TradewatchClient {
    private String login;
    private String password;
    private Gson gson;
    private boolean persistentReplies;

    public TradewatchClient(String login, String password) {
        this.login = login;
        this.password = HashGen.stringToMD5(password);
        this.gson = new Gson();
    }

    private String buildAuth(){
        String auth = "auth="+this.login+":"+this.password;
        return auth;
    }

    private String getJson(Query query){
        return HttpClient.GetResponse(query.build(this.buildAuth()));
    }

    public List<AuctionLasting> doGetAuctionLasting(Query query){
        query.setMethod(Method.AUCTION_LASTING);
        //builds query String from Query object and builds auth part on the fly from buildAuth method
        //then, gets json string response from HTTP client
        String json = getJson(query);
        //parses json to object
        List<AuctionLasting> list = this.gson.fromJson(json, new TypeToken<List<AuctionLasting>>(){}.getType());
        return list;
    }

    public List<AuctionEnding> doGetAuctionEnding(Query query){
        query.setMethod(Method.AUCTION_ENDING);
        List<AuctionEnding> list = this.gson.fromJson(getJson(query), new TypeToken<List<AuctionEnding>>(){}.getType());
        return list;
    }

    public List<CostByPeriod> doGetCostByPeriod(Query query){
        query.setMethod(Method.COST_BY_PERIOD);
        List<CostByPeriod> list = this.gson.fromJson(getJson(query), new TypeToken<List<CostByPeriod>>(){}.getType());
        return list;
    }

    public List<SaleByPeriod> doGetSaleByPeriod(Query query){
        query.setMethod(Method.SALE_BY_PERIOD);
        List<SaleByPeriod> list = this.gson.fromJson(getJson(query), new TypeToken<List<SaleByPeriod>>(){}.getType());
        return list;
    }

    public List<SaleByItemGroup> doGetSaleByItemGroup(Query query){
        query.setMethod(Method.SALE_BY_ITEM_GROUP);
        List<SaleByItemGroup> list = this.gson.fromJson(getJson(query), new TypeToken<List<SaleByItemGroup>>(){}.getType());
        return list;
    }

    public List<SaleByCategory> doGetSaleByCategory(Query query){
        query.setMethod(Method.SALE_BY_CATEGORY);
        List<SaleByCategory> list = this.gson.fromJson(getJson(query), new TypeToken<List<SaleByCategory>>(){}.getType());
        return list;
    }

    public List<SaleBySeller> doGetSaleBySeller(Query query){
        query.setMethod(Method.SALE_BY_SELLER);
        List<SaleBySeller> list = this.gson.fromJson(getJson(query), new TypeToken<List<SaleBySeller>>(){}.getType());
        return list;
    }

    public List<SaleByPrice> doGetSaleByPrice(Query query){
        query.setMethod(Method.SALE_BY_PRICE);
        List<SaleByPrice> list = this.gson.fromJson(getJson(query), new TypeToken<List<SaleByPrice>>(){}.getType());
        return list;
    }

    public List<SaleByHour> doGetSaleByHour(Query query){
        query.setMethod(Method.SALE_BY_HOUR);
        List<SaleByHour> list = this.gson.fromJson(getJson(query), new TypeToken<List<SaleByHour>>(){}.getType());
        return list;
    }

    public List<SaleByAttribute> doGetSaleByAttribute(Query query){
        query.setMethod(Method.SALE_BY_ATTRIBUTE);
        List<SaleByAttribute> list = this.gson.fromJson(getJson(query), new TypeToken<List<SaleByAttribute>>(){}.getType());
        return list;
    }

    public List<SaleByKeyword> doGetSaleByKeyword(Query query){
        query.setMethod(Method.SALE_BY_KEYWORD);
        List<SaleByKeyword> list = this.gson.fromJson(getJson(query), new TypeToken<List<SaleByKeyword>>(){}.getType());
        return list;
    }

    public AccountStats doGetAccountStats(){
        Query query = new Query();
        query.setMethod(Method.ACCOUNT_REQUEST_STATS);
        AccountStats response = this.gson.fromJson(getJson(query),new TypeToken<AccountStats>(){}.getType());
        return response;
    }

    //debug method used for getting raw json
    public void jsonGetter(Query query){
        System.out.println(HttpClient.GetResponse(query.build(this.buildAuth())));
    }
}
