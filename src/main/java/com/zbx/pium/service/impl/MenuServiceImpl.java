package com.zbx.pium.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zbx.pium.entity.Menu;
import com.zbx.pium.mapper.MenuMapper;
import com.zbx.pium.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Administrator
* @description 针对表【sys_menu(前端菜单表)】的数据库操作Service实现
* @createDate 2023-03-07 14:51:10
*/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService{

    @Override
    public List<Menu> getUserMenuTree(Integer userId, Integer pid) {
        List<Menu> menus = baseMapper.selectUserMenuByPid(userId, pid);
        menus.forEach(item -> {
            List<Menu> children = getUserMenuTree(userId, item.getId());
            if (ObjectUtil.isNotEmpty(children)) item.setChildren(children);
        });
        return menus;
    }

}




