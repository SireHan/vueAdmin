package com.cloud.admin.iserver.common.type;

/**
 * @author 韩炜
 * @date 2019-08-11 16:29
 */
public enum StatusType {

    ENABLE("0","enable"),
    DISABLE("1","disable");

    private String value;
    private String lable;

    private StatusType(String value, String lable) {
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
