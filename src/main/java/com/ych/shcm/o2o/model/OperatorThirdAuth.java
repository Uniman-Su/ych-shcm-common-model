package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithCreateTime;

/**
 * 管理员第三方系统认证信息
 * <p>
 * Created by U on 2017/8/07.
 */
public class OperatorThirdAuth implements Serializable, IWithCreateTime {

    private static final long serialVersionUID = 933891325751296387L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 操作员ID
     */
    private BigDecimal operatorId;

    /**
     * 第三方认证类型
     */
    private ThirdAuthType type;

    /**
     * 第三方ID
     */
    private String thirdId;

    /**
     * 创建时间
     */
    private Date createTime;

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
     * @return 操作员ID
     */
    public BigDecimal getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId
     *         操作员ID
     */
    public void setOperatorId(BigDecimal operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * @return 第三方认证类型
     */
    public ThirdAuthType getType() {
        return type;
    }

    /**
     * @param type
     *         第三方认证类型
     */
    public void setType(ThirdAuthType type) {
        this.type = type;
    }

    /**
     * @return 第三方ID
     */
    public String getThirdId() {
        return thirdId;
    }

    /**
     * @param thirdId
     *         第三方ID
     */
    public void setThirdId(String thirdId) {
        this.thirdId = thirdId;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
