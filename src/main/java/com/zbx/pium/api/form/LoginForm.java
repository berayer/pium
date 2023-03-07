package com.zbx.pium.api.form;

import lombok.Data;

/**
 * @author zbx
 * @date 2023/3/7
 * @description
 **/
@Data
public class LoginForm {

    private String username;
    private String password;
    private Boolean rememberMe = false;
}
