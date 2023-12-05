package com.ecnu.zero.common.response;

import com.ecnu.zero.common.constant.BaseConstant;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BaseResponse extends AbstractResponse {
    private static final BaseResponse SUCCESS = new BaseResponse(ResponseCodeEnum.SUCCESS, BaseConstant.SUCCESS);
    private static final BaseResponse FAIL = new BaseResponse(ResponseCodeEnum.INTERNAL_SERVER_ERROR, BaseConstant.ERROR);

    public BaseResponse(ResponseCodeEnum code, String message) {
        super(code, message);
    }

    public static BaseResponse success() {
        return SUCCESS;
    }

    public static BaseResponse fail() {
        return FAIL;
    }
}
