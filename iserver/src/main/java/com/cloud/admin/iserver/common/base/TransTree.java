package com.cloud.admin.iserver.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * JOPO 对象转换成Tree 所要实现的接口
 *
 * @author 韩炜
 * @date 2019-01-22 17:19
 */
public interface TransTree<T> extends Serializable {
    Tree<T> transTree();

    static <T> Tree transTree(ITree parent, List<? extends ITree> dataList) {
        // parent == null 查找根节点 系统只有一个菜单的根级目录
        if (parent == null) {
            ITree root = null;
            for (ITree data : dataList) {
                if (data.getId().equals(data.getRootId())) {
                    root = data;
                    break;
                }
            }
            if (root != null) {
                Tree tree = root.transTree();
                if (tree.children == null) {
                    return tree;
                } else {
                    Tree children = transTree(root, dataList);
                    if (children != null) {
                        tree.children = children.children;
                    }
                    return tree;
                }
            }
            return null;
        } else {
            Tree tree = parent.transTree();
            List<Tree> children = null;
            for (ITree data : dataList) {
                if (data.getParentId().equals(parent.getId())) {
                    if (children == null) {
                        children = new ArrayList<>();
                    }
                    Tree childTree = data.transTree();
                    if (childTree.children != null) {
                        Tree child = transTree(data, dataList);
                        if (child != null) {
                            childTree.children = child.children;
                        }
                    }
                    children.add(childTree);
                }
            }
            tree.children = children;
            return tree;
        }
    }
}
