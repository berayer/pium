package com.zbx.pium.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zbx.pium.entity.Role;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【sys_role(系统角色表)】的数据库操作Mapper
* @createDate 2023-03-07 14:51:10
* @Entity com.zbx.pium.entity.Role
*/
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}




