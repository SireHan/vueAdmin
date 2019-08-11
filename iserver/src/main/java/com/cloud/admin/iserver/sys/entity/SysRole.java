/**
 *  该类由generator 自动生成
 * Copyright &copy; 2017-2018 All rights reserved.
 */
package com.cloud.admin.iserver.sys.entity;

import com.cloud.admin.iserver.common.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 系统-角色表Entity
 * @author hanwei
 * @version 2019-06-28
 */
@Data
@Entity(name = "sys_role")
public class SysRole extends BaseEntity {

	public static final String ADMIN = "admin";          // 超级账户角色

	@Column(name = "role_name",unique = true,nullable = false)
	private String roleName;		// 角色名称

	@Column(name = "role_ename")
	private String roleEname;		// 英文名称

	@Column(name = "role_type",nullable = false)
	private String roleType;		// 角色类型

	@Column(name = "role_status",nullable = false)
	private String roleStatus;		// 角色状态

	@ManyToMany(mappedBy = "sysRoleList")
	private List<SysLogin> sysLoginList;//账户列表

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "sys_role_permission", joinColumns = @JoinColumn(name = "role_id"),
		inverseJoinColumns = @JoinColumn(name = "permission_id"))
	private List<SysPermission> sysPermissionList;//权限列表

}
