package com.zbx.pium.config.saToken;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.json.JSONUtil;
import com.zbx.pium.common.res.Result;
import com.zbx.pium.common.res.Status;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zbx
 * @date 2023/3/7
 * @description
 **/
@Component
public class SaTokenConfigure implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) throws NotLoginException {
        // 注册 Sa-Token 拦截器，定义详细认证规则
        registry.addInterceptor(new SaInterceptor(handler -> {
                    try {
                        StpUtil.checkLogin();
                    } catch (NotLoginException e) {
                        Result<String> result = Result.ofStatus(Status.USER_NOT_LOGIN);
                        SaRouter.back(JSONUtil.toJsonStr(result));
                    }
                })).addPathPatterns("/**")
                .excludePathPatterns("/login", "/error");
    }
}
