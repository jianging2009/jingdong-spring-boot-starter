package com.holyw.duoduoke.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * 通用的GoodsVO
 */
@Data
public class GoodsVO {
    private String id;
    private String goodsId; //产品ID-SKU-ID
    private Long cidOne; //类目ID-1
    private String cidNameOne; //类目1名称
    private Long comments;  //评论数
    private Integer sourceType;//'数据来源类型，1京东'
    private BigDecimal commissionRatio;//'佣金比例'
    private Integer couponType;//'优惠券类型 0:全品类，1：限品类（自营），2限店铺3店铺限商品券'
    private BigDecimal couponPrice;//'优惠券价格'
    private String couponLink;//'优惠券链接'
    private BigDecimal couponQuota;//'消费限额'
    private Timestamp couponUseStime;//'券使用开始时间'
    private Timestamp couponUseEtime;//'券使用结束时间'
    private String pic;//'主图'
    private String headPicList;//主图，图片list
    private Long sales;//'销量-30天内'
    private BigDecimal orgPrice;//'原价'
    private BigDecimal price;//'券后价-减掉了优惠券价格'
    private String shopName;//'店铺名称'
    private String title;//'产品名称sku_name'
    private Long total;//'商品数量'
    private String aliasTitle;//'别名 短标题'
    private Timestamp createDate;//'创建时间'
    private Timestamp modifyDate;//'修改时间'
    private Boolean checkCoupon;//是否检测券
    private Timestamp checkCouponTime;//检测时间
    private Boolean toShop;//检测时间
    private Integer hasCollected;//是否收藏
    private Integer sort;//排序

    private Boolean hasMallCoupon;//是否有店铺券
    private Long mallCouponId;//店铺券id
    private Integer mallCouponDiscountPct;//店铺券折扣
    private BigDecimal mallCouponMinOrderAmount;//最小使用金额
    private BigDecimal mallCouponMaxDiscountAmount;//最大使用金额
    private Long mallCouponTotalQuantity;//店铺券总量
    private Long mallCouponRemainQuantity;//店铺券余量
    private Timestamp mallCouponStartTime;//店铺券开始使用时间
    private Timestamp mallCouponEndTime;//店铺券结束使用时间
    private String goodsDesc;//商品描述
    private String goodsThumbnailUrl;//商品缩略图
    private BigDecimal minNormalPrice;//最小单买价格
    private Integer merchantType;//店铺类型，1-个人，2-企业，3-旗舰店，4-专卖店，5-专营店，6-普通店
    private Integer mallCps;//该商品所在店铺是否参与全店推广，0：否，1：是
    private boolean hasCoupon;//是否有优惠券，0：否，1：是
    private BigDecimal goodsEvalScore;//商品评价分
    private Long zsDuoId;//招商团长id
    private String descTxt;//描述分
    private String servTxt;//服务分
    private String lgstTxt;//物流分
    private String listId;
    private String searchId;
    private int isComparison;//拼多多-是否比价（1-是 0-否）
    private String unifiedTags;//优惠标签列表
    private String spreadTxt;//推广文案
    private Integer subType;//'数据来源类型，1-开普勒 默认空-京东'
    private Long shopId;//'店铺ID'
    private Long cidTwo; //类目ID-2
    private Long cidThree; //类目ID-3
    private String cidNameTwo;  //类目1名称
    private String cidNameThree;   //类目1名称
    private Integer couponPlatformType;//'券使用平台，0全平台，1限平台'
    private Timestamp couponGetStime;//'券领取开始时间'
    private Timestamp couponGetEtime;//'券领取结束时间'
    private BigDecimal commentsRatio;//'商品好评率真'
    private String materialUrl;//'商品落地页'
    private Integer isHot;//'是否爆款，1是，0不是'
    private Long spuid;//'同款商品的主sku_id'
    private String brandCode;//'品牌编码'
    private String brandName;//'品牌名称'
    private Integer owner;//'是否自营 ，1自营，0=pop'
    private BigDecimal pinGouPrice;//'拼购价格'
    private Long pinGouCount;//'拼购需要的人数'
    private Timestamp pinGouStime;//'拼购开始时间'
    private Timestamp pinGouEtime;//'拼购结束时间'
    private BigDecimal giftPrice;//礼金面额
    private String giftCouponKey;//礼金ID
    private Integer soldRate;//秒杀进度
    private boolean canBuy;//秒杀进度
    private String playUrl;//视频播放地址

    private String supplierCode;//供应商编码*
    //private Integer owner;//商品类型 1：自营 2：C店 3：海外购自营 4：海外购 5:特卖 6：极物
    private String priceType;//价格类型*
    private String priceType_code;//价格类型编码 0：正常价格，1：大聚惠 ， 2：抢购， 3：渠道专享， 4：限时促销 ，5：爆款抢购，6：掌上抢，7：特卖，99：乐拼购*
    private String baoyou;//是否包邮 0：不包邮 1：包邮*
    private String saleStatus;//是否可售 0:可售，1:无货，2:本地暂不销售*
    private String pgUrl;//拼购四级页地址*
    private String pgActionId;//购活动ID*
    private String activityId;//券活动编码*
    private String activitySecretKey;//券秘钥*
    //private String goodsDesc;//商品描述
    private BigDecimal discount;//商品折扣
    private Timestamp sellTimeFrom;//商品售卖开始时间,时间戳，单位毫秒
    private Timestamp sellTimeTo;//商品售卖结束时间,时间戳, 单位毫秒
    private String storeScore;//店铺评分：保留两位小数 描述分
    //private Integer comments;//评论数
    private String storeRankRate;//店铺同品类排名比例：例如10表示前10%
    private Timestamp schemeStartTime;//商品所属推广方案开始时间：时间戳，单位：毫秒
    private List<String> picList = new ArrayList<>();//业务字段，图片list

    private BigDecimal commission;//自购佣金

    private BigDecimal shareCommission;//分享佣金

    private BigDecimal mcommission;//超级会员佣金

    private boolean newUserEnjoy;//京东-是否新用户专享

    private String navigater;//京东-跳转小程序appId

    private String navigaterValue;//京东-跳转小程序appId

    private String navigaterUrl;//京东-跳转path

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
