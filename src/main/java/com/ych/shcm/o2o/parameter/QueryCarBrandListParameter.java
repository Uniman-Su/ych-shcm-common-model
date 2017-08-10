package com.ych.shcm.o2o.parameter;

import com.ych.core.model.BasePaginableMultiSortableParameter;

/**
 * 查询车型品牌的参数
 * 
 * @author U
 *
 */
public class QueryCarBrandListParameter extends BasePaginableMultiSortableParameter {

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
