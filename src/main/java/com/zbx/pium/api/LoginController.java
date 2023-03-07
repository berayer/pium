package com.zbx.pium.api;

import cn.dev33.satoken.stp.StpUtil;
import com.zbx.pium.api.form.LoginForm;
import com.zbx.pium.common.res.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zbx
 * @date 2023/3/7
 * @description
 **/
@RestController
@Slf4j
public class LoginController {

    @PostMapping("/login")
    public Result<String> login(@RequestBody LoginForm loginForm) {
        log.info("用户请求登陆: {}", loginForm);
        if (loginForm.getUsername().equals("admin")) {
            StpUtil.login(loginForm.getUsername(), loginForm.getRememberMe());
            StpUtil.getSession().set("userId", 1);
            return Result.success();
        } else {
            return Result.failed("用户错误");
        }
    }

}
