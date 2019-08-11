package com.cloud.admin.iserver.sys.service;

import com.cloud.admin.iserver.sys.entity.SysMenu;
import com.cloud.admin.iserver.sys.fallback.SysMenuFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 韩炜
 * @date 2019-08-11 16:00
 */
@FeignClient(name = "server",fallback = SysMenuFallback.class,contextId = "sysMenuService")
public interface SysMenuService {

    /**
     * 新增菜单
     * @param sysMenu
     * @return
     */
    @RequestMapping(value = "saveSysMenu", method = RequestMethod.POST, consumes = "application/json")
    SysMenu saveSysMenu(@RequestBody SysMenu sysMenu);

    /**
     * 查询菜单
     * @param sysMenu
     * @return
     */
    @RequestMapping(value = "findAll")
    List<SysMenu> findAll(@RequestParam("sysMenu") SysMenu sysMenu);

    /**
     * 删除菜单
     * @param sysMenu
     * @return
     */
    @RequestMapping(value = "delSysMenu")
    SysMenu delSysMenu(@RequestParam("sysMenu") SysMenu sysMenu);
}
