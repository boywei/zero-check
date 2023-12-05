package com.ecnu.zero.common.util;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class CheckUtils {

    public static Boolean isEmptyId(Integer id) {
        return id == null || id <= 0;
    }

    public static Boolean isNotEmptyId(Integer id) {
        return !isEmptyId(id);
    }

    public static Boolean anyEmptyIds(Integer... ids) {
        if (Objects.isNull(ids) || ids.length == 0) {
            return false;
        }
        return Arrays.stream(ids).anyMatch(CheckUtils::isEmptyId);
    }

    public static Boolean anyEmptyIds(Collection<Integer> ids) {
        if (Objects.isNull(ids) || CollectionUtils.isEmpty(ids)) {
            return false;
        }
        return ids.stream().anyMatch(CheckUtils::isEmptyId);
    }
}
