package com.ych.shcm.o2o.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ych.core.model.IWithModifier;
import com.ych.core.util.CloneUtil;

/**
 * 车系
 * 
 * @author U
 *
 */
public class CarSeries implements IWithModifier, Cloneable, Serializable {

	private static final long serialVersionUID = 2906080940549633102L;

	/**
	 * ID
	 */
	private BigDecimal id;

	/**
	 * 品牌ID
	 */
	private BigDecimal brandId;

	/**
	 * 制造厂家ID
	 */
	private BigDecimal factoryId;

	/**
	 * 名称
	 */
	private String name;

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
	 * 车型品牌
	 */
	private CarBrand carBrand;

    /**
     * 车型厂家
     */
	private CarFactory carFactory;
	
	/**
	 * 车系年份
	 */
	private List<CarSeriesYear> years;

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
	 * @return 制造厂家ID
	 */
	public BigDecimal getFactoryId() {
		return factoryId;
	}

	/**
	 * @param factoryId
	 *            制造厂家ID
	 */
	public void setFactoryId(BigDecimal factoryId) {
		this.factoryId = factoryId;
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
	 * @return 车型品牌
	 */
	public CarBrand getCarBrand() {
		return carBrand;
	}

	/**
	 * @param carBrand
	 *            车型品牌
	 */
	public void setCarBrand(CarBrand carBrand) {
		this.carBrand = carBrand;
	}

    /**
     *
     * @return 车型厂家
     */
    public CarFactory getCarFactory() {
        return carFactory;
    }

    /**
     *
     * @param carFactory 车型厂家
     */
    public void setCarFactory(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    /**
	 * @return 车系年份
	 */
	public List<CarSeriesYear> getYears() {
		return years;
	}

	/**
	 * @param years
	 *            车系年份
	 */
	public void setYears(List<CarSeriesYear> years) {
		this.years = years;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public CarSeries clone() throws CloneNotSupportedException {
		CarSeries that = (CarSeries) super.clone();
		
		that.carBrand = ObjectUtils.clone(carBrand);
		that.carFactory = ObjectUtils.clone(carFactory);
		that.years = CloneUtil.cloneList(years);
		
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
