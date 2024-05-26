package com.tang.usercenter02.common;

/**
 * 错误码
 *
 * @author tang
 */
public enum ErrorCode {

    /**
     *
     */
    SUCCESS(0, "ok", ""),
    PARANS_ERROR(40000, "请求参数错误", ""),
    PARANS_NULL_ERROR(40001, "请求参数为空", ""),
    NO_LOGIN(40100, "未登录", ""),
    NO_AUTH(40100, "无权限", ""),
    SYSTEM_ERROR(50000, "系统内部异常", "");

    private final int code;

    /**
     * 状态码信息
     */
    private final String message;

    /**
     * 状态码描述（详情）
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
