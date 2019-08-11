/**
 *  该类由generator 自动生成
 * Copyright &copy; 2017-2018 All rights reserved.
 */
package com.cloud.admin.iserver.sys.entity;

import com.cloud.admin.iserver.common.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 系统-账户信息表Entity
 * @author hanwei
 * @version 2019-06-28
 */
@Data
@Entity(name = "sys_login")
public class SysLogin extends BaseEntity {

	private static final long serialVersionUID = 1L;

	public static final String ADMIN = "admin";          // 超级账户标识

	@Column(name = "login_name",unique = true,nullable = false)
	private String loginName;		// 登录名

	@Column(name = "password",unique = true,nullable = false)
	private String password;		// 密码

	@Column(name = "login_status",nullable = false)
	private String loginStatus;		// 登录状态

	@Column(name = "login_type",nullable = false)
	private String loginType;		// 账户类型

	@Column(name = "phone")
	private String phone;		// 手机号

	@Column(name = "email")
	private String email;		// 邮箱

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id",referencedColumnName = "id")
	private SysUser sysUser;		// 用户信息

	@Column(name = "login_ip")
	private String loginIp;		// 最后一次登录ip

	@Column(name = "login_date")
	private Date loginDate;		// 最后一次登录时间

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "sys_login_role",joinColumns = @JoinColumn(name = "login_id"),
		inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<SysRole> sysRoleList;//角色列表
}