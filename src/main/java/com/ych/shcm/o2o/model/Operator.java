package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithCreateTime;
import com.ych.core.model.IWithModifier;

/**
 * 管理员信息
 * <p>
 * Created by U on 2017/7/11.
 */
public class Operator implements Serializable, IWithCreateTime, IWithModifier {

    private static final long serialVersionUID = -2259878014776817230L;

    /**
     * ID
     */
    private BigDecimal id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改者ID
     */
    private BigDecimal modifierId;

    /**
     * 修改时间
     */
    private Date modifyTime;

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
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     *         用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *         密码
     */
    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
