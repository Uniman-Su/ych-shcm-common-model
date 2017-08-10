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
 * 车系年份
 * 
 * @author U
 *
 */
public class CarSeriesYear implements IWithModifier, Cloneable, Serializable, Comparable<CarSeriesYear> {

	private static final long serialVersionUID = -7433289488168456484L;

	/**
	 * ID
	 */
	private BigDecimal id;

	/**
	 * 车系ID
	 */
	private BigDecimal seriesId;

	/**
	 * 年份
	 */
	private int year;

	/**
	 * 名称
	 */
	private String name;

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
	 * 车型列表
	 */
	private List<CarModel> models;

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
	 * @return 车系ID
	 */
	public BigDecimal getSeriesId() {
		return seriesId;
	}

	/**
	 * @param seriesId
	 *            车系ID
	 */
	public void setSeriesId(BigDecimal seriesId) {
		this.seriesId = seriesId;
	}

	/**
	 * @return 年份
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            年份
	 */
	public void setYear(int year) {
		this.year = year;
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
	 * @return 车型列表
	 */
	public List<CarModel> getModels() {
		return models;
	}

	/**
	 * @param models
	 *            车型列表
	 */
	public void setModels(List<CarModel> models) {
		this.models = models;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public CarSeriesYear clone() throws CloneNotSupportedException {
		CarSeriesYear that = (CarSeriesYear) super.clone();
		that.models = CloneUtil.cloneList(models);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(CarSeriesYear o) {
		if (o == null) {
			return 1;
		}

		return year - o.year;
	}

}
