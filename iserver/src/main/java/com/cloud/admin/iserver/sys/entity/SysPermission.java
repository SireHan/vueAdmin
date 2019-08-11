/**
 *  该类由generator 自动生成
 * Copyright &copy; 2017-2018 All rights reserved.
 */
package com.cloud.admin.iserver.sys.entity;

import com.cloud.admin.iserver.common.base.BaseTree;
import com.cloud.admin.iserver.common.base.Tree;
import com.cloud.admin.iserver.common.type.NodeType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * 系统-权限表Entity
 * @author hanwei
 * @version 2019-06-28
 */
@Data
@Entity(name = "sys_permission")
public class SysPermission extends BaseTree<SysPermission> {

    public static final String ROOT = "root";                         // 根权限类型
    public static final String MENU = "menu";                         // 菜单权限类型
    public static final String BUTTON = "button";                    // 按钮权限类型
    public static final String DATA = "data";                         // 数据权限类型

    @Column(name = "parent_ids",nullable = false)
    private String parentIds;                                           // 上级权限ids

    @Column(name = "permission_type",nullable = false)
    private String permissionType;                                      // 权限类型

    @Column(name = "permission_name",nullable = false)
    private String permissionName;                                      // 权限名称

    @Column(name = "url")
    private String url;                                                   // 权限标识 （菜单URL 其他为权限标识）

    @Column(name = "relate_id")
    private Long relateId;                                               // 相关id   （菜单menuId 其他为空）

    @Column(name = "node_type",nullable = false)
    private String nodeType;                                             // 节点类型

    @ManyToMany(mappedBy = "sysPermissionList")
    private List<SysRole> sysRoleList;

    @Override
    public Tree<SysPermission> transTree() {
        Tree tree = new Tree();
        tree.label = this.permissionName;
        tree.value = id + "";
        tree.node = this;
        // 有子菜单
        if (NodeType.NOLEAF.getValue().equals(this.nodeType)) {
            tree.loading = false;
            tree.children = new ArrayList<>();
        }
        return tree;
    }
}
