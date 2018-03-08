package com.github.jerzakm.util;


import com.github.jerzakm.constants.Constant;
import com.github.jerzakm.constants.Method;
import com.github.jerzakm.constants.Param;

import java.util.HashMap;

public class Query {
    private Method method;
    private HashMap<Param,String> params = new HashMap();

    public Query() {}

    public void setMethod(Method method) {
        this.method = method;
    }

    public void addParam(Param param, String value) {
        this.params.put(param, value);
    }

    public String build(String auth){
        String method = this.method.getMethod();
        String param="";
        for(Param a : params.keySet()){
            param+=a.getParam()+"="+params.get(a)+"&";
        }
        return Constant.getTradewatchURL()+method + param+auth;
    }

}
