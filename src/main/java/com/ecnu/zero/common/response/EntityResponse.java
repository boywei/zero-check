package com.ecnu.zero.common.response;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(callSuper = true)
@Getter
@Setter
public class EntityResponse<T> extends AbstractResponse {
    private T data;

    public EntityResponse(ResponseCodeEnum code, String message, T data) {
        super(code, message);
        this.data = data;
    }


}
