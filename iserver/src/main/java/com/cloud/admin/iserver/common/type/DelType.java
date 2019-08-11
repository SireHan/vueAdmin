package com.cloud.admin.iserver.common.type;

/**
 * @author 韩炜
 * @date 2019-08-11 16:29
 */
public enum DelType {
    NORMAL("0","normal"),
    DELETE("1","delete"),
    AUDIT("2","audit");

    private String value;
    private String lable;

    private DelType(String value, String lable) {
        this.lable = lable;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getLable() {
        return lable;
    }
}
