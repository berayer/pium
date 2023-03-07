package com.zbx.pium.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zbx.pium.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【sys_user_role(用户角色表)】的数据库操作Mapper
* @createDate 2023-03-07 14:51:10
* @Entity com.zbx.pium.entity.UserRole
*/
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

}




