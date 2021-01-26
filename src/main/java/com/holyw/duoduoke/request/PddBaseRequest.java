package com.holyw.duoduoke.request;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public interface PddBaseRequest {
    String positionId = "1";

    default String setDefaultPId() {
        return positionId;
    }

    default String setDefaultPId(String pId) {
        if (StringUtils.isEmpty(pId)) {
            return positionId;
        } else {
            return pId;
        }
    }

    default List<String> setDefaultPIdList() {
        return (Arrays.asList(positionId));
    }

    default List<String> setDefaultPIdList(String pId) {
        if (StringUtils.isEmpty(pId)) {
            pId = positionId;
        }
        return (Arrays.asList(pId));
    }

    default List<Long> setDefaultPIdList(List<Long> goodsIdList) {
        return goodsIdList;
    }

    default Integer setDefaultPageSize(Integer pageSize) {
        if (!StringUtils.isEmpty(pageSize)) {
            pageSize = pageSize < 10 ? 10 : pageSize;
            return pageSize;
        }
        return pageSize;
    }
}
