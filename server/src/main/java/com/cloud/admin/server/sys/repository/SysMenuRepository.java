package com.cloud.admin.server.sys.repository;

import com.cloud.admin.iserver.sys.entity.SysLogin;
import com.cloud.admin.iserver.sys.entity.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 韩炜
 * @date 2019-08-11 16:02
 */
public interface SysMenuRepository extends JpaRepository<SysMenu,Long> {
}
