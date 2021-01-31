package com.holyw.jingdong.request.jingdong;

import java.io.Serializable;

public class OrderRowReq  implements Serializable {
    private Integer pageIndex;
    private Integer pageSize;
    private Integer type;
    private String startTime;
    private String endTime;
    private Long childUnionId;
    private String key;
    private String fields;

    public OrderRowReq() {
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Long getChildUnionId() {
        return childUnionId;
    }

    public void setChildUnionId(Long childUnionId) {
        this.childUnionId = childUnionId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }
}