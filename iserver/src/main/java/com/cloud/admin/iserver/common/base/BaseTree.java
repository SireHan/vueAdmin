package com.cloud.admin.iserver.common.base;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author 韩炜
 * @date 2019-08-11 16:22
 */
@Data
@MappedSuperclass
public abstract class BaseTree<T> extends BaseEntity implements ITree<T> {

    protected static final long ROOTID = 1;                     //

    @Column(name = "parent_id",nullable = false)
    protected Long parentId;		// 父菜单id

    @Override
    public Long getRootId() {
        return ROOTID;
    }

    @Override
    public Long getParentId() {
        return parentId;
    }
}
