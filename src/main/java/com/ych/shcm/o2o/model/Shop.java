package com.ych.shcm.o2o.model;

import com.ych.core.model.IWithModifier;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 店铺
 * <p>
 * Created by U on 2017/7/6.
 */
public class Shop implements Serializable, IWithModifier {

    private static final long serialVersionUID = -4794569408018869428L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 名称
     */
    private String name;

    /**
     * 地区ID
     */
    private String areaId;

    /**
     * 明细地址
     */
    private String address;

    /**
     * 电话
     */
    private String phone;

    /**
     * 联系人
     */
    private String personToContact;

    /**
     * 状态
     */
    private ShopStatus status;

    /**
     * 平均分数
     */
    private double averageScore;

    /**
     * 评价数
     */
    private int evaluationCount;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 坐标系
     */
    private CoordinateType coordinateType;

    /**
     * 列表图片路径
     */
    private String imagePath;

    /**
     * 详细描述
     */
    private String desc;

    /**
     * 壹号源用户ID
     */
    private BigDecimal soneUserId;

    /**
     * 修改者ID
     */
    private BigDecimal modifierId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 图片
     */
    private List<ShopImage> images;

    /**
     * 到指定点的距离,单位:米
     */
    transient private Long distance;

    /**
     * 门店与车辆品牌关联
     */
    private ShopCarBrand shopCarBrand;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     *         ID
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return 名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 地区ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * @param areaId
     *         地区ID
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * @return 明细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     *         明细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     *         电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return 联系人
     */
    public String getPersonToContact() {
        return personToContact;
    }

    /**
     * @param personToContact
     *         联系人
     */
    public void setPersonToContact(String personToContact) {
        this.personToContact = personToContact;
    }

    /**
     * @return 状态
     */
    public ShopStatus getStatus() {
        return status;
    }

    /**
     * @param status
     *         状态
     */
    public void setStatus(ShopStatus status) {
        this.status = status;
    }

    /**
     * @return 平均分数
     */
    public double getAverageScore() {
        return averageScore;
    }

    /**
     * @param averageScore
     *         平均分数
     */
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    /**
     * @return 评价数
     */
    public int getEvaluationCount() {
        return evaluationCount;
    }

    /**
     * @param evaluationCount
     *         评价数
     */
    public void setEvaluationCount(int evaluationCount) {
        this.evaluationCount = evaluationCount;
    }

    /**
     * @return 经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     *         经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     *         纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return 坐标系
     */
    public CoordinateType getCoordinateType() {
        return coordinateType;
    }

    /**
     * @param coordinateType
     *         坐标系
     */
    public void setCoordinateType(CoordinateType coordinateType) {
        this.coordinateType = coordinateType;
    }

    /**
     * @return 列表图片路径
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath
     *         列表图片路径
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * @return 详细描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc
     *         详细描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return 壹号源用户ID
     */
    public BigDecimal getSoneUserId() {
        return soneUserId;
    }

    /**
     * @param soneUserId
     *         壹号源用户ID
     */
    public void setSoneUserId(BigDecimal soneUserId) {
        this.soneUserId = soneUserId;
    }

    @Override
    public BigDecimal getModifierId() {
        return modifierId;
    }

    @Override
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    @Override
    public Date getModifyTime() {
        return modifyTime;
    }

    @Override
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return 图片
     */
    public List<ShopImage> getImages() {
        return images;
    }

    /**
     * @param images
     *         图片
     */
    public void setImages(List<ShopImage> images) {
        this.images = images;
    }

    /**
     * @return 到指定点的距离, 单位:米
     */
    public Long getDistance() {
        return distance;
    }

    /**
     * @param distance
     *         到指定点的距离,单位:米
     */
    public void setDistance(Long distance) {
        this.distance = distance;
    }

    /**
     * @return 门店与车辆品牌关联
     */
    public ShopCarBrand getShopCarBrand() {
        return shopCarBrand;
    }

    /**
     * @param shopCarBrand
     *         门店与车辆品牌关联
     */
    public void setShopCarBrand(ShopCarBrand shopCarBrand) {
        this.shopCarBrand = shopCarBrand;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
