package com.zbx.pium.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author zbx
 * @date 2023/3/7
 * @description
 **/
@Data
public class BaseEntity implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField(value = "create_by")
    private String createBy;
    @TableField(value = "create_time")
    private LocalDateTime createTime;
    @TableField(value = "update_by")
    private String updateBy;
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

}
