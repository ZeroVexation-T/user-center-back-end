package com.tang.usercenter02.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author tang
 */
@Data
public class UserLoginRequest  implements Serializable {

    @Serial
    private static final long serialVersionUID = -3143519556584485030L;

    private String userAccount;

    private String userPassword;
}
