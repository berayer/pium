package com.zbx.pium.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zbx.pium.entity.User;
import com.zbx.pium.mapper.UserMapper;
import com.zbx.pium.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【sys_user(系统用户表)】的数据库操作Service实现
* @createDate 2023-03-07 14:51:10
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




