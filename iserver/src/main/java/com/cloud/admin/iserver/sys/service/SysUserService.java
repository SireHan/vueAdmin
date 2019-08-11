package com.cloud.admin.iserver.sys.service;

import com.cloud.admin.iserver.sys.entity.SysMenu;
import com.cloud.admin.iserver.sys.fallback.SysUserFallback;
import com.cloud.admin.iserver.sys.vo.SysUserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 韩炜
 * @date 2019-08-11 16:00
 */
@FeignClient(name = "server",fallback = SysUserFallback.class,contextId = "sysUserService")
public interface SysUserService {

    /**
     * 新增用户信息
     * @param sysUserInfo
     * @return
     *//*
    @RequestMapping(value = "addUserInfo")
    SysUserInfo addUserInfo(@RequestParam("sysUserInfo") SysUserInfo sysUserInfo);

    *//**
     * 修改用户信息
     * @param sysUserInfo
     * @return
     *//*
    @RequestMapping(value = "addUserInfo")
    SysUserInfo updateUserInfo(@RequestParam("sysUserInfo") SysUserInfo sysUserInfo);

    *//**
     * 删除用户信息
     * @param sysUserInfo
     * @return
     *//*
    @RequestMapping(value = "addUserInfo")
    SysUserInfo delUserInfo(@RequestParam("sysUserInfo") SysUserInfo sysUserInfo);*/
}
