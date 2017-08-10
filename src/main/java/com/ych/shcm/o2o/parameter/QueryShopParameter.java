package com.ych.shcm.o2o.parameter;

import com.ych.core.model.BasePaginableSortableParameter;
import com.ych.shcm.o2o.model.Position;

import java.math.BigDecimal;
import java.util.List;

/**
 * 查询店铺的参数
 * <p>
 * Created by U on 2017/7/7.
 */
public class QueryShopParameter extends BasePaginableSortableParameter {

    /**
     * 地区编码列表
     */
    private List<String> areadCodes;

    /**
     * 名称
     */
    private String name;

    /**
     * 车辆品牌id
     */
    private BigDecimal brandId;

    /**
     * 订单ID
     */
    private BigDecimal orderId;

    /**
     * 最小经度
     */
    private Double minLongitude;

    /**
     * 最大经度
     */
    private Double maxLongitude;

    /**
     * 最小纬度
     */
    private Double minLatitude;

    /**
     * 最大纬度
     */
    private Double maxLatitude;

    /**
     * 查询距离的位置
     */
    private Position position;

    /**
     * @return 地区编码列表
     */
    public List<String> getAreadCodes() {
        return areadCodes;
    }

    /**
     * @param areadCodes
     *         地区编码列表
     */
    public void setAreadCodes(List<String> areadCodes) {
        this.areadCodes = areadCodes;
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
     * @return 车辆品牌id
     */
    public BigDecimal getBrandId() {
        return brandId;
    }

    /**
     * @param brandId
     *         车辆品牌id
     */
    public void setBrandId(BigDecimal brandId) {
        this.brandId = brandId;
    }

    /**
     * @return 最小经度
     */
    public Double getMinLongitude() {
        return minLongitude;
    }

    /**
     * @param minLongitude
     *         最小经度
     */
    public void setMinLongitude(Double minLongitude) {
        this.minLongitude = minLongitude;
    }

    /**
     * @return 最大经度
     */
    public Double getMaxLongitude() {
        return maxLongitude;
    }

    /**
     * @param maxLongitude
     *         最大经度
     */
    public void setMaxLongitude(Double maxLongitude) {
        this.maxLongitude = maxLongitude;
    }

    /**
     * @return 最小纬度
     */
    public Double getMinLatitude() {
        return minLatitude;
    }

    /**
     * @param minLatitude
     *         最小纬度
     */
    public void setMinLatitude(Double minLatitude) {
        this.minLatitude = minLatitude;
    }

    /**
     * @return 最大纬度
     */
    public Double getMaxLatitude() {
        return maxLatitude;
    }

    /**
     * @param maxLatitude
     *         最大纬度
     */
    public void setMaxLatitude(Double maxLatitude) {
        this.maxLatitude = maxLatitude;
    }

    /**
     * @return 查询距离的位置
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position
     *         查询距离的位置
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * @return 订单ID
     */
    public BigDecimal getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     *         订单ID
     */
    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }
}
