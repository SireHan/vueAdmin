package com.cloud.admin.iserver.sys.fallback;

import com.cloud.admin.iserver.sys.entity.SysMenu;
import com.cloud.admin.iserver.sys.service.SysMenuService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 韩炜
 * @date 2019-08-11 16:05
 */
@Component
public class SysMenuFallback implements SysMenuService {
    @Override
    public SysMenu saveSysMenu(SysMenu sysMenu) {
        return null;
    }

    @Override
    public List<SysMenu> findAll(SysMenu sysMenu) {
        return null;
    }

    @Override
    public SysMenu delSysMenu(SysMenu sysMenu) {
        return null;
    }
}
