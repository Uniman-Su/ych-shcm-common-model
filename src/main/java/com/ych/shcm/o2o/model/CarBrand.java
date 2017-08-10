package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithModifier;
import com.ych.core.util.CloneUtil;

/**
 * 车型品牌
 * 
 * @author U
 *
 */
public class CarBrand implements IWithModifier, Serializable, Cloneable {

	private static final long serialVersionUID = -208008922840814849L;

	/**
	 * ID
	 */
	private BigDecimal id;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 图标路径
	 */
	private String logoPath;

	/**
	 * 首字母
	 */
	private String firstChar;

	/**
	 * 是否启用
	 */
	private boolean enabled;

	/**
	 * 修改者ID
	 */
	private BigDecimal modifierId = BigDecimal.ZERO;

	/**
	 * 修改时间
	 */
	private Date modifyTime;
	
	/**
	 * 品牌的下的生产工厂
	 */
	private List<CarFactory> factories;

	/**
	 * @return ID
	 */
	public BigDecimal getId() {
		return id;
	}

	/**
	 * @param id
	 *            ID
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
	 *            名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return 图标路径
	 */
	public String getLogoPath() {
		return logoPath;
	}

	/**
	 * @param logoPath
	 *            图标路径
	 */
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	/**
	 * @return 首字母
	 */
	public String getFirstChar() {
		return firstChar;
	}

	/**
	 * @param firstChar
	 *            首字母
	 */
	public void setFirstChar(String firstChar) {
		this.firstChar = firstChar;
	}

	/**
	 * @return 是否启用
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled
	 *            是否启用
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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

	/**
	 * @return 品牌的下的生产工厂
	 */
	public List<CarFactory> getFactories() {
		return factories;
	}

	/**
	 * @param factories
	 *            品牌的下的生产工厂
	 */
	public void setFactories(List<CarFactory> factories) {
		this.factories = factories;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public CarBrand clone() throws CloneNotSupportedException {
		CarBrand that = (CarBrand) super.clone();
		that.factories = CloneUtil.cloneList(factories);
		return that;
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
