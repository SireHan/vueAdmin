package com.cloud.admin.server.sys.impl;

import com.cloud.admin.iserver.sys.entity.SysLogin;
import com.cloud.admin.iserver.sys.entity.SysMenu;
import com.cloud.admin.iserver.sys.service.SysUserService;
import com.cloud.admin.iserver.sys.vo.SysUserInfo;
import com.cloud.admin.server.sys.repository.SysLoginRepository;
import com.cloud.admin.server.sys.repository.SysRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

/**
 * @author 韩炜
 * @date 2019-08-11 16:05
 */
@RestController
@Transactional
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysLoginRepository sysLoginRepository;

    @Autowired
    private SysRoleRepository sysRoleRepository;

    /*@Override
    public SysUserInfo addUserInfo(SysUserInfo sysUserInfo) {
        sysLoginRepository.saveAndFlush(sysUserInfo.getSysLogin());

        return null;
    }*/

}
