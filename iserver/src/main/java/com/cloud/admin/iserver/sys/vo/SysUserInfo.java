package com.cloud.admin.iserver.sys.vo;

import com.cloud.admin.iserver.sys.entity.SysLogin;
import com.cloud.admin.iserver.sys.entity.SysMenu;
import com.cloud.admin.iserver.sys.entity.SysRole;
import com.cloud.admin.iserver.sys.entity.SysUser;
import lombok.Data;

import java.util.List;

/**
 * @author 韩炜
 * @date 2019-08-11 16:10
 */
@Data
public class SysUserInfo {
    private SysLogin sysLogin;
    private List<SysRole> sysRoleList;
    private List<SysMenu> sysMenuList;
}
