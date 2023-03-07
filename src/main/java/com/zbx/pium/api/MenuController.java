package com.zbx.pium.api;

import cn.dev33.satoken.stp.StpUtil;
import com.zbx.pium.common.res.Result;
import com.zbx.pium.entity.Menu;
import com.zbx.pium.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zbx
 * @date 2023/3/7
 * @description
 **/
@RequiredArgsConstructor
@RestController
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/userMenu")
    public Result<List<Menu>> getUserMenuList() {
        Integer userId = (Integer) StpUtil.getSession().get("userId");
        List<Menu> menu = menuService.getUserMenuTree(userId, 0);
        return Result.success(menu);
    }
}
