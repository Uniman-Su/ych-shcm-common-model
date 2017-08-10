package com.ych.shcm.o2o.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单发票
 * Created by mxp on 2017/7/11.
 */
public class OrderBill {

    /**
     * The Id.
     */
    private BigDecimal id;

    /**
     * 订单ID
     */
    private BigDecimal orderId;

    /**
     * 公司名
     */
    private String company;

    /**
     * 纳税人识别代码
     */
    private String taxNo;

    /**
     * 注册地址
     */
    private String companyAddr;

    /**
     * 注册电话
     */
    private String companyPhone;

    /**
     * 开户银行
     */
    private String bank;

    /**
     * 银行账户
     */
    private String bankAccount;

    /**
     * 配送地址
     */
    private String deliverAddr;

    /**
     * 联系人
     */
    private String ptc;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
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
     * @return 公司名
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company
     *         公司名
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return 纳税人识别代码
     */
    public String getTaxNo() {
        return taxNo;
    }

    /**
     * @param taxNo
     *         纳税人识别代码
     */
    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    /**
     * @return 注册地址
     */
    public String getCompanyAddr() {
        return companyAddr;
    }

    /**
     * @param companyAddr
     *         注册地址
     */
    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    /**
     * @return 公司电话
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * @param companyPhone
     *         公司名称
     */
    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    /**
     * @return 开户银行
     */
    public String getBank() {
        return bank;
    }

    /**
     * @param bank
     *         开户银行
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * @return 银行账户
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * @param bankAccount
     *         银行账户
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * @return 配送地址
     */
    public String getDeliverAddr() {
        return deliverAddr;
    }

    /**
     * @param deliverAddr
     *         配送地址
     */
    public void setDeliverAddr(String deliverAddr) {
        this.deliverAddr = deliverAddr;
    }

    /**
     * @return 联系人
     */
    public String getPtc() {
        return ptc;
    }

    /**
     * @param ptc
     *         联系人
     */
    public void setPtc(String ptc) {
        this.ptc = ptc;
    }

    /**
     * @return 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     *         联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     *         创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
