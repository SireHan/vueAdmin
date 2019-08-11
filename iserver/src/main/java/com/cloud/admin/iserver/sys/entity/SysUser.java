/**
 *  该类由generator 自动生成
 * Copyright &copy; 2017-2018 All rights reserved.
 */
package com.cloud.admin.iserver.sys.entity;

import com.cloud.admin.iserver.common.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 系统-用户信息表Entity
 * @author hanwei
 * @version 2019-06-28
 */
@Data
@Entity(name = "sys_user")
public class SysUser extends BaseEntity {

	public static final String ADMIN = "admin";          // 超级用户类型

	@Column(name = "user_name",nullable = false)
	private String userName;		// 用户名

	@Column(name = "sex")
	private String sex;		// 性别

	@Column(name = "id_card")
	private String idCard;		// 身份标识

	@Column(name = "user_type",nullable = false)
	private String userType;		// 用户类型

	@Column(name = "user_status")
	private String userStatus;		// 用户状态

	@Column(name = "user_photo")
	private String userPhoto;		// 用户头像

	@Column(name = "json_info")
	private String jsonInfo;		// 其他信息json

	@OneToOne(mappedBy = "sysUser",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private SysLogin sysLogin; //账户信息

}
