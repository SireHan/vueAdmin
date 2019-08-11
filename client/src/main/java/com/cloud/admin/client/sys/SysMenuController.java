package com.cloud.admin.client.sys;

import com.cloud.admin.iserver.common.type.JudgeType;
import com.cloud.admin.iserver.common.type.NodeType;
import com.cloud.admin.iserver.common.type.StatusType;
import com.cloud.admin.iserver.sys.entity.SysMenu;
import com.cloud.admin.iserver.sys.service.SysMenuService;
import com.cloud.admin.iserver.test.IServerTest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * @author 韩炜
 * @date 2019-08-10 17:03
 */
@RestController
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    public String fallback(){
        return "容错数据";
    }

    @RequestMapping(value = "/addSysMenu")
    public SysMenu addSysMenu(){
        SysMenu sysMenu = new SysMenu();
        sysMenu.setMenuCode("000");
        sysMenu.setIfShow(JudgeType.YES.getValue());
        sysMenu.setMenuName("菜单");
        sysMenu.setMenuStatus(StatusType.ENABLE.getValue());
        sysMenu.setNodeType(NodeType.NOLEAF.getValue());
        sysMenu.setParentId(0L);
        sysMenu.setParentIds(",0,");
        sysMenu.setCreateBy(1L);
        sysMenu.setCreateDate(new Date());
        return sysMenuService.saveSysMenu(sysMenu);
    }
}
