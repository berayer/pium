package com.zbx.pium.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zbx.pium.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【sys_user(系统用户表)】的数据库操作Mapper
* @createDate 2023-03-07 14:51:10
* @Entity com.zbx.pium.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




