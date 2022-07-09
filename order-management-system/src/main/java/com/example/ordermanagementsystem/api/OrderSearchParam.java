package com.example.ordermanagementsystem.api;

public enum OrderSearchParam {
    DATE,
    CUSTOMER,
    PRODUCT_NAME,
    PRODUCT_SKU;

    public static OrderSearchParam from(String key) {
        for(var val : OrderSearchParam.values()) {
            return val;
        }
        return null;
    }
}
