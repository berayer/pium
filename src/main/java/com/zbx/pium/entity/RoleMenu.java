package com.zbx.pium.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zbx.pium.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * 角色菜单表
 * @TableName sys_role_menu
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value ="sys_role_menu")
@Data
public class RoleMenu extends BaseEntity implements Serializable {

    /**
     * 角色id
     */
    @TableField(value = "role_id")
    private Integer roleId;

    /**
     * 菜单id
     */
    @TableField(value = "menu_id")
    private Integer menuId;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}