package com.cloud.admin.iserver.common.base;

import com.cloud.admin.iserver.common.type.DelType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * Entity支持类
 *
 * @author 韩炜
 * @date 2019-01-15 11:00
 */
@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    public BaseEntity() {
        super();
        this.delFlag = DelType.NORMAL.getValue();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name = "remarks")
    protected String remarks; // 备注

    @Column(name = "create_by",nullable = false)
    protected Long createBy; // 创建者

    @Column(name = "create_date",nullable = false)
    protected Date createDate;// 创建日期

    @Column(name = "update_by")
    protected Long updateBy; // 更新者

    @Column(name = "update_date")
    protected Date updateDate;// 更新日期

    @Column(name = "del_flag",nullable = false)
    protected String delFlag; // 删除标记
}
