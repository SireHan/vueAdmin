package com.cloud.admin.iserver.common.type;

/**
 * @author 韩炜
 * @date 2019-08-11 16:29
 */
public enum UserType {

    ADMIN("1","admin"),
    USER("2","user");

    private String value;
    private String lable;

    private UserType(String value, String lable) {
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
