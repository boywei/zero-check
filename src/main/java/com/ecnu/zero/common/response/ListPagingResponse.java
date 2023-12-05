package com.ecnu.zero.common.response;

import com.ecnu.zero.common.constant.BaseConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ListPagingResponse<T> extends AbstractResponse {

    /**
     * 数据
     */
    private List<T> data;

    /**
     * 分页参数, 起始位置
     */
    private Integer start;

    /**
     * 分页参数，每页容量
     */
    private Integer length;

    /**
     * 分页结果，总筛选数量
     */
    private Integer recordsTotal;

    public static final ListPagingResponse EMPTY_SUCCESS = new ListPagingResponse<>(ResponseCodeEnum.SUCCESS, BaseConstant.SUCCESS, Collections.emptyList(), 0, 0, 0);

    public ListPagingResponse(ResponseCodeEnum responseCodeEnum, String message, List<T> data, Integer start, Integer length, Integer recordsTotal) {
        super(responseCodeEnum, message);
        this.data = data;
        this.start = start;
        this.length = length;
        this.recordsTotal = recordsTotal;
    }
}
