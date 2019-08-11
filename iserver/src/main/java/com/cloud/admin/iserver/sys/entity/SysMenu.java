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
import java.util.ArrayList;

/**
 * 系统-菜单表Entity
 * @author hanwei
 * @version 2019-06-28
 */
@Data
@Entity(name = "sys_menu")
public class SysMenu extends BaseTree<SysMenu> {

	@Column(name = "parent_ids",nullable = false)
	private String parentIds;		// 所有上级 ,分隔

	@Column(name = "menu_name",nullable = false)
	private String menuName;		// 菜单名称

	@Column(name = "menu_code",unique = true,nullable = false)
	private String menuCode;		// 菜单代码

	@Column(name = "menu_href")
	private String menuHref;		// 菜单访问路径

	@Column(name = "menu_target")
	private String menuTarget;		// 菜单打开方式

	@Column(name = "menu_icon")
	private String menuIcon;		// 菜单图标

	@Column(name = "menu_status",nullable = false)
	private String menuStatus;		// 菜单状态 启用 禁用

	@Column(name = "if_show",nullable = false)
	private String ifShow;		// 是否显示

	@Column(name = "node_type",nullable = false)
	private String nodeType;		// 节点类型  子节点 非子节点

	@Override
	public Tree<SysMenu> transTree() {
		Tree tree = new Tree();
		tree.label = this.menuName;
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