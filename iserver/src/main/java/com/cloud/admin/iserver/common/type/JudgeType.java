package com.cloud.admin.iserver.common.type;

/**
 * @author 韩炜
 * @date 2019-08-11 16:29
 */
public enum JudgeType {

    YES("1",true),
    NO("0",false);

    private String value;
    private boolean lable;

    private JudgeType(String value, boolean lable) {
        this.lable = lable;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isLable() {
        return lable;
    }
}
