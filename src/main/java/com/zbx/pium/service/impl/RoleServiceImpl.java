package com.zbx.pium.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zbx.pium.entity.Role;
import com.zbx.pium.mapper.RoleMapper;
import com.zbx.pium.service.RoleService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【sys_role(系统角色表)】的数据库操作Service实现
* @createDate 2023-03-07 14:51:10
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




