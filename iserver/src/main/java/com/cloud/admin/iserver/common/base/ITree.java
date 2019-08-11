package com.cloud.admin.iserver.common.base;

import com.cloud.admin.iserver.common.base.TransTree;

/**
 * @author 韩炜
 * @date 2019-07-03 10:59
 */
public interface ITree<T> extends TransTree<T> {

    abstract Long getRootId();
    abstract Long getParentId();
    abstract Long getId();
}
