package com.holyw.jingdong.vo.jingdong;

public class GoodsInfo {

    private String imageUrl;
    private String owner;
    private Long mainSkuId;
    private Long productId;
    private String shopName;
    private Long shopId;


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getMainSkuId() {
        return mainSkuId;
    }

    public void setMainSkuId(Long mainSkuId) {
        this.mainSkuId = mainSkuId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}
