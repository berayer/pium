package com.zbx.pium.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zbx.pium.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Administrator
* @description 针对表【sys_menu(前端菜单表)】的数据库操作Mapper
* @createDate 2023-03-07 14:51:10
* @Entity com.zbx.pium.entity.Menu
*/
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> selectUserMenuByPid(@Param("userId") Integer userId,@Param("pid") Integer pid);
}




