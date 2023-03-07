package com.zbx.pium.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zbx.pium.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 前端菜单表
 * @TableName sys_menu
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value ="sys_menu")
@Data
public class Menu extends BaseEntity implements Serializable {

    /**
     * 父id
     */
    @TableField(value = "pid")
    private Integer pid;

    /**
     * 菜单路径
     */
    @TableField(value = "path")
    private String path;

    /**
     * 菜单标题
     */
    @TableField(value = "label")
    private String label;

    /**
     * 菜单图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 子菜单
     */
    @TableField(exist = false)
    private List<Menu> children;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}