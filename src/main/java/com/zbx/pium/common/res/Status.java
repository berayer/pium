package com.zbx.pium.common.res;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zbx
 * @date 2023/2/25
 * @description
 **/
@Getter
@AllArgsConstructor
public enum Status {
    SUCCESS(200, ""),
    FAILED(400, "客户端错误"),
    ERROR(500, "服务器错误"),
    USER_NOT_LOGIN(401, "用户未登录");

    private final int code;
    private final String msg;
}
