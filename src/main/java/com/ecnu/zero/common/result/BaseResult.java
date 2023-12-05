package com.ecnu.zero.common.result;

import lombok.AllArgsConstructor;

/**
 * BaseResult 用于检验http请求的参数param, 检验函数返回一个BaseResult
 * 然后controller函数在根据BaseResult.isRight来检查参数是否正确, 以进行下一步
 */
@AllArgsConstructor
public class BaseResult {

    public static final BaseResult SUCCESS =  new BaseResult(true, "SUCCESS");

    private final Boolean isRight;

    private final String message;

    public Boolean isRight() {
        return this.isRight;
    }

    public String getMessage() {
        return this.message;
    }

    public static BaseResult error(String message) {
        return new BaseResult(false, message);
    }
}
