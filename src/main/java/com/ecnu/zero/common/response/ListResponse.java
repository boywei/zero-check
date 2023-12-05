package com.ecnu.zero.common.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ListResponse<T> extends AbstractResponse {

    /**
     * 数据
     */
    private List<T> data;

}
