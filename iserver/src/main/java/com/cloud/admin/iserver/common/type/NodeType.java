package com.cloud.admin.iserver.common.type;

/**
 * @author 韩炜
 * @date 2019-08-11 16:29
 */
public enum NodeType {
    NOLEAF("1","noleaf"),      // 菜单（含有子节点）
    LEAF("2","leaf");           // 菜单（不含有子节点）

    private String value;
    private String lable;

    private NodeType(String value, String lable) {
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
