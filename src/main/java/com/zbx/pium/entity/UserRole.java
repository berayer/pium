package com.zbx.pium.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zbx.pium.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 用户角色表
 * @TableName sys_user_role
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value ="sys_user_role")
@Data
public class UserRole extends BaseEntity {

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 角色id
     */
    @TableField(value = "role_id")
    private Integer roleId;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}