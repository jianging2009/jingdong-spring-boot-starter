package com.holyw.duoduoke.request.jingdong;

import java.io.Serializable;

public class OrderRowReq  implements Serializable {
    private Integer pageNo;
    private Integer pageSize;
    private Integer type;
    private String startTime;
    private String endTime;
    private Long childUnionId;
    private String key;

    public OrderRowReq() {
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
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
}