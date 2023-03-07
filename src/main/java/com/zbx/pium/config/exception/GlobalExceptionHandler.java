package com.zbx.pium.config.exception;

import cn.dev33.satoken.exception.SaTokenException;
import com.zbx.pium.common.res.Result;
import com.zbx.pium.common.res.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zbx
 * @date 2023/3/7
 * @description
 **/
@Slf4j
@RestControllerAdvice
@Configuration
public class GlobalExceptionHandler {

    @ExceptionHandler(SaTokenException.class)
    public Result<String> handlerException(SaTokenException e) {
        log.warn("发生未SaToken异常: {}", e.getMessage());
        return Result.ofStatus(Status.USER_NOT_LOGIN, e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result<String> handlerException(Exception e) {
        log.warn("发生未处理异常: {}", e.getMessage());
        return Result.ofStatus(Status.ERROR, e.getMessage());
    }

}
