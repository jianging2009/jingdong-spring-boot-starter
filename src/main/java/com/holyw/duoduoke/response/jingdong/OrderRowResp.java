package com.holyw.duoduoke.response.jingdong;


import com.holyw.duoduoke.vo.jingdong.CategoryInfo;
import com.holyw.duoduoke.vo.jingdong.GoodsInfo;

import java.io.Serializable;

public class OrderRowResp implements Serializable {

    private String id;//标记唯一订单行：订单+sku维度的唯一标识
    private Long orderId;//订单号
    private Long parentId;//父单的订单号：如一个订单拆成多个子订单时，原订单号会作为父单号，拆分的订单号为子单号存储在orderid中。若未发生拆单，该字段为0
    private String orderTime;//下单时间,格式yyyy-MM-dd HH:mm:ss
    private String finishTime;//完成时间（购买用户确认收货时间）,格式yyyy-MM-dd HH:mm:ss
    private String modifyTime;//更新时间,格式yyyy-MM-dd HH:mm:ss
    private Integer orderEmt;//下单设备 1.pc 2.无线
    private Integer plus;//下单用户是否为PLUS会员 0：否，1：是
    private Long unionId;//推客ID
    private Long skuId;//商品ID
    private String skuName;//商品名称
    private Integer skuNum;//商品数量
    private Integer skuReturnNum;//商品已退货数量
    private Integer skuFrozenNum;//商品售后中数量
    private Double price;//商品单价
    private Double commissionRate;//佣金比例(投放的广告主计划比例)
    private Double subSideRate;//分成比例（单位：%）
    private Double subsidyRate;//补贴比例（单位：%）
    private Double finalRate;//最终分佣比例（单位：%）=分成比例+补贴比例
    private Double estimateCosPrice;//预估计佣金额：由订单的实付金额拆分至每个商品的预估计佣金额，不包括运费，以及京券、东券、E卡、余额等虚拟资产支付的金额。该字段仅为预估值，实际佣金以actualCosPrice为准进行计算
    private Double estimateFee;//推客的预估佣金（预估计佣金额*佣金比例*最终比例），如订单完成前发生退款，此金额也会更新。
    private Double actualCosPrice;//实际计算佣金的金额。订单完成后，会将误扣除的运费券金额更正。如订单完成后发生退款，此金额会更新。
    private Double actualFee;//推客分得的实际佣金（实际计佣金额*佣金比例*最终比例）。如订单完成后发生退款，此金额会更新。
    private Integer validCode;//sku维度的有效码（-1：未知,2.无效-拆单,3.无效-取消,4.无效-京东帮帮主订单,5.无效-账号异常,6.无效-赠品类目不返佣,7.无效-校园订单,8.无效-企业订单,9.无效-团购订单,11.无效-乡村推广员下单,13.无效-违规订单,14.无效-来源与备案网址不符,15.待付款,16.已付款,17.已完成（购买用户确认收货）,20.无效-此复购订单对应的首购订单无效,21.无效-云店订单
    private Integer traceType;//同跨店：2同店 3跨店
    private Long positionId;//推广位ID
    private Long siteId;//应用id（网站id、appid、社交媒体id）
    private String unionAlias;//PID所属母账号平台名称（原第三方服务商来源），两方分佣会有该值
    private String pid;//格式:子推客ID_子站长应用ID_子推客推广位ID
    private Long cid1;//一级类目id
    private Long cid2;//二级类目id
    private Long cid3;//三级类目id
    private String subUnionId;//子渠道标识，在转链时可自定义传入，格式要求：字母、数字或下划线，最多支持80个字符(需要联系运营开放白名单才能拿到数据)
    private String unionTag;//联盟标签数据（32位整型二进制字符串：00000000000000000000000000000001。数据从右向左进行，每一位为1表示符合特征，第1位：红包，第2位：组合推广，第3位：拼购，第5位：有效首次购（0000000000011XXX表示有效首购，最终奖励活动结算金额会结合订单状态判断，以联盟后台对应活动效果数据报表https://union.jd.com/active为准）,第8位：复购订单，第9位：礼金，第10位：联盟礼金，第11位：推客礼金，第12位：京喜APP首购，第13位：京喜首购，第14位：京喜复购，第15位：京喜订单，第16位：京东极速版APP首购，第17位白条首购，第18位校园订单，例如：00000000000000000000000000000001:红包订单，00000000000000000000000000000010:组合推广订单，00000000000000000000000000000100:拼购订单，00000000000000000000000000011000:有效首购，00000000000000000000000000000111：红包+组合推广+拼购等） 注：一个订单同时使用礼金和红包，仅礼金位数为1，红包位数为0
    private Long popId;//商家ID
    private String ext1;//推客生成推广链接时传入的扩展字段（需要联系运营开放白名单才能拿到数据）。
    private String payMonth;//预估结算时间，订单完成后才会返回，格式：yyyyMMdd，默认：0。表示最新的预估结算日期。当payMonth为当前的未来时间时，表示该订单可结算；当payMonth为当前的过去时间时，表示该订单已结算
    private Long cpActId;//招商团活动id：当商品参加了招商团会有该值，为0时表示无活动
    private Integer unionRole;//站长角色：1 推客 2 团长
    private Double giftCouponOcsAmount;//礼金分摊金额：使用礼金的订单会有该值
    private String giftCouponKey;//礼金批次ID：使用礼金的订单会有该值
    private String balanceExt;//计佣扩展信息，表示结算月:每月实际佣金变化情况，格式：{20191020:10,20191120:-2}，订单完成后会有该值
    private String sign;//数据签名，用来核对出参数据是否被修改，入参fields中写入sign时返回
    private Double proPriceAmount;//价保赔付金额：订单申请价保或赔付的金额，实际计佣金额已经减去此金额，您无需处理
    private Long rid;//团长渠道ID，仅限招商团长管理渠道使用，团长开通权限后才可使用。
    private GoodsInfo goodsInfo;
    private CategoryInfo categoryInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getOrderEmt() {
        return orderEmt;
    }

