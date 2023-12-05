package com.ecnu.zero.controller;

import com.ecnu.zero.common.constant.BaseConstant;
import com.ecnu.zero.common.response.BaseResponse;
import com.ecnu.zero.common.response.EntityResponse;
import com.ecnu.zero.common.response.ResponseCodeEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * 测试接口
 */
@RestController
public class TestController {
    @Value("${project.name}")
    private String name;

    @Value("${project.description}")
    private String description;

    /**
     * 测试成功
     *
     * @apiNote 测试成功
     * @return 成功
     */
    @GetMapping("/success")
    public BaseResponse success() {
        return BaseResponse.success();
    }

    /**
     * 测试失败
     *
     * @apiNote 测试失败
     * @return 失败
     */
    @GetMapping("/fail")
    public BaseResponse fail() {
        return BaseResponse.fail();
    }

    /**
     * 测试get请求
     *
     * @param msg 详细信息
     * @apiNote 测试get请求
     * @return 成功 + 项目描述
     */
    @GetMapping("/get")
    public EntityResponse<String> get(@RequestParam String msg) {
        return new EntityResponse<>(ResponseCodeEnum.SUCCESS, BaseConstant.SUCCESS, name + ": " + description + ": " + msg);
    }

    /**
     * 测试post请求
     *
     * @param msg 详细信息
     * @apiNote 测试post请求
     * @return 成功 + 请求
     */
    @PostMapping("/post")
    public EntityResponse<String> post(@RequestBody String msg) {
        return new EntityResponse<>(ResponseCodeEnum.SUCCESS, BaseConstant.SUCCESS, msg);
    }
}
