package com.zbx.pium.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zbx.pium.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * 系统角色表
 * @TableName sys_role
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value ="sys_role")
@Data
public class Role extends BaseEntity implements Serializable {

    /**
     * 角色名称
     */
    @TableField(value = "name")
    private String name;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}