    public void setOrderEmt(Integer orderEmt) {
        this.orderEmt = orderEmt;
    }

    public Integer getPlus() {
        return plus;
    }

    public void setPlus(Integer plus) {
        this.plus = plus;
    }

    public Long getUnionId() {
        return unionId;
    }

    public void setUnionId(Long unionId) {
        this.unionId = unionId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    public Integer getSkuReturnNum() {
        return skuReturnNum;
    }

    public void setSkuReturnNum(Integer skuReturnNum) {
        this.skuReturnNum = skuReturnNum;
    }

    public Integer getSkuFrozenNum() {
        return skuFrozenNum;
    }

    public void setSkuFrozenNum(Integer skuFrozenNum) {
        this.skuFrozenNum = skuFrozenNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Double getSubSideRate() {
        return subSideRate;
    }

    public void setSubSideRate(Double subSideRate) {
        this.subSideRate = subSideRate;
    }

    public Double getSubsidyRate() {
        return subsidyRate;
    }

    public void setSubsidyRate(Double subsidyRate) {
        this.subsidyRate = subsidyRate;
    }

    public Double getFinalRate() {
        return finalRate;
    }

    public void setFinalRate(Double finalRate) {
        this.finalRate = finalRate;
    }

    public Double getEstimateCosPrice() {
        return estimateCosPrice;
    }

    public void setEstimateCosPrice(Double estimateCosPrice) {
        this.estimateCosPrice = estimateCosPrice;
    }

    public Double getEstimateFee() {
        return estimateFee;
    }

    public void setEstimateFee(Double estimateFee) {
        this.estimateFee = estimateFee;
    }

    public Double getActualCosPrice() {
        return actualCosPrice;
    }

    public void setActualCosPrice(Double actualCosPrice) {
        this.actualCosPrice = actualCosPrice;
    }

    public Double getActualFee() {
        return actualFee;
    }

    public void setActualFee(Double actualFee) {
        this.actualFee = actualFee;
    }

    public Integer getValidCode() {
        return validCode;
    }

    public void setValidCode(Integer validCode) {
        this.validCode = validCode;
    }

    public Integer getTraceType() {
        return traceType;
    }

    public void setTraceType(Integer traceType) {
        this.traceType = traceType;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getUnionAlias() {
        return unionAlias;
    }

    public void setUnionAlias(String unionAlias) {
        this.unionAlias = unionAlias;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Long getCid1() {
        return cid1;
    }

    public void setCid1(Long cid1) {
        this.cid1 = cid1;
    }

    public Long getCid2() {
        return cid2;
    }

    public void setCid2(Long cid2) {
        this.cid2 = cid2;
    }

    public Long getCid3() {
        return cid3;
    }

    public void setCid3(Long cid3) {
        this.cid3 = cid3;
    }

    public String getSubUnionId() {
        return subUnionId;
    }

    public void setSubUnionId(String subUnionId) {
        this.subUnionId = subUnionId;
    }

    public String getUnionTag() {
        return unionTag;
    }

    public void setUnionTag(String unionTag) {
        this.unionTag = unionTag;
    }

    public Long getPopId() {
        return popId;
    }

    public void setPopId(Long popId) {
        this.popId = popId;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(String payMonth) {
        this.payMonth = payMonth;
    }

    public Long getCpActId() {
        return cpActId;
    }

    public void setCpActId(Long cpActId) {
        this.cpActId = cpActId;
    }

    public Integer getUnionRole() {
        return unionRole;
    }

    public void setUnionRole(Integer unionRole) {
        this.unionRole = unionRole;
    }

    public Double getGiftCouponOcsAmount() {
        return giftCouponOcsAmount;
    }

    public void setGiftCouponOcsAmount(Double giftCouponOcsAmount) {
        this.giftCouponOcsAmount = giftCouponOcsAmount;
    }

    public String getGiftCouponKey() {
        return giftCouponKey;
    }

    public void setGiftCouponKey(String giftCouponKey) {
        this.giftCouponKey = giftCouponKey;
    }

    public String getBalanceExt() {
        return balanceExt;
    }

    public void setBalanceExt(String balanceExt) {
        this.balanceExt = balanceExt;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Double getProPriceAmount() {
        return proPriceAmount;
    }

    public void setProPriceAmount(Double proPriceAmount) {
        this.proPriceAmount = proPriceAmount;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public GoodsInfo getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(GoodsInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public CategoryInfo getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(CategoryInfo categoryInfo) {
        this.categoryInfo = categoryInfo;
    }
}
