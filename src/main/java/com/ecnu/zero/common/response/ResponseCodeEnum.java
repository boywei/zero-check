package com.ecnu.zero.common.response;

import lombok.Getter;

@Getter
public enum ResponseCodeEnum {
    /**
     * 访问成功
     */
    SUCCESS(200),
    /**
     * 请求参数错误
     */
    BAD_REQUEST(400),
    /**
     * 未登录
     */
    NOT_LOGIN(401),
    /**
     * 无权限
     */
    UNAUTHORIZED(402),
    /**
     * 禁止访问
     */
    FORBIDDEN(403),
    /**
     * 无法找到
     */
    NOT_FOUND(404),
    /**
     * 发生未知错误
     */
    INTERNAL_SERVER_ERROR(500);

    /**
     * 状态码
     */
    private final Integer code;

    ResponseCodeEnum(Integer code) {
        this.code = code;
    }

}