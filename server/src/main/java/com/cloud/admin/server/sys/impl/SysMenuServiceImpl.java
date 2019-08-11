package com.cloud.admin.server.sys.impl;

import com.cloud.admin.iserver.sys.entity.SysMenu;
import com.cloud.admin.iserver.sys.service.SysMenuService;
import com.cloud.admin.server.sys.repository.SysMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author 韩炜
 * @date 2019-08-11 16:05
 */
@RestController
@Transactional
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuRepository sysMenuRepository;

    @Override
    public SysMenu saveSysMenu(@RequestBody SysMenu sysMenu) {
        return sysMenuRepository.saveAndFlush(sysMenu);
    }

    @Override
    public List<SysMenu> findAll(SysMenu sysMenu) {
        return sysMenuRepository.findAll();
    }

    @Override
    public SysMenu delSysMenu(SysMenu sysMenu) {
        return null;
    }
}
