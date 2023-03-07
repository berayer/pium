package com.zbx.pium.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zbx.pium.entity.Menu;

import java.util.List;

/**
* @author Administrator
* @description 针对表【sys_menu(前端菜单表)】的数据库操作Service
* @createDate 2023-03-07 14:51:10
*/
public interface MenuService extends IService<Menu> {

    List<Menu> getUserMenuTree(Integer userId, Integer pid);
}
