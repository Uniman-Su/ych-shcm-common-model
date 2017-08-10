package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithModifier;

/**
 * 车型品牌对制造厂关系
 * 
 * @author U
 *
 */
public class CarBrandFactory implements IWithModifier, Serializable {

	private static final long serialVersionUID = 7915725282022644677L;
	
	/**
	 * 品牌ID
	 */
	private BigDecimal brandId;

	/**
	 * 工厂ID
	 */
	private BigDecimal factoryId;

	/**
	 * 修改者ID
	 */
	private BigDecimal modifierId = BigDecimal.ZERO;

	/**
	 * 修改时间
	 */
	private Date modifyTime;

	/**
	 * @return 品牌ID
	 */
	public BigDecimal getBrandId() {
		return brandId;
	}

	/**
	 * @param brandId
	 *            品牌ID
	 */
	public void setBrandId(BigDecimal brandId) {
		this.brandId = brandId;
	}

	/**
	 * @return 工厂ID
	 */
	public BigDecimal getFactoryId() {
		return factoryId;
	}

	/**
	 * @param factoryId
	 *            工厂ID
	 */
	public void setFactoryId(BigDecimal factoryId) {
		this.factoryId = factoryId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ych.core.model.IWithModifier#getModifierId()
	 */
	@Override
	public BigDecimal getModifierId() {
		return modifierId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ych.core.model.IWithModifier#setModifierId(java.math.BigDecimal)
	 */
	@Override
	public void setModifierId(BigDecimal modifierId) {
		this.modifierId = modifierId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ych.core.model.IWithModifier#getModifyTime()
	 */
	@Override
	public Date getModifyTime() {
		return modifyTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ych.core.model.IWithModifier#setModifyTime(java.util.Date)
	 */
	@Override
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public CarBrandFactory clone() throws CloneNotSupportedException {
		return (CarBrandFactory) super.clone();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
