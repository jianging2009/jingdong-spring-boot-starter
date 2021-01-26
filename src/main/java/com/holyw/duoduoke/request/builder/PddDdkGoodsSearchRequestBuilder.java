package com.holyw.duoduoke.request.builder;

import com.pdd.pop.sdk.http.api.pop.request.PddDdkGoodsSearchRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

public class PddDdkGoodsSearchRequestBuilder implements PddBaseRequestBuilder {

    private PddDdkGoodsSearchRequest pddDdkGoodsSearchRequest = new PddDdkGoodsSearchRequest();
    private Integer pageSize;
    private Integer page;
    private String customParameters = "{new:1}";
    private List<Integer> blockCatPackages;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public PddDdkGoodsSearchRequestBuilder(Integer page,Integer pageSize, String pid) {
        this.page = page;
        if (StringUtils.isEmpty(page)) {
            page = 1;
        }
        pddDdkGoodsSearchRequest.setPage(page);
        this.pageSize = pageSize;
        pddDdkGoodsSearchRequest.setPageSize(setDefaultPageSize(pageSize));
        pddDdkGoodsSearchRequest.setPid(setDefaultPId(pid));
        pddDdkGoodsSearchRequest.setCustomParameters(customParameters);
    }

    public PddDdkGoodsSearchRequest build() {
        return pddDdkGoodsSearchRequest;
    }

    public PddDdkGoodsSearchRequestBuilder addCustomParameters(String customParameters) {
        if (!StringUtils.isEmpty(customParameters)) {
            pddDdkGoodsSearchRequest.setCustomParameters(customParameters);
        }
        return this;
    }

    public PddDdkGoodsSearchRequestBuilder addPageSize(Integer pageSize) {
        pddDdkGoodsSearchRequest.setPageSize(setDefaultPageSize(pageSize));
        return this;
    }

    public PddDdkGoodsSearchRequestBuilder addKeyword(String keyword) {
        if (!StringUtils.isEmpty(keyword)) {
            pddDdkGoodsSearchRequest.setKeyword(keyword);
        }
        return this;
    }

    public PddDdkGoodsSearchRequestBuilder addOptId(Long optId) {
        if (!StringUtils.isEmpty(optId)) {
            pddDdkGoodsSearchRequest.setOptId(optId);
        }
        return this;
    }

    public PddDdkGoodsSearchRequestBuilder addSortType(Integer sortType) {
        if (!StringUtils.isEmpty(sortType)) {
            pddDdkGoodsSearchRequest.setSortType(sortType);
        }
        return this;
    }

    public PddDdkGoodsSearchRequestBuilder addWithCoupon(Boolean withCoupon) {
        if (!StringUtils.isEmpty(withCoupon)) {
            pddDdkGoodsSearchRequest.setWithCoupon(withCoupon);
        }
        return this;
    }

    public PddDdkGoodsSearchRequestBuilder addMerchantType(Integer merchantType) {
        if (!StringUtils.isEmpty(merchantType)) {
            pddDdkGoodsSearchRequest.setMerchantType(merchantType);
        }
        return this;
    }

    public PddDdkGoodsSearchRequestBuilder addListId(String listId) {
        if (!StringUtils.isEmpty(listId)) {
            pddDdkGoodsSearchRequest.setListId(listId);
        }
        return this;
    }

    public PddDdkGoodsSearchRequestBuilder addActivityTags(Integer activityTags) {
        if (!StringUtils.isEmpty(activityTags)) {
            pddDdkGoodsSearchRequest.setActivityTags(Arrays.asList(activityTags));
        }
        return this;
    }

    public PddDdkGoodsSearchRequestBuilder addBlockCatPackage(Integer blockCatPackage) {
        if (!StringUtils.isEmpty(blockCatPackage)) {
            if (null == blockCatPackages) {
                blockCatPackages = new ArrayList();
            }
            blockCatPackages.add(blockCatPackage);
            pddDdkGoodsSearchRequest.setBlockCatPackages(blockCatPackages);
        }
        return this;
    }

    public PddDdkGoodsSearchRequestBuilder addRangeList2(Integer commissionRateFrom, Integer commissionRateTo) {
        List rangeList = new ArrayList();
        if (!StringUtils.isEmpty(commissionRateFrom) || !StringUtils.isEmpty(commissionRateTo)) {
            Map commission = new HashMap();
            commission.put("range_id", "2");
            if (!StringUtils.isEmpty(commissionRateFrom)) {
                commission.put("range_from", commissionRateFrom * 10);
            }
            if (!StringUtils.isEmpty(commissionRateTo)) {
                commission.put("range_to", commissionRateTo * 10);
            }
            rangeList.add(commission);
        }

        if (!CollectionUtils.isEmpty(rangeList)) {
            pddDdkGoodsSearchRequest.setRangeList(rangeList);
        }
        return this;
    }


}
