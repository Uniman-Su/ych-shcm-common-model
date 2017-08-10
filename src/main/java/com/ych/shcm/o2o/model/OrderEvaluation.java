package com.ych.shcm.o2o.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单评价
 * Created by mxp on 2017/7/11.
 */
public class OrderEvaluation {

    /**
     * The Id.
     */
    private BigDecimal id;

    /**
     * 订单ID
     */
    private BigDecimal orderId;

    /**
     * 技术能力
     */
    private BigDecimal skill;
    /**
     * 服务态度
     */
    private BigDecimal attitude;

    /**
     * 服务效率
     */
    private BigDecimal efficiency;

    /**
     * 店面环境
     */
    private BigDecimal environment;

    /**
     * 平均分
     */
    private BigDecimal average;

    /**
     * 总体评价,0:满意,1:不满意
     */
    private int overallEvaluation;

    /**
     * 评价内容
     */
    private String content;

    /**
     * 评价时间
     */
    private Date evaluateTime;

    /**
     * 订单
     */
    private Order order;

    /**
     * Gets id.
     *
     * @return the id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     *         the id
     */
    public void setId(BigDecimal id) {
        this.id = id;
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

    /**
     * @return 技术能力
     */
    public BigDecimal getSkill() {
        return skill;
    }

    /**
     * @param skill
     *         技术能力
     */
    public void setSkill(BigDecimal skill) {
        this.skill = skill;
    }

    /**
     * @return 服务态度
     */
    public BigDecimal getAttitude() {
        return attitude;
    }

    /**
     * @param attitude
     *         服务态度
     */
    public void setAttitude(BigDecimal attitude) {
        this.attitude = attitude;
    }

    /**
     * @return 服务效率
     */
    public BigDecimal getEfficiency() {
        return efficiency;
    }

    /**
     * @param efficiency
     *         服务效率
     */
    public void setEfficiency(BigDecimal efficiency) {
        this.efficiency = efficiency;
    }

    /**
     * @return 店面环境
     */
    public BigDecimal getEnvironment() {
        return environment;
    }

    /**
     * @param environment
     *         店面环境
     */
    public void setEnvironment(BigDecimal environment) {
        this.environment = environment;
    }

    /**
     * @return 平均分
     */
    public BigDecimal getAverage() {
        return average;
    }

    /**
     * @param average
     *         平均分
     */
    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    /**
     * @return 总体评价, 0:满意,1:不满意
     */
    public int getOverallEvaluation() {
        return overallEvaluation;
    }

    /**
     * @param overallEvaluation
     *         总体评价,0:满意,1:不满意
     */
    public void setOverallEvaluation(int overallEvaluation) {
        this.overallEvaluation = overallEvaluation;
    }

    /**
     * @return 评价内容
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     *         评价内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return 评价时间
     */
    public Date getEvaluateTime() {
        return evaluateTime;
    }

    /**
     * @param evaluateTime
     *         评价时间
     */
    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    /**
     * @return 订单
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order
     *         订单
     */
    public void setOrder(Order order) {
        this.order = order;
    }
}
