package com.ych.shcm.o2o.parameter;

import java.math.BigDecimal;

import com.ych.core.model.BasePaginableMultiSortableParameter;

/**
 * 查询车型制造厂家列表的参数
 * 
 * @author U
 *
 */
public class QueryCarFactoryListParameter extends BasePaginableMultiSortableParameter {

	/**
	 * 品牌ID
	 */
	private BigDecimal brandId;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 首字母
	 */
	private String firstChar;

	/**
	 * 是否可用
	 */
	private Boolean enabled;

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
	 * @return 是否可用
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled
	 *            是否可用
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
